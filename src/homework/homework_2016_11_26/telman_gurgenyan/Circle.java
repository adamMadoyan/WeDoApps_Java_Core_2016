package homework_16_11_26;

import java.awt.*;

public class Circle extends Figure {

    public Circle() {
        super(DEFAULT_X, DEFAULT_Y, DEFAULT_WIDTH, DEFAULT_WIDTH);
    }

    public Circle(int x, int y, int diameter) {
        super(x, y, diameter, diameter, DEFAULT_COLOR);
    }

    public Circle(int x, int y, int diameter, Color color) {
        super(x, y, diameter, diameter, color);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillOval(getX(), getY(), getWidth(), getHeight());
    }

    @Override
    public boolean isBelong(int x, int y) {
        return false;
    }
}
