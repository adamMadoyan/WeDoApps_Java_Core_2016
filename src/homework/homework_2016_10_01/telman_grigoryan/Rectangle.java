package homework.homework_2016_10_01.telman_grigoryan;

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;



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
       for (int i = 0; i<y; i++){ //Y kordinat
           System.out.println();
       }
      for (int j = 0; j<height; j++) { //rectangli bardrutyun
          for (int a = 0; a<x; a++ ){  //X kordinat
              System.out.print(" ");
          }
          for (int i = 0; i < width; i++) { //rectangli erkarutyun
              System.out.print("*");
          }
          System.out.println();
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
        for (int i = 0; i<y; i++){ //Y kordinat
            System.out.println();}

        for (int j = 0; j<height; j++) { //rectangli bardrutyun

            for (int a = 0; a < x; a++) {  //X kordinat
                System.out.print(" ");
            }
                if (j==0 || j == height-1) { //wight stexcum
                    for (int i = 0; i < width; i++) {
                        System.out.print("*");

                    }
                }
                else {
                        System.out.print("*");
                        for (int k = 0; k < (width - 2); k++) {
                            System.out.print(" ");
                        }
                        System.out.print("*");
                      }
            System.out.println();

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
        if (y < 0) {
            System.out.println("Y coordinate can not be negative !!!!!! " + y);
            return;
        }
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width < 0) {
            System.out.println("Width coordinate can not be negative !!!!!! " + width);
            return;
        }
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height < 0) {
            System.out.println("Hwight coordinate can not be negative !!!!!! " + height);
            return;
        }
        this.height = height;
    }
}
