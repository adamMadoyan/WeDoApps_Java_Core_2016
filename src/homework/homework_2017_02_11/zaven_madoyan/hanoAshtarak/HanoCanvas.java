package homework.homework_2017_02_11.zaven_madoyan.hanoAshtarak;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class HanoCanvas extends JPanel implements Runnable {

   public Tower first = new Tower(30, 170, this,new Color(0xFF1D0E));
   public Tower middle = new Tower(first.getX() + first.getHorizontalWidth() + 30, 170, this,new Color(0x0000FA));
   public Tower end = new Tower(middle.getX() + middle.getHorizontalWidth() + 30, 170, this,new Color(0xFAB232));

    private boolean isStarted = false;
    private boolean isSelected = false;
    private Tower selected;
    HanoFigure firstFigure;

    int mX;
    int mY;

    private Thread t;

    public HanoCanvas() {
        setBackground(Color.CYAN);

        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                mousePressedPerformed(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                moseDraggedPerformed(e);
            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });

    }

    private void mousePressedPerformed(MouseEvent e) {
        mX = e.getX();
        mY = e.getY();
        select(mX, mY);
    }

    private void moseDraggedPerformed(MouseEvent e) {
        if (isSelected) {
            selected.move(e.getX() - mX, e.getY() - mY);
            update(getGraphics());
        }
        mX = e.getX();
        mY = e.getY();
    }

    private void select(int x, int y) {
        isSelected = false;
        if (first.isBelong(x, y)) {
            selected = first;
            isSelected = true;
        } else if (middle.isBelong(x, y)) {
            selected = middle;
            isSelected = true;
        } else if (end.isBelong(x, y)) {
            selected = end;
            isSelected = true;
        } else {
            isSelected = false;
        }
    }

    private void moveDiscs(int number, Tower first, Tower middle, Tower end) {
        if (number == 1) {
            move(first,middle, end);
        } else {
            moveDiscs(number - 1, first, end, middle);
            move(first,middle, end);
            moveDiscs(number - 1, middle, first, end);
        }
    }

    private void move(Tower first,Tower middle, Tower end) {
        if (!isStarted) {
            return;
        }
        firstFigure = first.getTowers().get(first.getTowerSize() - 1);
        first.remove(firstFigure);
        up(first,middle,end);
        if (isStarted) {
            end.add(firstFigure);
        }
    }

    private void up(Tower first,Tower middle, Tower end) {
        while (isStarted) {
            Tower temp = end.getY() <= first.getY()? end.getY() < middle.getY()
                    || middle.getY() + middle.getVerticalHeight() + 10 < end.getY()
                    || (end.getX() > first.getX() && middle.getX() > end.getX())
                    || (end.getX() < first.getX() && middle.getX() < first.getX())?end:middle
                    :first.getY() < middle.getY()
                    || first.getY() > middle.getY() + middle.getVerticalHeight() + 10
                    || (first.getX() < end.getX() && end.getX() < middle.getX())
                    || (first.getX() > end.getX() && end.getX() > middle.getX())?first:middle;
            if (firstFigure.getY() + firstFigure.getHeight() < temp.getY()) {
                break;
            }
            firstFigure.move(0, -1);
            update(getGraphics());
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        if (first.getX() >= end.getX()) {
            left(first,middle,end);
        } else {
            right(first,middle,end);
        }

    }

    private void right(Tower first,Tower middle, Tower end) {
        while (isStarted) {
            if (firstFigure.getX() == end.getX() + first.getHalfOfWidthDifference(firstFigure)) {
                break;
            }
            if (end.getY() < firstFigure.getY() +firstFigure.getHeight()
                    || middle.getY() < firstFigure.getY() +firstFigure.getHeight()){
                up(first,middle,end);
                return;
            }
            if (end.getX() + end.getHalfOfWidthDifference(firstFigure) < firstFigure.getX()){
                left(first,middle,end);
                return;
            }
            firstFigure.move(1, 0);
            update(getGraphics());
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        down(first,middle,end);
    }

    private void left(Tower first,Tower middle, Tower end) {
        while (isStarted) {
            if (firstFigure.getX() == end.getX() + first.getHalfOfWidthDifference(firstFigure)) {
                break;
            }
            if (end.getY() < firstFigure.getY() +firstFigure.getHeight()
                    ||middle.getY() < firstFigure.getY() +firstFigure.getHeight()){
                up(first,middle,end);
                return;
            }
            if (end.getX() + end.getHalfOfWidthDifference(firstFigure) > firstFigure.getX()){
                right(first,middle,end);
                return;
            }

            firstFigure.move(-1, 0);
            update(getGraphics());
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        down(first,middle,end);
    }

    private void down(Tower first,Tower middle, Tower end) {
        while (isStarted) {
            if (firstFigure.getY() + firstFigure.getHeight() >= end.getY() + end.getVerticalHeight() - end.getTowerSize() * 10 - 2) {
                break;
            }
            if (firstFigure.getY() + firstFigure.getHeight() < end.getY()) {
                if (end.getX() + end.getHalfOfWidthDifference(firstFigure) < firstFigure.getX()) {
                    left(first,middle, end);
                }
                if (end.getX() + end.getHalfOfWidthDifference(firstFigure) > firstFigure.getX()) {
                    right(first,middle, end);
                }
            }else {
                firstFigure.setX(end.getX() + end.getHalfOfWidthDifference(firstFigure));
            }
            firstFigure.move(0, 1);
            update(getGraphics());
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        firstFigure.setY(end.getY() + end.getVerticalHeight() - end.getTowerSize() * 10-10);
        update(getGraphics());
    }

    private void add(int towersNum) {
        first.add(towersNum);
        update(getGraphics());
    }

    private void cleanHanoes() {
        isStarted = false;
        first.getTowers().clear();
        middle.getTowers().clear();
        end.getTowers().clear();
        this.first.getTowers().clear();

    }

    public void load(int towersNum) {
        towerLoad();
        cleanHanoes();
        add(towersNum);
    }

    public void start() {
        if (first.getTowerSize() >= 1) {
            if (!isStarted) {
                isStarted = true;
                t = new Thread(this);
                t.start();
            }
        } else {
            JOptionPane.showMessageDialog(null, "if you already have inserted number press \"LOAD\" button and then " +
                    "\npress \"START\" button, else pleas insert number than do the same.");
        }
    }

    @Override
    public void update(Graphics g) {
        super.update(g);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        first.draw(g);
        middle.draw(g);
        end.draw(g);
        if (isStarted) {
            firstFigure.draw(g);
        }
        for (HanoFigure hano : first.getTowers()) {
            hano.draw(g);
        }
        for (HanoFigure hano : middle.getTowers()) {
            hano.draw(g);
        }
        for (HanoFigure hano : end.getTowers()) {
            hano.draw(g);
        }
    }

    @Override
    public void run() {
        int towersNum = (int) Math.pow(2, first.getTowerSize()) - 1;
        moveDiscs(first.getTowerSize(), first, middle, end);
        if (isStarted) {
            String movesAmount = "allready " + towersNum + " moves";
            JOptionPane.showMessageDialog(null, movesAmount);
        }
    }

    private void towerLoad(){
        isStarted = false;
        first = new Tower(30, 170, this,new Color(0xFF1D0E));
        middle = new Tower(first.getX() + first.getHorizontalWidth() + 30, 170, this,new Color(0x0000FA));
        end = new Tower(middle.getX() + middle.getHorizontalWidth() + 30, 170, this,new Color(0xFAB232));
    }
}

