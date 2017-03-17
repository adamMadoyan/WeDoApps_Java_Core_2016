package homework.homework_2017_02_11.zaven_madoyan.hanoAshtarak;

import java.awt.*;

public abstract class HanoFigure{

    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;
    private HanoCanvas hanoCanvas;

    public HanoFigure(int x, int y, int width, int height,HanoCanvas hanoCanvas) {
        this(x, y, width, height, Color.BLUE,hanoCanvas);
    }

    public HanoFigure(int x, int y, int width, int height, Color color,HanoCanvas hanoCanvas) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        this.hanoCanvas=hanoCanvas;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void move(int dX, int dY) {
        this.x += dX;
        this.y += dY;
    }

    public abstract void draw(Graphics g);

    public abstract boolean isBelong(int x, int y);

}

