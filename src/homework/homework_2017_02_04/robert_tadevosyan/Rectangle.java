package robert_tadevosyan;

import java.awt.*;

/**
 * Created by mactrainonetraining on 1/28/17.
 */
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
    public void draw(Graphics graphics) {
        graphics.setColor(getColor());
        graphics.fillRect(getX(),getY(),getWidth(),getHeight());
    }

    @Override
    public boolean isBelong(int mX, int mY) {
        return mX >= getX() && mX <= getX() + getWidth() && mY >= getY() && mY <= getY() + getHeight();
    }

}
