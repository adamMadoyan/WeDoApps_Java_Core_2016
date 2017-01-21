package homework.homework_2016_12_17.robert_tadevosyan.notepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;

/**
 * Created by Robert on 03.12.2016.
 */
public class NotepadFrame extends JFrame implements FileInterface {

    public static void main(String[] args) {
        new NotepadFrame("Notepad Test");
    }

    JMenuBar menuBar;
    JPanel configPanel;
    JPanel linesNumbers;
    JTextArea lineIndex;
    ArrayList<String> lines;
    JTextArea documentTextArea;
    ChooseFile chooseFile;

    public NotepadFrame(String title) throws HeadlessException {
        super(title);
        chooseFile = new ChooseFile(NotepadFrame.this, NotepadFrame.this);
        addMenuBarAndMenu();
        jpanelConfigurations();
        addToCanvas();
        addingLabelToLinesNumberPanel();
        linesIndexesConfigurationsForTheFirstTime();
        listenerForNPFrame();
        this.setVisible(true);
    }

    private void listenerForNPFrame() {
        addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                if (!documentTextArea.getText().isEmpty()) {
                    openAlertBeforeClosing();
                } else {
                    System.exit(0);
                }
            }

            @Override
            public void windowClosed(WindowEvent e) {

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

    private void linesIndexesConfigurationsForTheFirstTime() {
        lines = new ArrayList<>();
        lines.add("1");
        setLinenNumbers();
    }

    private void addingLabelToLinesNumberPanel() {
        lineIndex = new JTextArea("1");
        lineIndex.setEditable(false);
        lineIndex.setSize(100, MAXIMIZED_VERT);
        add(lineIndex, BorderLayout.WEST);
    }

    private void addToCanvas() {
        add(configPanel, BorderLayout.NORTH);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setSize(1000, 500);
        setLocation(150, 80);
        addEditableTextFieldToCanvas();
    }

    private void addEditableTextFieldToCanvas() {
        documentTextArea = new JTextArea();
        documentTextArea.setWrapStyleWord(true);
        documentTextArea.setBorder(BorderFactory.createEmptyBorder(5, 5, 0, 0));
        detectingTextAreaTextChange(documentTextArea);
        JScrollPane scroll = new JScrollPane(documentTextArea,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        this.add(scroll);
    }

    private void setLinenNumbers() {
        long listSize = lines.size();
        String result = "";
        for (int i = 0; i < listSize; i++) {
            result += lines.get(i) + "\n";
        }
        lineIndex.setText(result);
    }

    private void detectingTextAreaTextChange(final JTextArea textArea) {
        textArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                String lastLineIndex = String.valueOf(textArea.getLineCount() + 1);
                if (e.getKeyChar() == '\n') {
                    lines.add(String.valueOf(textArea.getLineCount()));
                } else if (e.getKeyChar() == '\b' && lineIndex.getText().length() > 1) {
                    lines.remove(lastLineIndex);
                } else {
                    return;
                }
                setLinenNumbers();
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }

    private void jpanelConfigurations() {
        configPanel = new JPanel();
        configPanel.add(menuBar, LEFT_ALIGNMENT);
    }

    private void addMenuBarAndMenu() {
        menuBar = new JMenuBar();
        JMenu first_menu = new JMenu("File");
        JMenu second_menu = new JMenu("Settings");
        addItemsToFirstMenu(first_menu);
        addItemsToSecondtMenu(second_menu);
        menuBar.add(first_menu);
        menuBar.add(second_menu);
    }

    private void addItemsToFirstMenu(JMenu first_menu) {

        JMenuItem createItem = new JMenuItem("Create");
        createItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
        createItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JMenuItem openItem = new JMenuItem("Open");
        createItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0));

        openItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chooseFile.openFileChooser();
            }
        });
        first_menu.add(createItem);
        first_menu.add(openItem);

    }

    private void addItemsToSecondtMenu(JMenu second_menu) {
        JMenuItem saveItem = new JMenuItem("Save");
        saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0));
        saveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chooseFile.saveFile();
            }
        });

        JMenuItem saveAsItem = new JMenuItem("Save As");
        saveAsItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, 0));
        saveAsItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0));
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openAlertBeforeClosing();
            }
        });
        second_menu.add(saveItem);
        second_menu.add(saveAsItem);
        second_menu.add(exitItem);
    }

    private void openAlertBeforeClosing() {
        int n = createJOptionPaneDialog("Close without saving ?", "Are you sure to close this window?", JOptionPane.YES_NO_OPTION, new Object[]{"Yes", "No"});
        if (n == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else if (n == JOptionPane.NO_OPTION) {
        } else if (n == JOptionPane.CLOSED_OPTION) {
        }
    }

    private int createJOptionPaneDialog(String title, String question, int optionType, Object[] options) {
        return JOptionPane.showOptionDialog(this, title,
                question, optionType, JOptionPane.QUESTION_MESSAGE,
                null, options, JOptionPane.CANCEL_OPTION);
    }

    @Override
    public void openFile(File file) {
        try (FileReader fileReader = new FileReader(file.getAbsolutePath())) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String sCurrentLine = "";
            while ((sCurrentLine = bufferedReader.readLine()) != null) {
                documentTextArea.setText(sCurrentLine);
            }
        } catch (FileNotFoundException e) {
            fileNotFoundAlert();
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void fileNotFoundAlert() {
        createJOptionPaneDialog("File with specified name does not exist.", "File not found !!!", JOptionPane.CLOSED_OPTION, new Object[]{"Ok"});
    }

    private void fileAlreadyExistAlert(File file) {
        int alert = createJOptionPaneDialog("File with specified name already exists.", "Change file name ?", JOptionPane.YES_NO_OPTION, new Object[]{"YES", "NO"});
        if (alert == JOptionPane.YES_OPTION) {
//           File
        }
    }

    @Override
    public void saveFile(File file) {
        try (FileWriter fileWriter = new FileWriter(file.getAbsolutePath())) {
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String savingText = documentTextArea.getText();
            bufferedWriter.write(savingText);
        } catch (FileAlreadyExistsException e) {
            fileNotFoundAlert();
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
