//package homework.homework_2017_02_11.zaven_madoyan.hanotowers;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class HanoFrame extends JFrame {
//
//    JEditorPane text = new JEditorPane();
//    HanoCanvas hanoCanvas = new HanoCanvas();
//
//    public HanoFrame() {
//        super("Hano Towers");
//        JButton load = new JButton("Load");
//        JButton start = new JButton("Start");
//        JButton towerStart = new JButton("TowerStart");
//        JPanel controlPanel = new JPanel();
//
//        load.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                loadActionPerformed(e);
//            }
//        });
//
//        start.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                startActionPerformed(e);
//            }
//        });
//
//        towerStart.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                towerStartPerformed(e);
//            }
//        });
//
//        controlPanel.add(text);
//        controlPanel.add(load);
//        controlPanel.add(start);
//        controlPanel.add(towerStart);
//
//        setSize(800, 600);
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        setVisible(true);
//        setLocation(200, 50);
//
//        add(controlPanel, BorderLayout.NORTH);
//        add(hanoCanvas, BorderLayout.CENTER);
//
//    }
//
//    private void loadActionPerformed(ActionEvent e) {
//        int n = Integer.parseInt(text.getText());
//        hanoCanvas.loadDiscs(n);
//    }
//
//    private void startActionPerformed(ActionEvent e) {
//        hanoCanvas.startForDisc();
//    }
//
//    private void towerStartPerformed(ActionEvent e) {
//        hanoCanvas.start();
//    }
//
//    public static void main(String[] args) {
//        new HanoFrame();
//    }
//}
