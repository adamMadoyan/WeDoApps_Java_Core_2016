package homework.homework_2016_12_10.anna_melikyan.notepad;

import javax.swing.*;
import java.awt.*;


public class Notepad extends JFrame {

    private JMenuBar menuBar;
    private JMenu file, edit, format, help;
    private JMenuItem New, Open, Save, SaveAs, Exit;
    private JMenuItem Undo, Cut, Copy, Paste, Delete, Find;
    private JMenuItem font, abNote;
    private JTextArea textArea;

    public Notepad() {
        super("NotePad");

        textArea = new JTextArea();
        JScrollPane scroll = new JScrollPane(textArea);
        add(scroll, BorderLayout.CENTER);
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);


        file = new JMenu("File");
        edit = new JMenu("Edit");
        format = new JMenu("Format");
        help = new JMenu("Help");

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(format);
        menuBar.add(help);


        New = new JMenuItem("New      Ctrl+N");
        Open = new JMenuItem("Open    Ctrl+O");
        Save = new JMenuItem("Save     Ctrl+S");
        SaveAs = new JMenuItem("SaveAs");
        Exit = new JMenuItem("Exit");

        file.add(New);
        file.add(Open);
        file.add(Save);
        file.add(SaveAs);
        file.add(Exit);

        Undo = new JMenuItem("Undo     Ctrl+Z");
        Cut = new JMenuItem("Cut        Ctrl+X ");
        Copy = new JMenuItem("Copy     Ctrl+C");
        Paste = new JMenuItem("Paste    Ctrl+V");
        Delete = new JMenuItem("Delete    Del");
        Find = new JMenuItem("Find        Ctrl+F");


        edit.add(Undo);
        edit.add(Cut);
        edit.add(Copy);
        edit.add(Paste);
        edit.add(Delete);
        edit.add(Find);


        font = new JMenuItem("Font");
        format.add(font);


        abNote = new JMenuItem("About NotePad");
        help.add(abNote);


        setSize(550, 500);
        setLocation(250, 150);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}

