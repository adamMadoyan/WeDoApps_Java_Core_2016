package homework.homework_2016_09_17.anna_melikyan;

/**
 * Created by Anna on 11.09.2016.
 */
public class HomeWork1 {

    public static void main(String[] args) {
        triangleOne();
        System.out.println();
        triangleTwo();
        System.out.println();
        triangleTree();
        System.out.println();
        triangleFour();

    }


    public static int triangleOne() {
        for (int i = 0; i <= 5; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");

            }
            System.out.println(" ");

        }
        return 5;
    }

    public static int triangleTwo() {
        for (int i = 5; i >= 0; i--) {
            for (int k = i; k >= 0; k--) {
                System.out.print("* ");

            }
            System.out.println(" ");

        }
        return 5;
    }

    public static int triangleTree() {
        for (int i = 0; i <= 5; i++) {
            for (int k = 0; k <= 5; k++) {
                if (k < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
        return 5;
    }

    public static int triangleFour() {
        for (int i = 0; i <= 5; i++) {
            for (int k = 5; k >= 0; k--) {
                if (k > i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
        return 5;
    }
}





