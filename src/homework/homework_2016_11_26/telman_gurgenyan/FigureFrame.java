package homework_16_11_26;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FigureFrame extends JFrame {


    public static void main(String[] args) {
        new FigureFrame();
    }

    private FigureCanvas canvas = new FigureCanvas();


    public FigureFrame() throws HeadlessException {
        super("Figure frame");

        JButton add = new JButton("Add");
        JButton remove = new JButton("Remove");

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addActionPerformed(e);
            }
        });
        remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            removElement();
            }
        });
        JPanel configPanel = new JPanel();
        configPanel.add(add);
        configPanel.add(remove);

        add(configPanel, BorderLayout.NORTH);
        add(canvas, BorderLayout.CENTER);

        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(750, 650);
        setLocation(150, 100);


    }

    private void addActionPerformed(ActionEvent e) {

       Figure circle = new Circle(100, 50, 50);
        Figure rectangle = new Rectangle(0, 100, 50, 50);

          //  @Override
          //  public void draw(Graphics g) {

           // }

          //  @Override
           // public boolean isBelong(int x, int y) {
           //     return false;
           // }

        canvas.add(circle);
        canvas.add(rectangle);

    }
    private void removElement(){

       canvas.remove();

    }
}
