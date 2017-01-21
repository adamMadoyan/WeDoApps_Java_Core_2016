package auditorium.figure;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class FigureFrame extends JFrame {


    public static void main(String[] args) {
        new FigureFrame();
    }

    private FigureCanvas canvas = new FigureCanvas();
    private Random random = new Random();


    public FigureFrame() throws HeadlessException {
        super("Figure frame");

        JButton add = new JButton("Add");
        JButton remove = new JButton("Remove");
        JButton start = new JButton("Start");

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addActionPerformed();
            }
        });

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startActionPerformed();
            }
        });

        JPanel configPanel = new JPanel();
        configPanel.add(add);
        configPanel.add(remove);
        configPanel.add(start);

        add(configPanel, BorderLayout.NORTH);
        add(canvas, BorderLayout.CENTER);

        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(750, 650);
        setLocation(150, 80);

    }

    private void startActionPerformed() {
        canvas.start();
    }

    private void addActionPerformed() {
        int r = random.nextInt(1000);
        Figure figure;
        if (r % 2 == 0) {
            figure = new Circle(100, 50, 50, Color.BLUE, canvas);
        } else {
            figure = new Rectangle(120, 70, 50, 35, canvas);
        }
        canvas.add(figure);
    }
}
