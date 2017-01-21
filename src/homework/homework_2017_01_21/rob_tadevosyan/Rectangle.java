package homework.homework_2017_01_21.rob_tadevosyan;

import java.awt.*;

public class Rectangle extends Figure {

    public Rectangle(EnemiesInterface enemiesInterface) {
        super(enemiesInterface,DEFAULT_X, DEFAULT_Y, DEFAULT_WIDTH, DEFAULT_HEIGHT, DEFAULT_COLOR);
    }

    public Rectangle(EnemiesInterface enemiesInterface,int x, int y, int width, int height) {
        super(enemiesInterface,x, y, width, height, DEFAULT_COLOR);
    }

    public Rectangle(EnemiesInterface enemiesInterface,int x, int y, int width, int height, Color color) {
        super(enemiesInterface,x, y, width, height, color);
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