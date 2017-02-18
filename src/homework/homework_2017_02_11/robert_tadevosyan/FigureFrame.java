package homework.homework_2017_02_11.robert_tadevosyan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class FigureFrame extends JFrame {


    public static void main(String[] args) {
        new FigureFrame();
    }

    private FigureCanvas canvas = new FigureCanvas();
    private JButton start;




    public FigureFrame() throws HeadlessException {
        super("Hanoi Tower");
        start = new JButton("Start");
        JPanel configPanel = new JPanel();
        configPanel.add(start);
        start.addActionListener(event -> startActionPerformed());
        add(configPanel, BorderLayout.NORTH);
        add(canvas, BorderLayout.CENTER);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(FigureCanvas.xSize,FigureCanvas.ySize);
        setResizable(true);
        setVisible(true);
    }

    private void startActionPerformed() {
        canvas.move();
    }

    public void move(int n, Peg first, Peg second, Peg third) {
        if (first.getDiskList().isEmpty()) {
            return;
        }
        if (n == 1) {
            Disk disk = first.getDiskList().remove(first.getDiskList().size() - 1);
//                    disk.setX(/*third.getX() -*/ FigureFrame.POINT/2 + third.getX());
////                    disk.setY( third.getY() - third.getDiskList().size() * POINT *3/2);
            third.addDiskToColumn(disk);
            repaint();
            System.out.println(first.getX() + " >> " + third.getX());
            return;
        }
        move(n - 1, first, third, second);
        Disk disk = first.getDiskList().remove(first.getDiskList().size() - 1);
//        disk.setX(FigureFrame.POINT / 2 + third.getX());
//                disk.setY( third.getY() - third.getDiskList().size() * POINT *3/2 );
        third.addDiskToColumn(disk);
        System.out.println(first.getX() + " >> " + third.getX());
        repaint();
        move(n - 1, second, first, third);
        repaint();
    }
}
