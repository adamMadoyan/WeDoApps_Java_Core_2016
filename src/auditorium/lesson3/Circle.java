package auditorium.lesson3;

import java.awt.*;

public class Circle extends Figure {

    public static final int DEFAULT_X = 5;
    public static final int DEFAULT_Y = 10;
    public static final int DEFAULT_DIAMETER = 14;
    public static final Color DEFAULT_COLOR = Color.YELLOW;

    public Circle() {
        super(DEFAULT_X, DEFAULT_Y, DEFAULT_DIAMETER, DEFAULT_DIAMETER);
    }

    public Circle(int x, int y, int diameter) {
        super(x, y, diameter, diameter, DEFAULT_COLOR);
    }

    public Circle(int x, int y, int diameter, Color color) {
        super(x, y, diameter, diameter, color);
    }

    @Override
    public void draw() {

    }

    @Override
    public boolean isBelong(int x, int y) {
        return false;
    }
}
