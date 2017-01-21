package homework.homework_2016_12_03.anna_melikyan.figyre;

import java.awt.*;

public abstract class Figure {

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

    public Figure() {
        this(DEFAULT_X, DEFAULT_Y, DEFAULT_WIDTH, DEFAULT_HEIGHT, DEFAULT_COLOR);
    }

    public Figure(int x, int y, int width, int height) {
        this(x, y, width, height, DEFAULT_COLOR);
    }

    public Figure(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
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


}
