package homework.homework_2017_02_11.anna_melikyan.HanoiTower;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by Anna on 09.02.2017.
 */
public class HanoiTowerFrame extends JFrame {
    public static void main(String[] args) {
        new HanoiTowerFrame();
    }

    public HanoiTowerFrame (){
        JButton play = new JButton("Play");
        JButton restart = new JButton("Restart");


        JPanel panel = new JPanel();
        HanoiTowerCanvas canvas = new HanoiTowerCanvas();



        play.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playActionPerformed();
            }


        });

        restart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                restartActionerformed();

            }


        });

        panel.add(play);
        panel.add(restart);

        add(panel, BorderLayout.NORTH);
        add(canvas, BorderLayout.CENTER);


        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(750, 650);
        setLocation(150, 80);


    }
    private void playActionPerformed() {

    }



    private void restartActionerformed() {
    }
}
