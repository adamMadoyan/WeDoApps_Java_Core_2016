package homework.homework_2016_12_10.zaven_madoyan.notepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Notepad extends JFrame {

    private JTextArea mainArea;
    private JMenuBar mBar;
    private JMenu mFile, mEdit, mFormat, mHelp;
    private JMenuItem itmNew, itmOpen, itmSave;

    public Notepad() {
        initComponent();
    }


    private void initComponent() {
        mainArea = new JTextArea();
        getContentPane().add(mainArea);
        getContentPane().add(new JScrollPane(mainArea), BorderLayout.CENTER);
        setTitle("Zaven Notepad");
        setSize(500, 500);

        // menu bar

        mBar = new JMenuBar();

        // menu

        mFile = new JMenu("File");
        mEdit = new JMenu("Edit");
        mFormat = new JMenu("Format");
        mHelp = new JMenu("Help");

        // menu item

        itmNew = new JMenuItem("New");
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
        itmSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = mainArea.getText();

                File newDir = new File("C:\\Users\\Zaven\\Desktop\\Notepad Document");
                if (!newDir.exists()) {
                    newDir.mkdir();
                }
                File newFile = new File(newDir, "new.txt");
                if (!newFile.exists()) {
                    try {
                        newFile.createNewFile();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
                writeOnFile(newFile, "%s", mainArea.getText());

                String text = readFromFile(newFile);

            }
        });
    }


    private static String readFromFile(File file) {
        InputStream inputStream = null;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            inputStream = new FileInputStream(file);
            int i;
            while ((i = inputStream.read()) != -1) {
                stringBuilder.append((char) i);
            }
        } catch (IOException e) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
        return stringBuilder.toString();
    }

    private static void writeOnFile(File file, String s, String text) {
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(file);
            outputStream.write(text.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.flush();
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static void main(String[] args) {
        new Notepad();
    }
}
