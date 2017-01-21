package homework.homework_2016_09_17.anna_melikyan;

public class HomeWork2 {

    public static void main(String[] args) {
        Romb();
    }


    public static int Romb() {
        int i, k;
        for (i = 1; i < 5; ++i) {
            for (k = 5; k >= 1; --k) {
                if (k > i) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }

            System.out.println("");
        }

        for (i = 1; i <= 5; ++i) {
            for (k = 1; k <= 5; ++k) {
                if (k < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
        return 5;
    }


}





