package homework.homework_2017_02_11.zaven_madoyan.hanoAshtarak;

import java.awt.*;

public class Rectangle extends HanoFigure{

    public Rectangle(int x, int y, int width, int height, Color color,HanoCanvas hanoCanvas) {
        super(x, y, width, height, color,hanoCanvas);
    }

    public Rectangle(int x, int y, int width, int height,HanoCanvas hanoCanvas) {
        this(x, y, width, height, Color.darkGray,hanoCanvas);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getX(), getY(), getWidth(), getHeight());
    }

    @Override
    public boolean isBelong(int x, int y) {

        return x >= getX() && x <= getX()
                + getWidth() && y >= getY() && y <= getY() + getHeight();
    }

}
