package homework.homework_2016_09_17.ani_yeghiazaryan;

public class FigurePainter {

    public static void main ( String[] args){
        drawLeftUpTriangle(5);
        drawRightUpTriangle(5);
        drawLeftBottomTriangle(5);
        drawRightBottomTriangle(5);
        drawRhombus(5);
    }

    /**
     *      *
     *      * *
     *      * * *
     *      * * * *
     *
     */
    public static void drawLeftUpTriangle(int length){
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {

                System.out.print("* ");
            }
            System.out.println(" ");

        }
    }

    /**
     *             *
     *           * *
     *         * * *
     *       * * * *
     *
     */
    public static void drawRightUpTriangle(int length){
        int length2 = length;
        for (int i = 0; i < length; i++) {
            for (int j = 0 ; j < length2 - 1; j++) {
                System.out.print(" ");
            }
            length2 = length2 - 1;
            System.out.println(repeat("*", i));
        }
    }
    public static String repeat(String s, int times) {
        if (times <= 0) return "";
        else return s + repeat(s, times-1);
    }


    /**
     *
     *       * * * *
     *       * * *
     *       * *
     *       *
     *
     */
    public static void drawLeftBottomTriangle(int length){
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {

                System.out.print("* ");
            }
            System.out.println(" ");

        }
    }

    /**
     *
     *       * * * *
     *         * * *
     *           * *
     *             *
     *
     */
    public static void drawRightBottomTriangle(int length){
        for (int i = length; i >=1 ; i--) {
            for (int j = length; j >i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < i ; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    /**
     *
     *        *
     *       * *
     *      * * *
     *     * * * *
     *      * * *
     *       * *
     *        *
     */
    public static void drawRhombus(int length){
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i * 2); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int i = length - 2; i >=1 ; i--) {
            for (int j = 5; j > i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i * 2); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }


}