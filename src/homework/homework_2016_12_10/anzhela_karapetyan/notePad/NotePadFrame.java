package homework.homework_2016_12_10.anzhela_karapetyan.notePad;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class NotePadFrame extends JFrame {

    public static void main(String args[]) throws BadLocationException {
        new NotePadFrame();

    }

    JPanel mainPanel;
    JTextArea textArea;
    JPanel westPanel;
    int count = 1;


    private NotePadFrame() throws BadLocationException {

        JMenuBar menuBar = new JMenuBar();
        JMenu menuField1 = new JMenu("File");
        JMenu menuField2 = new JMenu("Edit");

        JMenuItem menuItemFile1 = new JMenuItem("New      Ctrl+N");
        JMenuItem menuItemFile2 = new JMenuItem("Open...     Ctrl+O");
        JMenuItem menuItemFile3 = new JMenuItem("Save      Ctrl+S");
        JMenuItem menuItemFile4 = new JMenuItem("Save As...");
        JMenuItem menuItemFile5 = new JMenuItem("Page Setup...");
        JMenuItem menuItemFile6 = new JMenuItem("Print...      Ctrl+P");
        JMenuItem menuItemFile7 = new JMenuItem("Exit");

        JMenuItem menuItemEdit1 = new JMenuItem("Undo      Ctrl+Z");
        menuItemEdit1.setEnabled(false);

        JMenuItem menuItemEdit2 = new JMenuItem("Cut       Ctrl+X");
        menuItemEdit2.setEnabled(false);

        JMenuItem menuItemEdit3 = new JMenuItem("Copy     Ctrl+C");
        menuItemEdit3.setEnabled(false);

        JMenuItem menuItemEdit4 = new JMenuItem("Paste       Ctrl+V");

        JMenuItem menuItemEdit5 = new JMenuItem("Delete     Del");
        menuItemEdit5.setEnabled(false);

        JMenuItem menuItemEdit6 = new JMenuItem("Find...      Ctrl+F");
        menuItemEdit6.setEnabled(false);

        JMenuItem menuItemEdit7 = new JMenuItem("Find Next  F3");
        menuItemEdit7.setEnabled(false);

        JMenuItem menuItemEdit8 = new JMenuItem("Replace      Ctrl+H");

        JMenuItem menuItemEdit9 = new JMenuItem("Go To...     Ctrl+G");
        menuItemEdit9.setEnabled(false);

        JMenuItem menuItemEdit10 = new JMenuItem("Select All  Ctrl+A");
        JMenuItem menuItemEdit11 = new JMenuItem("Time/Date   F5");


        menuBar.add(menuField1);
        menuBar.add(menuField2);

        menuField1.add(menuItemFile1);
        menuField1.add(menuItemFile2);
        menuField1.add(menuItemFile3);
        menuField1.add(menuItemFile4);
        menuField1.addSeparator();
        menuField1.add(menuItemFile5);
        menuField1.add(menuItemFile6);
        menuField1.addSeparator();
        menuField1.add(menuItemFile7);

        menuField2.add(menuItemEdit1);
        menuField2.addSeparator();
        menuField2.add(menuItemEdit2);
        menuField2.add(menuItemEdit3);
        menuField2.add(menuItemEdit4);
        menuField2.add(menuItemEdit5);
        menuField2.addSeparator();
        menuField2.add(menuItemEdit6);
        menuField2.add(menuItemEdit7);
        menuField2.add(menuItemEdit8);
        menuField2.add(menuItemEdit9);
        menuField2.addSeparator();
        menuField2.add(menuItemEdit10);
        menuField2.add(menuItemEdit11);


        add(menuBar, BorderLayout.NORTH);

        textArea = new JTextArea();

        westPanel = new JPanel();
        westPanel.setPreferredSize(new Dimension(10, 30));


        SimpleAttributeSet s = new SimpleAttributeSet();


        JLabel label = new JLabel();
        label.setText("1");
        westPanel.add(label);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        mainPanel.add(westPanel, BorderLayout.WEST);
        mainPanel.add(textArea, BorderLayout.CENTER);

        JScrollPane scrollPane = new JScrollPane(mainPanel);

        getContentPane().add(scrollPane);
        setPreferredSize(new Dimension(500, 400));

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 550);
        setLocation(500, 100);

        textArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {
                if (keyEvent.getKeyChar() == '\n') {
                    JLabel label = new JLabel();
                    label.setText(String.valueOf(labelText()));
                    westPanel.add(label);
                    repaint();

                }
            }

            @Override
            public void keyPressed(KeyEvent keyEvent) {

            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {

            }
        });

    }

    private int labelText() {
        return ++count;
    }


}
