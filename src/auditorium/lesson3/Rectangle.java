package auditorium.lesson3;

import java.awt.*;

public class Rectangle extends Figure {

    public static final int DEFAULT_X = 5;
    public static final int DEFAULT_Y = 10;
    public static final int DEFAULT_WIDTH = 14;
    public static final int DEFAULT_HEIGHT = 8;
    public static final Color DEFAULT_COLOR = Color.GREEN;

    public Rectangle() {
        super(DEFAULT_X, DEFAULT_Y, DEFAULT_WIDTH, DEFAULT_HEIGHT, DEFAULT_COLOR);
    }

    public Rectangle(int x, int y, int width, int height) {
        super(x, y, width, height, DEFAULT_COLOR);
    }

    public Rectangle(int x, int y, int width, int height, Color color) {
        super(x, y, width, height, color);
    }

    @Override
    public void draw() {

    }

    @Override
    public boolean isBelong(int x, int y) {
        return x > this.getX() && x < this.getX() + this.getWidth()
                && y > this.getY() && y < this.getY() + this.getHeight();
    }

    @Override
    public String toString() {
        return "x =" + getX() + ",  y = " + getY();
    }
}
