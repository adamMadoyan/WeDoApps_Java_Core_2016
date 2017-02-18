package homework.homework_2017_02_11.robert_tadevosyan;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Robert on 04.02.2017.
 */
public class Peg extends Figure {


    private String name;
    private int columnIndex;

    private ArrayList<Disk> diskList;

    public Peg(int columnIndex) {
        super();
        this.columnIndex = columnIndex;
        diskList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Peg(String name, int columnIndex) {
        this.name = name;
        this.columnIndex = columnIndex;
    }

    public Peg(String name, int x, int y, int width, int height, int columnIndex) {
        super(x, y, width, height);
        this.name = name;
        this.columnIndex = columnIndex;
        diskList = new ArrayList<>();
    }

    public Peg(int x, int y, int width, int height, Color color, int columnIndex) {
        super(x, y, width, height, color);
        this.columnIndex = columnIndex;
        diskList = new ArrayList<>();
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getX(), getY(), getWidth(), getHeight());
        g.fillRect(getX() + getWidth() / 2 - FigureCanvas.POINT / 4, getY() - getWidth(), getHeight() / 2, getWidth());
        for (Disk d : diskList) {
            d.draw(g);
        }
    }

    @Override
    public boolean isBelong(int x, int y) {
        return false;
    }

    public void addDiskToColumn(Disk disk) {
        diskList.add(disk);
        for (int i = 0; i < diskList.size(); i++) {
            diskList.get(i).setWidth(i * FigureCanvas.POINT);
            diskList.get(i).setHeight(FigureCanvas.POINT * 3 / 2);
            diskList.get(i).setX(((getX() + getWidth()) / 2 - i * FigureCanvas.POINT / 2) + getX() / 2);
            diskList.get(i).setY(FigureCanvas.ySize / 2 - (FigureCanvas.disksCount - i + 1) * FigureCanvas.POINT + FigureCanvas.POINT / 10);
        }
    }

    public ArrayList<Disk> getDiskList() {
        return diskList;
    }

}
