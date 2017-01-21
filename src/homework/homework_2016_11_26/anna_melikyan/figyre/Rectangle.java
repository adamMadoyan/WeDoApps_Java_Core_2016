package homework.homework_2016_11_26.anna_melikyan.figyre;

import java.awt.*;

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
        return x > this.getX() && x < this.getX() + this.getWidth()
                && y > this.getY() && y < this.getY() + this.getHeight();
    }
}
