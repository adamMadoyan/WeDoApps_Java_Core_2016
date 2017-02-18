package auditorium.figure;

import javax.swing.*;
import java.awt.*;

public abstract class Figure implements Runnable {

    public static final int DEFAULT_X = 5;
    public static final int DEFAULT_Y = 10;
    public static final int DEFAULT_WIDTH = 14;
    public static final int DEFAULT_HEIGHT = 8;
    public static final Color DEFAULT_COLOR = Color.CYAN;

    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;
    private JPanel canvas;

    private Thread t;
    private int sX;
    private int sY;
    private boolean isRunning;
    private boolean isPaused;

    public Figure(JPanel canvas) {
        this(DEFAULT_X, DEFAULT_Y, DEFAULT_WIDTH, DEFAULT_HEIGHT, DEFAULT_COLOR, canvas);
    }

    public Figure(int x, int y, int width, int height, JPanel canvas) {
        this(x, y, width, height, DEFAULT_COLOR, canvas);
    }

    public Figure(int x, int y, int width, int height, Color color, JPanel canvas) {
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
        if(isRunning) {
            return;
        }
        sX = 3;
        sY = 3;
        isRunning = true;
        isPaused = false;
        t = new Thread(this);
        t.start();

    }

    @Override
    public void run() {
        while (isRunning) {
            move(sX, sY);
            if (isPaused) {
                synchronized (this) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            canvas.repaint();
        }
    }

    public void pause() {
        if (isRunning) {
            isPaused = true;
        }
    }

    public synchronized void resume() {
        if (isPaused) {
            isPaused = false;
            notify();
        }
    }

    public void stop() {
        isRunning = false;
    }

}
