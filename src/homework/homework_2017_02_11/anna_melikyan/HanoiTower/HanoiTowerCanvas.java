package homework.homework_2017_02_11.anna_melikyan.HanoiTower;

import auditorium.figure.FigureCanvas;
import auditorium.figure.Rectangle;

import java.awt.*;

/**
 * Created by Anna on 09.02.2017.
 */
public class HanoiTowerCanvas  extends FigureCanvas{

    public HanoiTowerCanvas() {

        setVisible(true);
    }

   // @Override
    public void paint(Graphics g) {
        g.clearRect(100, 100, 400, 200);
        repaint();
    }
}
