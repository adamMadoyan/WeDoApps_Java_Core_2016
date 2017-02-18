package auditorium.figure;

import java.awt.*;

public class Circle extends Figure {

    public Circle(FigureCanvas canvas) {
        super(DEFAULT_X, DEFAULT_Y, DEFAULT_WIDTH, DEFAULT_WIDTH, canvas);
    }

    public Circle(int x, int y, int diameter, FigureCanvas canvas) {
        super(x, y, diameter, diameter, DEFAULT_COLOR, canvas);
    }

    public Circle(int x, int y, int diameter, Color color, FigureCanvas canvas) {
        super(x, y, diameter, diameter, color, canvas);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillOval(getX(), getY(), getWidth(), getHeight());
    }

    @Override
    public boolean isBelong(int x, int y) {
        return Math.pow(getWidth() / 2, 2) >= Math.pow(x - (getX() + getWidth() / 2), 2) + Math.pow(y - (getY() + getHeight() / 2), 2);
    }
}