package homework.homework_2017_02_11.robert_tadevosyan;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class FigureCanvas extends JPanel {

    static int disksCount = 15;
    public static final int POINT = 20;
    public static final int firstX = 2 * POINT;
    public static final int secondX = disksCount * POINT + 5 * (POINT + 2);
    public static final int thirdX = 2 * disksCount * POINT + 9 * POINT;
    public static final int COLUMN_LARGE_WIDTH = disksCount * POINT;

    private Peg firstPeg;
    private Peg secondPeg;
    private Peg thirdPeg;

    public static final int xSize = 1500;
    public static final int ySize = 1000;
    private Random rand = new Random();


    public Peg getFirstPeg() {
        return firstPeg;
    }

    public Peg getSecondPeg() {
        return secondPeg;
    }

    public Peg getThirdPeg() {
        return thirdPeg;
    }

    public FigureCanvas() {
        firstPeg = new Peg("First", firstX, ySize / 2, COLUMN_LARGE_WIDTH + POINT, POINT, 1);
        secondPeg = new Peg("Second", secondX, ySize / 2, COLUMN_LARGE_WIDTH + POINT, POINT,2);
        thirdPeg = new Peg("Third", thirdX, ySize / 2, COLUMN_LARGE_WIDTH + POINT, POINT, 3);
        createDisks();
        setVisible(true);
    }

    public void add(Disk figure) {
//        firstColumnDisks.add(figure);
        repaint();
    }


    private void createDisks() {
        for (int i = 0; i < disksCount; i++) {
            Disk d = new Disk();
            d.setColor(new Color(rand.nextInt(200 + 55), rand.nextInt(200 + 55), rand.nextInt(200 + 55)));
            firstPeg.addDiskToColumn(d);
            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {
        g.clearRect(0, 0, 2000, 2000);
        firstPeg.draw(g);
        secondPeg.draw(g);
        thirdPeg.draw(g);
    }

    public void move() {
        move(disksCount, firstPeg, secondPeg, thirdPeg);
    }

    private void move(int n, Peg first, Peg second, Peg third) {
//        if (first.getDiskList().isEmpty()) {
//            return;
//        }
        if (n == 1) {
            third.addDiskToColumn(first.getDiskList().remove(first.getDiskList().size() - 1));
            repaint();
            System.out.println(first.getName() + " >> " + third.getName());
            return;
        }
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        move(n - 1, first, third, second);
        if (first.getDiskList().isEmpty()) {
            return;
        }
        third.addDiskToColumn(first.getDiskList().remove(first.getDiskList().size() - 1));
        repaint();
        System.out.println(first.getName() + " >> " + third.getName());
        move(n - 1, second, first, third);
    }
}