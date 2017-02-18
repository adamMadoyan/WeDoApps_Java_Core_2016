package auditorium.hanoitower;

import auditorium.figure.Figure;

import javax.swing.*;
import java.awt.*;

public class Disk extends Figure {

    public static final int MIN_WIDTH = 17;

    public Disk(int x, int y, int width, int height, Color color, JPanel canvas) {
        super(x, y, width, height, color, canvas);
    }

    public Disk(int x, int y, int width, int height, JPanel canvas) {
        super(x, y, width, height, canvas);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillOval(getX(),getY(),getWidth(),getHeight());
    }

    @Override
    public boolean isBelong(int x, int y) {
        return false;
    }
}
