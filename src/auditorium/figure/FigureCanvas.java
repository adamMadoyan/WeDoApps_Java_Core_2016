package auditorium.figure;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;


public class FigureCanvas extends JPanel {

    private List<Figure> figures = new ArrayList<>();

    private int mX;
    private int mY;
    private boolean isSelected;

    public FigureCanvas() {
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                pressedActionPerformed(e);
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
                mouseDraggedPerformed(e);
            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });

        setVisible(true);

    }

    private void mouseDraggedPerformed(MouseEvent e) {
        if (isSelected) {
            getSelected().move(e.getX() - mX, e.getY() - mY);
            repaint();
        }
        mX = e.getX();
        mY = e.getY();
    }

    private Figure getSelected() {
        return isSelected ? figures.get(figures.size() - 1) : null;
    }


    public void add(Figure figure) {
        figures.add(figure);
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        g.clearRect(0, 0, 2000, 2000);
        for (Figure figure : figures) {
            figure.draw(g);
        }
    }

    private void pressedActionPerformed(MouseEvent e) {
        select(e.getX(), e.getY());
        if (isSelected) {
            repaint();
        }
        mX = e.getX();
        mY = e.getY();
    }

    private void select(int x, int y) {
        isSelected = false;
        for (int i = figures.size() - 1; i >= 0; i--) {
            if (figures.get(i).isBelong(x, y)) {
                figures.add(figures.remove(i));
                isSelected = true;
                return;
            }
        }
    }

    public void start() {
        if (isSelected) {
            getSelected().start();
        }
    }

    public void pause() {
        if (isSelected) {
            getSelected().pause();
        }
    }

    public void resume() {
        if (isSelected) {
            getSelected().resume();
        }
    }

    public void stop() {
        if (isSelected) {
            getSelected().stop();
        }
    }
}
