package homework.homework_2016_12_03.anna_melikyan.bracechecker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BraceCheckerFrame extends JFrame {
    private BraceChecker braceChecker;
    private JButton parse;
    private JTextArea textArea;
    private JTextField resultField;

    public BraceCheckerFrame() {
        super("BraceChecker");

        JPanel northPanel = new JPanel();
        braceChecker = new BraceChecker();
        parse = new JButton("Parse");
        northPanel.add(parse);
        textArea = new JTextArea();

        JScrollPane scroll= new JScrollPane(textArea);

        resultField = new JTextField(braceChecker.getMessage());
        resultField.setForeground(Color.GREEN);

        add(northPanel, BorderLayout.NORTH);
        add(resultField, BorderLayout.SOUTH);
        add(scroll, BorderLayout.CENTER);

        parse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parseActionPerformed();
            }
        });
        setSize(550, 500);
        setLocation(250, 150);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    private void parseActionPerformed() {
        boolean isParsed = braceChecker.parse(textArea.getText());
        resultField.setText(braceChecker.getMessage());
        if (isParsed) {
            resultField.setForeground(Color.GREEN);
        } else {
            resultField.setForeground(Color.RED);
        }
    }
}