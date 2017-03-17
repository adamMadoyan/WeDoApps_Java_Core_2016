package robert_tadevosyan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by mactrainonetraining on 1/28/17.
 */
public class FigureFrame extends JFrame {
    public static final int WIDTH = 1000;
    public static final int HEIGHT = 1000;
    public static final int BORDER_WIDTH = 100;

    public static void main(String[] args) {
        new FigureFrame();
    }

    private FigureCanvas canvas;
    private JButton addButton;
    private JButton startButton;
    private JButton stopButton;
    private JPanel topPanel;
    private Random random;
    private boolean isRunning;

    public FigureFrame() {
        setSize(WIDTH, HEIGHT);
        isRunning = false;
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        random = new Random();
        topPanel = new JPanel();
        topPanel.setSize(2000, 100);
        addButton = new JButton("Add");
        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                canvas.stop();
            }
        });
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startButtonActionPerformed();
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addButtonActionPerformed();
            }
        });
        topPanel.add(addButton, BorderLayout.NORTH);
        topPanel.add(startButton, BorderLayout.NORTH);
        topPanel.add(stopButton, BorderLayout.NORTH);
        canvas = new FigureCanvas();
        add(canvas, BorderLayout.CENTER);
        add(topPanel, BorderLayout.NORTH);
        setVisible(true);
    }

    private void startButtonActionPerformed() {
        canvas.start();
    }

    private void addButtonActionPerformed() {
        int r = random.nextInt(2) + 1;
        Figure f = null;
        if (r == 1) {
            f = new Rectangle(random.nextInt(WIDTH - 2 * BORDER_WIDTH) + BORDER_WIDTH,
                    random.nextInt(HEIGHT - 2 * BORDER_WIDTH) + BORDER_WIDTH,
                    random.nextInt(100) + 30,
                    random.nextInt(100) + 30,
                    new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255), random.nextInt(50)+50), canvas);
        } else if (r == 2) {
            f = new Circle(random.nextInt(WIDTH - 2 * BORDER_WIDTH) + BORDER_WIDTH,
                    random.nextInt(HEIGHT - 2 * BORDER_WIDTH) + BORDER_WIDTH,
                    random.nextInt(100) + 30,
                    new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255), random.nextInt(50)+50), canvas);
        }
        canvas.addFigure(f);
    }
}
