package myHomeworks.figurs_by_jframe;

import java.awt.*;

/**
 * Created by Arthur on 24.11.2016.
 */
public class Rectangle extends Figure {

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
    public void draw(Graphics g) {
        g.fillRect(getX(), getY(), getWidth(), getHeight());
        g.setColor(getColor());
    }

    @Override
    public boolean isBelong(int x, int y) {
        return false;
    }
}
