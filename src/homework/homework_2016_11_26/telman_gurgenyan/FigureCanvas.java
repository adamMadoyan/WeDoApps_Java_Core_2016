package homework_16_11_26;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Class description.
 *
 * @author Adam Madoyan
 */
public class FigureCanvas extends JPanel {

    private List<Figure> figures = new ArrayList<>();

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


    public void remove() {
       figures.remove(0);
        repaint();

    }
}

