package homework.homework_2016_12_10.artur_khachatryan;

import javax.swing.*;
import java.awt.*;

public class Notepad extends JFrame {

    public static void main(String[] args) {
        new Notepad();
    }

    public Notepad() {
        super("My Not Pad");
        setSize(500, 836);
        setLocation(1, 1);

        TextArea textArea = new TextArea();
        // textArea.setSize(100,100);
        add(textArea);

        JPanel jPanel = new JPanel();
        jPanel.setSize(100, 111);

        JLabel line1 = new JLabel("Line 1");
        JLabel column1 = new JLabel("Column 1");

        TextField line = new TextField("Line 1");
        TextField column = new TextField("Column 1");

        jPanel.add(line);
        jPanel.add(column);
        jPanel.add(line1);
        jPanel.add(column1);
        add(jPanel, BorderLayout.SOUTH);

        JMenuBar menuBar = new JMenuBar();

        JMenu file = new JMenu("File");

        JMenuItem create = new JMenuItem("Create         CTRL + N");
        JMenuItem open = new JMenuItem("Open...        CTRL + O");
        JMenuItem save = new JMenuItem("Save           CTRL + S");
        JMenuItem save_as = new JMenuItem("Save As...");
        JMenuItem page_Setup = new JMenuItem("Page Setup...");
        JMenuItem print = new JMenuItem("Print...        Ctrl + P");
        JMenuItem exit = new JMenuItem("Exit");

        file.add(create);
        file.add(open);
        file.add(save);
        file.add(save_as);
        file.add(page_Setup);
        file.add(print);
        file.add(exit);

        // file.addActionListener(new ActionListener() {
        //   @Override
        //    public void actionPerformed(ActionEvent e) {
        //   }
        // });

        JMenu edit = new JMenu("Edit");

        JMenuItem undo = new JMenuItem("Undo        Ctrl+Z");
        JMenuItem cut = new JMenuItem("Cut         Ctrl+C");
        JMenuItem copy = new JMenuItem("Copy        Ctri+C");
        JMenuItem paste = new JMenuItem("Paste       Ctri+V");
        JMenuItem delete = new JMenuItem("Delete         Del");
        JMenuItem find = new JMenuItem("Find...     Ctrl+f");
        JMenuItem find_Next = new JMenuItem("Find Next       F3");
        JMenuItem replace = new JMenuItem("Replace...  Ctrl+H");
        JMenuItem go_TO = new JMenuItem("Go To       Ctrl+G");
        JMenuItem select_ALL = new JMenuItem("Select_ALL  Ctrl+A");
        JMenuItem time_Date = new JMenuItem("Time/Date       F5");

        edit.add(undo);
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(delete);
        edit.add(find);
        edit.add(find_Next);
        edit.add(replace);
        edit.add(go_TO);
        edit.add(select_ALL);
        edit.add(time_Date);


        JMenu format = new JMenu("Format");

        JMenuItem word_wrap = new JMenuItem("Word Wrap");
        JMenuItem font = new JMenuItem("font...");

        format.add(word_wrap);
        format.add(font);

        JMenu view = new JMenu("View");

        JMenuItem status_bar = new JMenuItem("Status bar");
        view.add(status_bar);

        JMenu help = new JMenu("Help");
        JMenuItem view_help = new JMenuItem("View help");
        JMenuItem about_the_program = new JMenuItem("About the program");

        help.add(view_help);
        help.add(about_the_program);

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(format);
        menuBar.add(view);
        menuBar.add(help);

        // menuBar.setVisible(true);

        // add(menuBar,BorderLayout.NORTH);
        setJMenuBar(menuBar);

        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void add(MenuBar menuBar) {
    }

}




