package figure;

import javax.naming.event.ObjectChangeListener;
import javax.swing.*;
import java.awt.*;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class FigureCanvas extends JPanel {

    public List<Figure> figures = new ArrayList<>();// figur@ ArrayList-i object e///

    public FigureCanvas() {
        setVisible(true);
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


public  void removeMe (){
    for (Figure figure : figures)
    figures.remove(figure);
    repaint();

}

}



