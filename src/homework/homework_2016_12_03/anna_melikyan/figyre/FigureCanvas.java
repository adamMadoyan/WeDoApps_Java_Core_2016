package homework.homework_2016_12_03.anna_melikyan.figyre;

import javax.swing.*;
import java.awt.*;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
public class FigureCanvas extends JPanel {

    private List<Figure> figures = new ArrayList<>();

    public FigureCanvas() {
        setVisible(true);
    }

    public void add(Figure figure) {
        figures.add(figure);
        repaint();
    }

    public void remove() {
        figures.remove(0);
        repaint();
    }


    @Override
    public void paint(Graphics g) {
        g.clearRect(0, 0, 2000, 2000);
        for (Figure figure : figures) {
            figure.draw(g);
        }
    }


}
