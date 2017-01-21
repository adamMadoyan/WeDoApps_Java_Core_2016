package java_notepad;

import javax.swing.*;
import java.awt.*;


/**
 * Created by Zaven on 30.11.2016.
 */
public class Java_notepad extends JFrame {

    JTextArea mainarea;
    JMenuBar mBar;
    JMenu mFile, mEdit, mFormat, mHelp;
    JMenuItem itmNew, itmOpen, itmSave;

    public Java_notepad() {
    initComponent();
    }



    private void initComponent () {
        mainarea = new JTextArea();
        getContentPane().add(mainarea);
        getContentPane().add(new JScrollPane(mainarea), BorderLayout.CENTER);
        setTitle("Zaven Notepad");
        setSize(1000,500);
        // menu bar
mBar = new JMenuBar();
        // menu
        mFile = new JMenu("File");
        mEdit = new JMenu("Edit");
        mFormat = new JMenu("Format");
        mHelp = new JMenu("Help");

        // menu item
        itmNew = new JMenuItem ("New");
        itmOpen = new JMenuItem("Open");
        itmSave = new JMenuItem("Save");

        // add menu item

        mFile.add(itmNew);
        mFile.add(itmOpen);
        mFile.add(itmSave);

        // add menu item to menu bar

        mBar.add(mFile);
        mBar.add(mEdit);
        mBar.add(mFormat);
        mBar.add(mHelp);

        //add menu bar to frame

        setJMenuBar(mBar);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }


    public static void main(String[] args) {
        Java_notepad jn = new Java_notepad();

    }
}
