package auditorium.figure;

import java.awt.*;

public abstract class Figure implements Runnable {

    public static final int DEFAULT_X = 5;
    public static final int DEFAULT_Y = 10;
    public static final int DEFAULT_WIDTH = 14;
    public static final int DEFAULT_HEIGHT = 8;
    public static final Color DEFAULT_COLOR = Color.CYAN;

    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected Color color;
    private FigureCanvas canvas;

    private Thread t;
    private int sX;
    private int sY;
    private boolean isRunning;

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

    public abstract void draw(Graphics g);

    public abstract boolean isBelong(int x, int y);

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x < 0) {
            System.out.println("X coordinate can not be negative !!!!!! " + x);
            return;
        }
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void move(int sX, int sY) {
        x += sX;
        y += sY;
    }

    public void start() {
        sX = 1;
        sY = 1;
        isRunning = true;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        while (isRunning) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            move(sX, sY);
            canvas.repaint();
        }
    }
}
