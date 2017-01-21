package auditorium.notepad;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.Properties;

import static auditorium.notepad.NotepadMenuBar.LanguageItem.ARM;
import static auditorium.notepad.NotepadMenuBar.LanguageItem.EN;
import static auditorium.notepad.NotepadMenuBar.LanguageItem.RU;


public class NotepadMenuBar extends JMenuBar {

    private JFileChooser fileChooser;
    private Notepad notepad;
    private File openedFile;
    private Properties properties;

    private JMenu lang;
    private JMenuItem en;
    private JMenuItem ru;
    private JMenuItem arm;

    private JMenu file;
    private JMenuItem _new;
    private JMenuItem open;


    public NotepadMenuBar(final Notepad notepad) {

        properties = new Properties();

        lang = new JMenu();
        en = new JMenuItem();
        ru = new JMenuItem();
        arm = new JMenuItem();

        // File menu items
        file = new JMenu();
        _new = new JMenuItem();
        open = new JMenuItem();

        init(EN);

        en.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                init(EN);
            }
        });

        ru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                init(RU);
            }
        });

        arm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                init(ARM);
            }
        });

        this.notepad = notepad;
        fileChooser = new JFileChooser();


        lang.add(en);
        lang.add(ru);
        lang.add(arm);

        _new.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newActionPerformed();
            }
        });
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openActionPerformed();
            }
        });

        JMenuItem save = new JMenuItem("Save");
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                save();
            }
        });
        final JMenuItem saveAs = new JMenuItem("SaveAs");
        saveAs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveAs();
            }
        });
        final JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exitActionPerformed();
            }
        });
        file.add(_new);
        file.add(open);
        file.add(save);
        file.add(saveAs);
        file.add(exit);
        add(file);
        add(lang);

        notepad.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                exitActionPerformed();
            }
        });

    }

    private void init(LanguageItem languageItem) {
        InputStream stream = NotepadMenuBar.class.getResourceAsStream("/i18n/notepad" + languageItem.getLocale() + ".properties");
        try {
            properties.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        loadMenus();
    }

    private void loadMenus() {
        lang.setText(properties.getProperty("language"));
        file.setText(properties.getProperty("file"));
        _new.setText(properties.getProperty("new"));
        arm.setText(properties.getProperty("arm"));
        ru.setText(properties.getProperty("ru"));
        en.setText(properties.getProperty("en"));
        open.setText(properties.getProperty("open"));
    }

    private void exitActionPerformed() {
        if (isChanged() && isCanceledConfirmDialog()) {
            return;
        }
        System.exit(0);
    }

    private void newActionPerformed() {
        if (isChanged() && isCanceledConfirmDialog()) {
            return;
        }
        notepad.setTitle(Notepad.DEFAULT_TITLE);
        openedFile = null;
        notepad.getTextArea().setText("");
    }

    private boolean save() {
        if (isNewMode()) {
            return saveAs();
        }
        writeTextToFile(openedFile, notepad.getTextArea().getText());
        notepad.setTitle(openedFile.getName());
        return true;
    }

    private boolean isNewMode() {
        return openedFile == null;
    }

    private boolean saveAs() {
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text", "txt"));
        int option = fileChooser.showSaveDialog(notepad);
        if (option == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            writeTextToFile(file, notepad.getTextArea().getText());
            notepad.setTitle(file.getName());
            return true;
        }
        return false;
    }

    public boolean isChanged() {
        if (isNewMode() && !notepad.getTextArea().getText().isEmpty()) {
            return true;
        } else if (!isNewMode()) {
            return !readTextFromFile(openedFile).equals(notepad.getTextArea().getText());
        }
        return false;
    }

    private void openActionPerformed() {
        if (isChanged() && isCanceledConfirmDialog()) {
            return;
        }
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text", "txt"));
        int option = fileChooser.showOpenDialog(notepad);
        if (option == JFileChooser.APPROVE_OPTION) {
            openedFile = fileChooser.getSelectedFile();
            setText(readTextFromFile(openedFile));
            notepad.setTitle(openedFile.getName());
        }
    }

    private static void writeTextToFile(File file, String text) {
        try (FileOutputStream stream = new FileOutputStream(file)) {
            stream.write(text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readTextFromFile(File file) {
        byte[] buffer = new byte[(int) file.length()];
        try (FileInputStream stream = new FileInputStream(file)) {
            stream.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(buffer);
    }

    private void setText(String text) {
        notepad.getTextArea().setText(text);
    }

    private boolean isCanceledConfirmDialog() {
        int option = JOptionPane.showConfirmDialog(notepad, "Would you like to save changes?", "Notepad",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (option == JOptionPane.OK_OPTION) {
            return !save();
        } else if (option == JOptionPane.NO_OPTION) {
            return false;
        }
        return true;
    }


    enum LanguageItem {
        EN("", "English"),
        RU("_ru", "Russian"),
        ARM("_arm", "Armenian");

        LanguageItem(String locale, String language) {
            this.locale = locale;
            this.language = language;
        }

        private String locale;
        private String language;

        public String getLocale() {
            return locale;
        }
    }


}
