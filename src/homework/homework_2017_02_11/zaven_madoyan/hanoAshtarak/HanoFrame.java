package homework.homework_2017_02_11.zaven_madoyan.hanoAshtarak;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.text.EditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class HanoFrame extends JFrame {

    HanoCanvas canvas = new HanoCanvas();
    JPanel controlPanel = new JPanel();

    JEditorPane panel = new JEditorPane();

    JButton loadButton = new JButton("Load");
    JButton startButton = new JButton("Start");

    public HanoFrame() throws HeadlessException {
        super("MY HANO TOWER");

        panel.addAncestorListener(new AncestorListener() {
            @Override
            public void ancestorAdded(AncestorEvent event) {

            }

            @Override
            public void ancestorRemoved(AncestorEvent event) {

            }

            @Override
            public void ancestorMoved(AncestorEvent event) {

            }
        });

        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadPanelActionPerfom(e);
            }
        });

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startActionPerfom(e);
            }
        });

        controlPanel.add(panel);
        controlPanel.add(loadButton);
        controlPanel.add(startButton);

        add(controlPanel, BorderLayout.NORTH);
        add(canvas, BorderLayout.CENTER);

        setSize(765, 600);
        setLocation(300, 50);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }

    private void loadPanelActionPerfom(ActionEvent e) {
        try {
            if (Integer.parseInt(panel.getText()) > 25 || Integer.parseInt(panel.getText()) < 1) {
                JOptionPane.showMessageDialog(null, "pleas insert number less then 25 and more then 0");
            } else {
                int towersNum = Integer.parseInt(panel.getText());
                canvas.load(towersNum);
            }
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "pleas insert number");
        }
    }

    private void startActionPerfom(ActionEvent e) {
        canvas.start();
    }

    public static void main(String[] args) {
        new HanoFrame();
    }

}

