package auditorium.hanoitower;

import auditorium.figure.Figure;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Peg extends Figure {

    public static final int standHeight = 10;
    public static final int pegWidth = 7;
    public static final Color DEFAULT_COLOR = Color.CYAN;
    private List<Disk> disks;

    public Peg(int x, int y, int width, int height, JPanel canvas) {
       this(x, y, width, height, DEFAULT_COLOR, canvas);
    }

    public Peg(int x, int y, int width, int height, Color color, JPanel canvas) {
        super(x, y, width, height, color, canvas);
        disks = new ArrayList<>();
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        //Draw stand
        g.fillRect(getX(), getStandY(),
                getWidth(), standHeight);
        //Draw peg
        g.fillRect(getPegStandCenterX() - pegWidth/2, getY(),
                pegWidth, getHeight() - standHeight);

        for (Disk disk:disks) {
            disk.draw(g);
        }
    }

    @Override
    public boolean isBelong(int x, int y) {
        return false;
    }

    public void addDisk(Disk disk) {
        disks.add(disk);
    }

    public Disk removeDisk(){
         return disks.remove(disks.size() - 1);
    }

    public int getStandY() {
        return getY() + getHeight() - standHeight;
    }

    public Disk getLastDisk(){
        return disks.size() > 0 ? disks.get(disks.size() - 1) : null;
    }

    public int getPegStandCenterX(){
        return getX() + getWidth()/2;
    }
}
