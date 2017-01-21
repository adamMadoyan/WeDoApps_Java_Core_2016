package homework.homework_2016_10_01.rob_tadevoyan;

/**
 * Created by Robert on 28.09.2016.
 */
public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int x, int y, int width, int height) {
        setX(x);
        setY(y);
        setWidth(width);
        setHeight(height);
    }

    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", height=" + height +
                '}';
    }


    /**
     * Should print rectangle on console like that, when x = 6, y = 3, with = 8, height = 4
     *
     *
     *     ********
     *     ********
     *     ********
     *     ********
     *
     */
    public void printOnConsole() {
        setXCoordinateToRectangleInConsole();
        for(int i = 0 ; i < height;i++){
            for(int j = 0;j < width; j++){
                System.out.printf("*");
            }
            setYCoordinateToRectangleInConsole();
        }
        // todo implement
    }
    private void setXCoordinateToRectangleInConsole(){
        for(int i = 0;i < x; i++){
            System.out.println();
        }
        setYCoordinateToRectangleInConsole();
    }
    private void setYCoordinateToRectangleInConsole(){
        System.out.println();
        for( int i = 0 ; i < y ; ++i){
            System.out.printf(" ");
        }
    }

    /**
     * Should print only borders of rectangle on console like that, when x = 6, y = 3, with = 8, height = 4
     *
     *
     *     ********
     *     *      *
     *     *      *
     *     ********
     *
     */
    public void printBorderOnConsole() {
       setXCoordinateToRectangleInConsole();
        for(int i = 1; i <= height; i++ ) {
            for(int j = 1; j <= width; j++ ) {
                    if(i == 1|| j ==1 || j == width || i == height){
                        System.out.printf("*");
                    }else {
                        System.out.printf(" ");
                    }
            }
            setYCoordinateToRectangleInConsole();
        }

    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x < 0) {
            System.out.println("X coordinate can not be negative !!!!!! " + x);
            return;
        }
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
