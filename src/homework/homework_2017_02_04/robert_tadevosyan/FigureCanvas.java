package robert_tadevosyan;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * Created by mactrainonetraining on 1/28/17.
 */
public class FigureCanvas extends JPanel {
    private List<Figure> figures;
    public boolean isSelected;
    private int oldX;
    private int oldY;
    private Random random;



    public FigureCanvas() {
        figures = new ArrayList<>();
        random = new Random();
        setBorder(BorderFactory.createLineBorder(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)),FigureFrame.BORDER_WIDTH));
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                    selectFigure(e.getX(),e.getY());
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
                mouseDraggedActionPerformed(e.getX(),e.getY());
            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });
    }

    public void start() {
        if (isSelected) {
            getSelectedFigure().start();
        }else{
            return;
        }
    }

    public void stop(){
        if (isSelected) {
            getSelectedFigure().stop();
        }else {
            return;
        }
    }

    private void mouseDraggedActionPerformed(int x, int y) {
        if(isSelected){
            getSelectedFigure().move(x - oldX,y - oldY);
            repaint();
        }
        oldX = x;
        oldY = y;
    }

    @Override
    public void paint(Graphics g) {
//        super.paint(g);
        g.clearRect(0,0,2000,2000);
        paintBorder(g);
        for (Figure figure : figures) {
            figure.draw(g);
        }
    }

    public void addFigure(Figure figure){
        figures.add(figure);
        repaint();
    }

    private void selectFigure(int mouseX, int mouseY){
        isSelected =false;
        for (int i = figures.size() - 1; i >= 0 ; i--) {
            Figure f = figures.get(i);
            if (f.isBelong(mouseX, mouseY)) {
                figures.add(figures.remove(i));
                isSelected = true;
                break;
            }
        }
        if(isSelected){
            repaint();
        }
        oldX = mouseX;
        oldY = mouseY;
    }

    public Figure getSelectedFigure(){
        return figures.get(figures.size()-1);
    }
}
