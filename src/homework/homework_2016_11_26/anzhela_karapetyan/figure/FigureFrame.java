package figure;


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
            public void actionPerformed(ActionEvent actionEvent) {
                removeActionPerformed(actionEvent);

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
        setLocation(150, 80);

    }

    private void addActionPerformed(ActionEvent e) {
        Figure circle = new Circle(100, 50, 50, Color.BLUE);
        Figure rectangle = new Rectangle(150, 100, 50, 35);
        canvas.add(circle);
        canvas.add(rectangle);

    }
    private void removeActionPerformed(ActionEvent e) {
        canvas.removeMe();
    }
}
