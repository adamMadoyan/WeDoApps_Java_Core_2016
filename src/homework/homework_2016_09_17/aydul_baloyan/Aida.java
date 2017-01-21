package homework.homework_2016_09_17.aydul_baloyan;

public class Aida {
    public static void main(String[] args) {
        int process = 7;
        for (int a = 0; a < process; a++) {
            for (int d = (process - 1) - a; d < process; d++) {
                System.out.print("*");

            }
            System.out.println();
        }
        for (int a = 0; a < process; a++) {
            for (int b = a; b < process; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int a = 0; a < process; a++) {
            for (int c = (process - 1) - a; c > 0; c--) {
                System.out.print(" ");

            }
            for (int c = (process - 1) - a; c < process; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int a = 0; a < process; a++) {
            for (int c = a; c > 0; c--) {
                System.out.print(" ");

            }
            for (int c = a; c < process; c++) {
                System.out.print("*");

            }
            System.out.println();
        }


    }
}

