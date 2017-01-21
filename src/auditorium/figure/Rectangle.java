package auditorium.figure;

import java.awt.*;

public class Rectangle extends Figure {

    public Rectangle(FigureCanvas canvas) {
        super(DEFAULT_X, DEFAULT_Y, DEFAULT_WIDTH, DEFAULT_HEIGHT, DEFAULT_COLOR, canvas);
    }

    public Rectangle(int x, int y, int width, int height, FigureCanvas canvas) {
        super(x, y, width, height, DEFAULT_COLOR, canvas);
    }

    public Rectangle(int x, int y, int width, int height, Color color, FigureCanvas canvas) {
        super(x, y, width, height, color, canvas);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getX(), getY(), getWidth(), getHeight());
    }

    @Override
    public boolean isBelong(int x, int y) {
        return x > this.getX() && x < this.getX() + this.getWidth()
                && y > this.getY() && y < this.getY() + this.getHeight();
    }
}
