package auditorium.hanoitower;


import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class HanoiCanvas extends JPanel {

    private Peg firstPeg;
    private Peg secondPeg;
    private Peg thirdPeg;
    private int count;
    private int distance = 3;

    public HanoiCanvas() {
        firstPeg = new Peg(50, 500, 150, 150, this);
        secondPeg = new Peg(225, 500, 150, 150, this);
        thirdPeg = new Peg(400, 500, 150, 150, this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.clearRect(0, 0, 1000, 1000);
        firstPeg.draw(g);
        secondPeg.draw(g);
        thirdPeg.draw(g);
    }

    public void load(int count) {
        this.count = count;
        Random random = new Random();
        for (int i = 1; i <= count; i++) {
            int descSize = (firstPeg.getWidth() - Disk.MIN_WIDTH) / count;
            int diskHeight = 12;
            // TODO check Peg size
            Disk disk = new Disk(firstPeg.getX() + i * descSize / 2,
                    firstPeg.getStandY() - (i * diskHeight + i * distance),
                    firstPeg.getWidth() - (i * descSize),
                    diskHeight,
                    new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)),
                    this
            );
            firstPeg.addDisk(disk);
        }
        repaint();
    }

    public void play() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                move(count, firstPeg, secondPeg, thirdPeg);
            }
        }).start();
    }

    private void move(int n, Peg first, Peg second, Peg third) {
        if (n == 1) {
            Disk disk = first.getLastDisk();
            moveTo(first, third, disk);
            third.addDisk(disk);
            first.removeDisk();
            return;
        }
        move(n - 1, first, third, second);
        Disk disk = first.getLastDisk();
        moveTo(first, third, disk);
        third.addDisk(disk);
        first.removeDisk();
        move(n - 1, second, first, third);

    }

    private void moveUp(Peg from, Disk disk) {
        while (disk.getY() + disk.getHeight() > from.getY()) {
            disk.move(0, -1);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            repaint();
        }
    }

    private void moveDown(Peg to, Disk disk) {
        Disk lastDisk = to.getLastDisk();
        int lastDiskY;
        if (null == lastDisk) {
            lastDiskY = to.getStandY();
        } else {
            lastDiskY = lastDisk.getY();
        }
        lastDiskY -= distance;


        while (disk.getY() + disk.getHeight() < lastDiskY) {
            disk.move(0, 1);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            repaint();
        }

    }

    private void moveTo(Peg from, Peg to, Disk disk) {
        moveUp(from, disk);
        int sX;
        if (from.getX() < to.getX()) {
            sX = 1;
        } else {
            sX = -1;
        }
        int pegCenter = to.getPegStandCenterX();
        while (disk.getX() + disk.getWidth() / 2 != pegCenter) {
            disk.move(sX, 0);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            repaint();
        }
        moveDown(to, disk);
    }
}
