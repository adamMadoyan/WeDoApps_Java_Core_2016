package robert_tadevosyan;

import java.awt.*;

/**
 * Created by mactrainonetraining on 1/28/17.
 */
public class Circle extends Figure {
    public static final int DEFAULT_RADIUS = 100;

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
    public void draw(Graphics graphics) {
        graphics.setColor(getColor());
        graphics.fillOval(getX(),getY(),getWidth(),getHeight());
    }

    @Override
    public boolean isBelong(int mX, int mY) {
        return Math.pow(mX - (getX() + getWidth()/2),2) + Math.pow(mY - (getY() + getHeight()/2),2) <= Math.pow(getWidth()/2,2);
    }

}
