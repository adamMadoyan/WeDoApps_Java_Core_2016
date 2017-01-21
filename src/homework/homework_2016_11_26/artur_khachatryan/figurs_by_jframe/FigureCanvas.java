package myHomeworks.figurs_by_jframe;


import javax.swing.*;
import java.awt.*;
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

    public void remove(){
        figures.remove(0);
        repaint();
    }



    @Override
    public void paint(Graphics g) {
        g.clearRect(0, 0, 500, 500);
        for (Figure figure : figures) {
            figure.draw(g);
        }
    }


}
