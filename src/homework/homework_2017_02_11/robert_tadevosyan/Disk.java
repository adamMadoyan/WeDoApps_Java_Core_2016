package homework.homework_2017_02_11.robert_tadevosyan;

import java.awt.*;

/**
 * Created by Robert on 04.02.2017.
 */
public class Disk extends Figure {

    public Disk() {
        super();
    }

    public Disk( int x, int y, int width, int height) {
        super( x, y, width, height);
    }

    public Disk(int x, int y, int width, int height, Color color) {
        super( x, y, width, height, color);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillOval(getX(),getY(),getWidth(),getHeight());
    }

    @Override
    public boolean isBelong(int x, int y) {
        return x > this.getX() && x < this.getX() + this.getWidth()
                && y > this.getY() && y < this.getY() + this.getHeight();
    }
}
