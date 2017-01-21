package homework.homework_2016_12_24.robert_tadevosyan.notepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.*;
import java.nio.file.FileAlreadyExistsException;

public class Notepad extends JFrame {

    public static final String NOTEPAD = " - Notepad";

    public static void main(String[] args) {
        new Notepad();
    }

    private static final String DEFAULT_TITLE = "Untitled";

    private JTextArea textArea;
    private DefaultListModel<Integer> linesNumbers;
    private JList mList;

    public Notepad() {
        super(DEFAULT_TITLE + NOTEPAD);
        linesNumbers = new DefaultListModel<>();
        linesNumbers.addElement(1);
        mList = new JList(linesNumbers);
        mList.setFocusable(true);
        mList.setFixedCellHeight(16);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setSize(1000, 500);
        addJPanelWithScrolling();
        NotepadMenuBar menuBar = new NotepadMenuBar(this);
        setJMenuBar(menuBar);
        windowListenerForNotePad();
        setVisible(true);
    }

    private void addJPanelWithScrolling() {
        JPanel panel = new JPanel();
        textAreaInitializing();
        panel.add(mList, BorderLayout.EAST);
        panel.add(textArea, BorderLayout.CENTER);
//        panel.setSize(getWidth(),getHeight());
        panel.setBackground(Color.WHITE);
        JScrollPane scroll = new JScrollPane(panel,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        add(scroll);
    }

    private void textAreaInitializing() {
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setSize(getWidth(), getHeight());
        textArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == '\n') {
                    linesNumbers.addElement(textArea.getLineCount());
                } else if (e.getKeyChar() == '\b' && linesNumbers.size() > 1) {
                    linesNumbers.removeElementAt(linesNumbers.size() - 1);
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    public void exitActionPerformed() {
        if (!textArea.getText().isEmpty()) {
            openAlertBeforeClosing();
        } else {
            System.exit(0);
        }
    }

    private void openAlertBeforeClosing() {
        int n = createJOptionPaneDialog("Close without saving ?", "Are you sure to close this window?", JOptionPane.YES_NO_OPTION, new Object[]{"Yes", "No"});
        if (n == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    private int createJOptionPaneDialog(String title, String question, int optionType, Object[] options) {
        return JOptionPane.showOptionDialog(this, title,
                question, optionType, JOptionPane.QUESTION_MESSAGE,
                null, options, JOptionPane.CANCEL_OPTION);
    }

    private void windowListenerForNotePad() {
        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                exitActionPerformed();
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println();
            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title + NOTEPAD);
    }

    //-----------------Getters and Setters----------------------//
    public JTextArea getTextArea() {
        return textArea;
    }

    public void openFile(File file) {
        try (FileReader fileReader = new FileReader(file.getAbsolutePath())) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String sCurrentLine;
            while ((sCurrentLine = bufferedReader.readLine()) != null) {
                textArea.setText(sCurrentLine);
            }
        } catch (FileNotFoundException e) {
            fileNotFoundAlert();
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveFile(File file) {
        try (FileWriter fileWriter = new FileWriter(file)) {
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String savingText = textArea.getText();
            bufferedWriter.write(savingText);
            bufferedWriter.flush();
        } catch (FileAlreadyExistsException e) {
            fileNotFoundAlert();
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void fileNotFoundAlert() {
        createJOptionPaneDialog("File with specified name does not exist.", "File not found !!!", JOptionPane.CLOSED_OPTION, new Object[]{"Ok"});
    }
}
