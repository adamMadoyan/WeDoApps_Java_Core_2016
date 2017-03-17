package homework.homework_2017_02_11.zaven_madoyan.hanoAshtarak;

import java.awt.*;
import java.util.ArrayList;

public class Tower {

    private Rectangle horizontalTower;
    private Rectangle verticalTower;

    private int horizontalWidth = 210;
    private int horizontalHeight = 10;
    private int vertcalWidth = 10;
    private int verticalHeight = 300;
    private int x;
    private int y;
    private Color color;


    private HanoCanvas canvas;

    private ArrayList<HanoFigure> towers = new ArrayList<HanoFigure>();

    public Tower (int x, int y,HanoCanvas canvas,Color color){
        this.canvas = canvas;
        this.x = x;
        this.y = y;
        this.color = color;
        verticalTower = new Rectangle(x + ((horizontalWidth - vertcalWidth)/2),y,vertcalWidth,verticalHeight,color,canvas);
        horizontalTower = new Rectangle(x, y + verticalHeight ,horizontalWidth,horizontalHeight,color,canvas);
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public int getVerticalHeight() {
        return verticalHeight;
    }

    public int getHorizontalWidth() {
        return horizontalWidth;
    }

    public ArrayList<HanoFigure> getTowers() {
        return towers;
    }

    public int getTowerSize (){
        return towers.size();
    }

    public int getHalfOfWidthDifference (HanoFigure figure){
        return (horizontalWidth - figure.getWidth())/2;
    }

    public void add (int towersNum){
        for (int j = 1; j <= towersNum; j++) {
            towers.add(new Rectangle(x + (j * 4), y + getVerticalHeight()
                    - (j * 10), getHorizontalWidth() - (j * 8), 8, canvas));
        }
    }

    public void add (HanoFigure figur){
        towers.add(figur);
    }

    public boolean remove (HanoFigure figur){
        towers.remove(figur);
        return true;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void move (int x, int y){
        this.x += x;
        this.y += y;
        verticalTower.setX(this.x + ((horizontalWidth - vertcalWidth)/2));
        verticalTower.setY(this.y);
        horizontalTower.setX(this.x);
        horizontalTower.setY(this.y + verticalHeight);
        int i = 1;
        for (;i <= getTowerSize(); i++) {
            towers.get(i-1).setX(this.x + (horizontalWidth - towers.get(i-1).getWidth())/2);
            towers.get(i-1).setY(this.y + getVerticalHeight()-(i * 10));
        }
    }

    public boolean isBelong (int x, int y){
        return verticalTower.isBelong(x,y) || horizontalTower.isBelong(x,y);
    }

    public void draw (Graphics g){
        horizontalTower.draw(g);
        verticalTower.draw(g);
    }
}
