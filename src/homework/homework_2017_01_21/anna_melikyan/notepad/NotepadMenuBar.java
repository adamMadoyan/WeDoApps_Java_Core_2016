package homework.homework_2017_01_21.anna_melikyan.notepad;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class NotepadMenuBar  extends JMenuBar{


    private final Notepad notepad;
    private JMenuBar menuBar;
    private JMenu file, edit, format, help;
    private JMenuItem fnew, open, save,  exit;
    private JMenuItem  cut, copy, paste, delete;
    private JMenuItem font, abNote;
    private JFileChooser fileChooser;




    public NotepadMenuBar(Notepad notepad) {
        //super("NotePad");


        this.notepad = notepad;
        //menuBar = new JMenuBar();
        fileChooser = new JFileChooser();


        file = new JMenu("File");
        edit = new JMenu("Edit");
        format = new JMenu("Format");
        help = new JMenu("Help");

        add(file);
        add(edit);
        add(format);
        add(help);


        fnew = new JMenuItem("New");
        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        exit = new JMenuItem("Exit");

        file.add(fnew);
        file.add(open);
        file.add(save);
        file.add(exit);


        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        delete = new JMenuItem("Delete");




        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(delete);



        font = new JMenuItem("Font");
        format.add(font);


        abNote = new JMenuItem("About NotePad");
        help.add(abNote);

        fnew.addActionListener(new ActionListener() {
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

        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteActionPerformed();
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exitActionPerformed();
            }
        });
        abNote.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(notepad,"NotePad made by Ann.");
            }
        });

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveActionPerformed();
            }
        });
    }


    public  void exitActionPerformed() {

            System.exit(0);
    }

    public void newActionPerformed() {
        notepad.getTextArea().setText("");
    }

    public void openActionPerformed(){
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
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String s;
            while ((s = reader.readLine()) != null) {
                builder.append(s + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.substring(0, builder.length() - 1);
    }


    public void deleteActionPerformed(){

            if (!notepad.getTextArea().getText().isEmpty()) {
                //grel
                notepad.getTextArea().setText("");
            }
    }


    public void saveActionPerformed()  {
        int option = fileChooser.showSaveDialog(notepad);
        if (option == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            //kveradarcne @ndrac fil@
            saveFile(file);
        }
    }

    public void saveFile(File file) {

        try (FileWriter fileWriter = new FileWriter(file)){
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String text = notepad.getTextArea().getText();
            bufferedWriter.write(text);
            bufferedWriter.flush();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setText(String text) {
        notepad.getTextArea().setText(text);
    }
}

