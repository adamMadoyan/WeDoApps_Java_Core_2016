package homework.homework_2016_12_10.karen_madoyan.notepad;

import javax.swing.*;

public class Notepad extends JFrame {

    public static void main(String[] args) {
        new Notepad();
    }

    private static final String DEFAULT_TITLE = "Untitled";

    private JTextArea textArea;

    public Notepad() {
        setTitle(DEFAULT_TITLE);
        NotepadMenuBar menuBar = new NotepadMenuBar(this);
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        setJMenuBar(menuBar);
        add(textArea);
        setSize(400, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title + " - Notepad");
    }

    public JTextArea getTextArea() {
        return textArea;
    }
}
