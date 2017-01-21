package homework.homework_2017_01_21.rob_tadevosyan;

import java.awt.*;


public class Circle extends Figure {

    public Circle(EnemiesInterface enemiesInterface) {
        super(enemiesInterface, DEFAULT_X, DEFAULT_Y, DEFAULT_WIDTH, DEFAULT_WIDTH);
    }

    @Override
    public void draw(java.awt.Graphics g) {
        g.setColor(getColor());
        g.fillOval(getX(), getY(), getWidth(), getHeight());
    }

    public Circle(EnemiesInterface enemiesInterface, int x, int y, int diameter) {
        super(enemiesInterface, x, y, diameter, diameter, DEFAULT_COLOR);
    }

    public Circle(EnemiesInterface enemiesInterface, int x, int y, int diameter, Color color) {
        super(enemiesInterface, x, y, diameter, diameter, color);
    }


    @Override
    public boolean isBelong(int x, int y) {
        return Math.pow(width / 2, 2) >= Math.pow(x - (this.x + this.width / 2), 2) + Math.pow(y - (this.y + this.height / 2), 2);
    }
}