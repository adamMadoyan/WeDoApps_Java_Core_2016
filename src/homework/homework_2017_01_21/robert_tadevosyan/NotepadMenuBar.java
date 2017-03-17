package homework.homework_2017_01_21.robert_tadevosyan;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.ItemEvent;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NotepadMenuBar extends JMenuBar {

    private static final String CREATE_NEW_DOCUMENT_DEFAULT_TITLE = "New Document";
    private static final String CREATE_NEW_DOCUMENT_DEFAULT_QUESTION = "This document is not saved, continue ?";

    private Notepad notepad;
    private JFileChooser fileChooser;
    private Clipboard clipboard;

    public NotepadMenuBar(Notepad parent) {
        this.notepad = parent;
        fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text file(.txt)", "txt"));

        JMenu fileMenu = fileMenuConfigurations();
        JMenu editMenu = editMenuConfigurations();
        JMenu formatMenu = formatMenuConfigurations();
        add(fileMenu);
        add(editMenu);
        add(formatMenu);
    }

    private JMenu fileMenuConfigurations() {
        JMenu fileMenu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        newItem.setAccelerator(KeyStroke.getKeyStroke("control N"));
        JMenuItem openItem = new JMenuItem("Open");
        openItem.setAccelerator(KeyStroke.getKeyStroke("control O"));
        JMenuItem saveItem = new JMenuItem("Save");
        saveItem.setAccelerator(KeyStroke.getKeyStroke("control S"));
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(listener -> notepad.exitActionPerformed());
        saveItem.addActionListener(listener -> saveActionPerformed(false));
        openItem.addActionListener(listener -> openItemActionPerformed());
        newItem.addActionListener(listener -> newActionPerformed());
        addMenuItemsToMenu(fileMenu, newItem, openItem, saveItem, exitItem);
        return fileMenu;
    }

    private JMenu editMenuConfigurations() {
        JMenu editMenu = new JMenu("Edit");
        JMenuItem copyItem = new JMenuItem("Copy");
        copyItem.setAccelerator(KeyStroke.getKeyStroke(" control C"));
        JMenuItem cutItem = new JMenuItem("Cut");
        cutItem.setAccelerator(KeyStroke.getKeyStroke(" control X"));
        JMenuItem pastItem = new JMenuItem("Past");
        pastItem.setAccelerator(KeyStroke.getKeyStroke("control V"));
        JMenuItem deleteItem = new JMenuItem("Delete");
        pastItem.setAccelerator(KeyStroke.getKeyStroke("Del."));
        JMenuItem replaceItem = new JMenuItem("Replace");
        replaceItem.setAccelerator(KeyStroke.getKeyStroke("control H"));
        JMenuItem selectAll = new JMenuItem("Select All");
        selectAll.setAccelerator(KeyStroke.getKeyStroke("control A"));
        JMenuItem dateHelper = new JMenuItem("Date");
        dateHelper.setAccelerator(KeyStroke.getKeyStroke("control D"));
        copyItem.addActionListener(listener -> copyItemActionPerformed());
        cutItem.addActionListener(listener -> cutItemActionPerformed());
        pastItem.addActionListener(listener -> pastActionPerformed());
        deleteItem.addActionListener(listener -> deleteActionPerformed());
        replaceItem.addActionListener(listener -> replaceActionPerformed());
        selectAll.addActionListener(listener -> selectAllActionPerformed());
        dateHelper.addActionListener(listener -> writeDateOnTheDocument());
        addMenuItemsToMenu(editMenu, copyItem, cutItem, pastItem, deleteItem, replaceItem, selectAll, dateHelper);
        return editMenu;
    }


    private JMenu formatMenuConfigurations() {
        JMenu formatMenu = new JMenu("Format");
        JCheckBoxMenuItem lineWrapItem = new JCheckBoxMenuItem("Line Wrap");
        lineWrapItem.addItemListener(listener -> lineWrapActionPerformed(listener));
        addMenuItemsToMenu(formatMenu, lineWrapItem);
        return formatMenu;
    }

    private void lineWrapActionPerformed(ItemEvent event) {
        if (event.getStateChange() == 1) {
            notepad.getTextArea().setLineWrap(false);
        } else if (event.getStateChange() == 2) {
            notepad.getTextArea().setLineWrap(true);
        }
    }


    //********************* FILE MENU ITEM CONFIGURATIONS ********************************
    private void newActionPerformed() {
        if (notepad.getTextArea().getText().isEmpty()) {
            return;
        } else if (notepad.isDocSaved) {
            createNewByCleaningOld();
        } else {
            notepad.openAlertBeforeClosing(CREATE_NEW_DOCUMENT_DEFAULT_QUESTION, CREATE_NEW_DOCUMENT_DEFAULT_TITLE, true);
        }
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

    public void saveActionPerformed(boolean isNew) {
        int option = fileChooser.showSaveDialog(notepad);
        if (option == JFileChooser.APPROVE_OPTION) {
            File savingFile = fileChooser.getSelectedFile();
            notepad.saveFile(savingFile);
            if (!isNew) {
                notepad.setTitle(savingFile.getName());
            } else {
                createNewByCleaningOld();
            }
        }
    }


    //**************************** EDIT MENU ITEM CONFIGURATIONS  ************************************
    private void copyItemActionPerformed() {
        cutOrCopySelectedText(false);
    }

    private void cutItemActionPerformed() {
        cutOrCopySelectedText(true);
    }

    private void pastActionPerformed() {
        if (clipboard == null) {
            return;
        }
        Transferable clipData = clipboard.getContents(clipboard);
        if (clipData != null) {
            try {
                if (clipData.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                    String s = (String) (clipData.getTransferData(
                            DataFlavor.stringFlavor));
                    notepad.getTextArea().replaceSelection(s);
                }
            } catch (UnsupportedFlavorException ufe) {
                System.err.println("Flavor unsupported: " + ufe);
            } catch (IOException ioe) {
                System.err.println("Data not available: " + ioe);
            }
        }
    }

    private void deleteActionPerformed() {
        String allText = notepad.getTextArea().getText();
        if (!allText.isEmpty()) {
            String selectedText = notepad.getTextArea().getSelectedText();
            notepad.getTextArea().setText(allText.replace(selectedText, ""));
        }
    }

    private void writeDateOnTheDocument() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String allText = notepad.getTextArea().getText();
        notepad.getTextArea().setText(allText + " " + dateFormat.format(date));
    }

    private void replaceActionPerformed() {
        JTextField replaceTextField = new JTextField(5);
        JTextField withTextField = new JTextField(5);
        String allText = notepad.getTextArea().getText();
        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Replace :"));
        myPanel.add(replaceTextField);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("With :"));
        myPanel.add(withTextField);
        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Replace", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            if (allText.contains(replaceTextField.getText())) {
                notepad.getTextArea().setText(allText.replaceAll(replaceTextField.getText(), withTextField.getText()));
            }
        }
    }

    private void selectAllActionPerformed() {
        notepad.getTextArea().selectAll();
    }


    //************************* HELPER FUNCTIONS,METHODS **********************
    private void cutOrCopySelectedText(boolean cut) {
        String selection = notepad.getTextArea().getSelectedText();
        StringSelection data = new StringSelection(selection);
        clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(data, data);
        if (cut) {
            deleteActionPerformed();
        }
    }

    void createNewByCleaningOld() {
        notepad.setTitle(Notepad.DEFAULT_TITLE);
        setText("");
        notepad.isDocSaved = false;
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
