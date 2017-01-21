package homework.homework_2016_12_10.karen_madoyan.notepad;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class NotepadMenuBar extends JMenuBar {

    private JFileChooser fileChooser;
    private Notepad notepad;

    public NotepadMenuBar(Notepad notepad) {
        this.notepad = notepad;
        fileChooser = new JFileChooser();
        JMenu file = new JMenu("File");
        JMenuItem _new = new JMenuItem("New");
        _new.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newActionPerformed();
            }
        });
        JMenuItem open = new JMenuItem("Open");
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openActionPerformed();
            }
        });

        JMenuItem save = new JMenuItem("Save");
        JMenuItem saveAs = new JMenuItem("Save");

        file.add(_new);
        file.add(open);
        file.add(save);
        file.add(saveAs);
        add(file);
    }

    private void newActionPerformed() {

    }

    private void openActionPerformed() {
        // TODO: check if notepad is changed
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text", "txt"));
        int option = fileChooser.showOpenDialog(notepad);
        if (option == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            setText(readTextFromFile(file));
            String fileName = file.getName();
            notepad.setTitle(fileName.substring(0, fileName.lastIndexOf(".")));
        }
    }

    private static String readTextFromFile(File file) {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String s;
            while ((s = reader.readLine()) != null) {
                builder.append(s + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.substring(0, builder.length() - 1);
    }

    private void setText(String text) {
        notepad.getTextArea().setText(text);
    }

}
