package homework.homework_2017_01_21.rob_tadevosyan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Random;

public abstract class Figure extends Observable implements ActionListener {

    public static final int DEFAULT_X = 5;
    public static final int DEFAULT_Y = 10;
    public static final int DEFAULT_WIDTH = 14;
    public static final int DEFAULT_HEIGHT = 8;
    public static final Color DEFAULT_COLOR = Color.CYAN;

    private EnemiesInterface enemiesInterface;
    protected volatile int x;
    protected volatile int y;
    protected volatile int width;
    protected volatile int height;
    private Color color;
    private boolean isEnemy = true;
    private Timer timer;
    private Random random;
    private int moveByX;
    private int moveByY;

    public Figure(EnemiesInterface enemiesInterface) {
        this(enemiesInterface, DEFAULT_X, DEFAULT_Y, DEFAULT_WIDTH, DEFAULT_HEIGHT, DEFAULT_COLOR);
    }

    public Figure(EnemiesInterface enemiesInterface, int x, int y, int width, int height) {
        this(enemiesInterface, x, y, width, height, DEFAULT_COLOR);
    }

    public Figure(EnemiesInterface enemiesInterface, int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        this.enemiesInterface = enemiesInterface;
        timer = new javax.swing.Timer(25, this);
        random = new Random();
        moveByX = random.nextInt(2) + 1;
        moveByY = random.nextInt(2) + 1;
    }

    public abstract void draw(Graphics g);

    public abstract boolean isBelong(int x, int y);


    public Timer getTimer() {
        return timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    public EnemiesInterface getEnemiesInterface() {
        return enemiesInterface;
    }

    public boolean isEnemy() {
        return isEnemy;
    }

    public void setEnemy(boolean enemy) {
        isEnemy = enemy;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x < 0) {
            System.out.println("X coordinate can not be negative !!!!!! " + x);
            return;
        }
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

    public void move(int sX, int sY) {
        if (!isEnemy) {
            x += sX;
            y += sY;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (isEnemy) {
            if (x < 1 || x > 500 - width - 5) {
                moveByX = -moveByX;
            }
            if (y < 1 || y > 500 - height - 60) {
                moveByY = -moveByY;
            }
            x += moveByX;
            y += moveByY;
            ((FigureFrame) enemiesInterface).repaint();
            setChanged();
            notifyObservers();
        }
    }

}
