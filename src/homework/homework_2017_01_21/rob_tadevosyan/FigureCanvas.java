package homework.homework_2017_01_21.rob_tadevosyan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;

public class FigureCanvas extends JPanel {

    private List<Figure> figures = new ArrayList<>();
    private boolean isSelected;
    boolean isGet;
    private int mX;
    private int mY;
    private EnemiesInterface enemiesInterface;

    public FigureCanvas(EnemiesInterface enemiesInterface) {
        this.enemiesInterface = enemiesInterface;
        setVisible(true);
        addMouseListenerMethod();
        addMouseMotionListenerMethod();
    }
    private void addMouseMotionListenerMethod() {
        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                mouseDraggedPerformed(e);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                enemiesInterface.gameOver();
//                mouseMovePerformed(e);
            }
        });
    }

    private void mouseMovePerformed(MouseEvent e) {
        if(isGet){
            getSelectedFigure().move(e.getX()-mX,e.getY()-mY);
            repaint();
        }
        mX = e.getX();
        mY = e.getY();
    }

    private void addMouseListenerMethod() {
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                pressedActionPerfomed(e);
                isGet = !isGet;
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
    }

    private void mouseDraggedPerformed(MouseEvent e) {
        if(isSelected){
            getSelectedFigure().move(e.getX()- mX,e.getY() -mY);
            repaint();
        }
        mX = e.getX();
        mY = e.getY();
    }

    private Figure getSelectedFigure() {
        return isSelected  ? figures.get(figures.size()-1): null;
    }

    public void add(Figure figure) {
        figures.add(figure);
        repaint();
    }

    public void deleteLastFigure(){
        int sizOfFigures = figures.size();
        if(sizOfFigures > 0){
            figures.remove(sizOfFigures-1);
            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {
        g.clearRect(0, 0, 2000, 2000);
        for (Figure figure : figures) {
            figure.draw(g);
        }
    }

    private void pressedActionPerfomed(MouseEvent e) {
        selectFigure(e.getX(),e.getY());
        if(isSelected){
            repaint();
        }
        mX = e.getX();
        mY = e.getY();
    }

    private void selectFigure(int x,int y){
        isSelected = false;
        for (int i = figures.size()-1; i >= 0; i-- ) {
            if(figures.get(i).isBelong(x,y)){
                figures.add(figures.remove(i));
                isSelected = true;
                return;
            }
        }
    }
}