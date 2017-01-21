package homework.homework_2016_12_24.robert_tadevosyan.notepad;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class NotepadMenuBar extends JMenuBar {
    Notepad notepad;
    private JFileChooser fileChooser;

    public NotepadMenuBar(Notepad parent) {
        this.notepad = parent;
        fileChooser = new JFileChooser();

        JMenu fileMenu = fileMenuConfigurations();
        JMenu editMenu = editMenuConfigurations();
        JMenu settings = settingsMenuConfigurations();
        add(fileMenu);
        add(editMenu);
        add(settings);
    }

    private JMenu editMenuConfigurations() {
        JMenu editMenu = new JMenu("Edit");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem pastItem = new JMenuItem("Past");
        addMenuItemsToMenu(editMenu, copyItem, cutItem, pastItem);
        return editMenu;
    }

    private JMenu settingsMenuConfigurations() {
        JMenu settingsMenu = new JMenu("Settings");
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                notepad.exitActionPerformed();
            }
        });
        addMenuItemsToMenu(settingsMenu, exitItem);
        return settingsMenu;
    }

    private JMenu fileMenuConfigurations() {
        JMenu fileMenu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        newItem.setAccelerator(KeyStroke.getKeyStroke("control N"));
        JMenuItem openItem = new JMenuItem("Open");
        openItem.setAccelerator(KeyStroke.getKeyStroke("control O"));
        JMenuItem saveItem = new JMenuItem("Save");
        saveItem.setAccelerator(KeyStroke.getKeyStroke("control S"));

        saveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveActionPerformed();
            }
        });

        openItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openItemActionPerformed();
            }
        });

        newItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newActionPerformed();
            }
        });
        addMenuItemsToMenu(fileMenu, newItem, openItem, saveItem);
        return fileMenu;
    }


    private void saveActionPerformed() {
        int option = fileChooser.showSaveDialog(notepad);
        if (option == JFileChooser.APPROVE_OPTION) {
            File savingFile = fileChooser.getSelectedFile();
            notepad.saveFile(savingFile);
        }
    }

    private void newActionPerformed() {
        notepad.getTextArea().setText("");
    }

    private void openItemActionPerformed() {
        int option = fileChooser.showOpenDialog(notepad);
        if (option == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String fileName = file.getName();
            notepad.setTitle(fileName.substring(0, fileName.lastIndexOf(".")));
            notepad.openFile(file);
        }
    }

    private void addMenuItemsToMenu(JMenu menu, JMenuItem... menuItems) {
        for (JMenuItem m : menuItems) {
            menu.add(m);
        }
    }

    private void setText(String text) {
        notepad.getTextArea().setText(text);
    }


}
