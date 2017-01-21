package homework.homework_2016_12_17.robert_tadevosyan.notepad;

import javax.swing.*;
import java.awt.*;
import java.io.File;

/**
 * Created by Robert on 15.12.2016.
 */
public class ChooseFile {

    FileInterface fileInterface;

    Component parent;

    public ChooseFile(Component parent,FileInterface fileInterface) {
        this.fileInterface = fileInterface;
        this.parent = parent;
    }

    public void openFileChooser() {
        JFileChooser fileOpen = new JFileChooser();
        int ret = fileOpen.showDialog(parent, "Open file");
        if (ret == JFileChooser.APPROVE_OPTION) {
            File file = fileOpen.getSelectedFile();
            fileInterface.openFile(file);
        }
    }

    public void saveFile() {
        JFileChooser saveFile = new JFileChooser();
        int ret = saveFile.showDialog(parent, "Open file");
        if (ret == JFileChooser.APPROVE_OPTION) {
            File file = saveFile.getSelectedFile();
            fileInterface.saveFile(file);
        }
    }
}
