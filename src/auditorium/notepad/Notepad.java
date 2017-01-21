package auditorium.notepad;

import javax.swing.*;

public class Notepad extends JFrame {

    public static void main(String[] args) {
        new Notepad();
    }

    public static final String DEFAULT_TITLE = "Untitled";

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
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
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
