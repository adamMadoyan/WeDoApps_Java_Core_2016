package homework.homework_2017_01_21.anna_melikyan.notepad;

import javax.swing.*;
import java.awt.*;
import java.io.*;


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

    public JTextArea getTextArea() {
        return textArea;
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title + " - Notepad");
    }
}

