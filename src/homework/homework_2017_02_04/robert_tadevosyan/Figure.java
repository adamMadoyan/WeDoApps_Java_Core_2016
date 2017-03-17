package robert_tadevosyan;

import java.awt.*;

/**
 * Created by mactrainonetraining on 1/28/17.
 */
public abstract class Figure  implements Runnable{
    public static final int DEFAULT_X = 10;
    public static final int DEFAULT_Y = 10;
    public static final int DEFAULT_WIDTH = 100;
    public static final int DEFAULT_HEIGHT = 100;
    public static final Color DEFAULT_COLOR = Color.BLUE;
    public static final String WARNING_TEXT = "The initial value can not be signed or zero";

    private int x;
    private int y;
    private volatile int sX;
    private volatile int sY;
    private int width;
    private int height;
    private Color color;
    private volatile boolean isRunning = false;
    private Thread backgroundThread;
    private FigureCanvas canvas;

    public Figure(FigureCanvas canvas) {
        this(DEFAULT_X, DEFAULT_Y, DEFAULT_WIDTH, DEFAULT_HEIGHT, DEFAULT_COLOR, canvas);
    }

    public Figure(int x, int y, int width, int height, FigureCanvas canvas) {
        this(x, y, width, height, DEFAULT_COLOR, canvas);
    }

    public Figure(int x, int y, int width, int height, Color color, FigureCanvas canvas) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        this.canvas = canvas;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if(x <= 0){
            System.out.println(WARNING_TEXT);
            return;
        }
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if(y <= 0){
            System.out.println(WARNING_TEXT);
            return;
        }
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if(width <= 0){
            System.out.println(WARNING_TEXT);
            return;
        }
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if(height <= 0){
            System.out.println(WARNING_TEXT);
            return;
        }
        this.height = height;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void move(int moveX, int moveY){
        x += moveX;
        y += moveY;
    }

    public void moveRundom(){
        if(x <= FigureFrame.BORDER_WIDTH || x + width >= FigureFrame.WIDTH - FigureFrame.BORDER_WIDTH){
            sX = -sX;
        }
        if(y <= FigureFrame.BORDER_WIDTH || y + height >= FigureFrame.HEIGHT - 1.5 *FigureFrame.BORDER_WIDTH){
            sY = -sY;
        }
        x += sX;
        y += sY;
    }

    public void start() {
        sX = 1;
        sY = 1;
        isRunning = true;
        backgroundThread = new Thread(this);
        backgroundThread.start();
    }

    public void stop(){
        isRunning = false;
        try {
            backgroundThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (isRunning) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            moveRundom();
            canvas.repaint();
        }
    }


    public abstract void draw(Graphics graphics);

    public abstract boolean isBelong(int mX,int mY);
}
