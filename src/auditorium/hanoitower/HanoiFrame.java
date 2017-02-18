package auditorium.hanoitower;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HanoiFrame extends JFrame {

    public static void main(String[] args) {
        new HanoiFrame();
    }

    private HanoiCanvas canvas;

    public HanoiFrame() throws HeadlessException {
        super("Hanoi Frame");
        setSize(600, 700);
        JPanel panel = new JPanel();
        JTextField textField = new JTextField(2);
        JButton load = new JButton("Load");
        JButton reset = new JButton("Reset");
        JButton play = new JButton("Play");

        panel.add(textField);
        panel.add(load);
        panel.add(reset);
        panel.add(play);

        add(panel, BorderLayout.NORTH);
        load.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int count;
                try {
                    count = Integer.valueOf(textField.getText());
                } catch (RuntimeException ex) {
                    count = 5;
                }
                loadActionPerformed(count);
            }
        });
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        play.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playActionPerformed();
            }
        });

        canvas = new HanoiCanvas();
        add(canvas, BorderLayout.CENTER);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void playActionPerformed() {
        canvas.play();
    }

    private void loadActionPerformed(int count) {
        canvas.load(count);
    }
}
