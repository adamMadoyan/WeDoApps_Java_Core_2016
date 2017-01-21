package homework.homework_2016_09_17.telman_gurgenyan;

public class Main {

    public static void main(String[] args) {

        //tarberak 1

        int y = 5;
        for (int j = 0; j < 5; j++) {

            for (int x = y; x > 0; x--) {
                System.out.print("*");

            }
            System.out.println();
            y--;
        }

        //tarberak 2
        int b = 4;
        for (int a = 0; a < 5; a++) {

            for (int c = b; c < 5; c++) {
                System.out.print("*");
            }

            System.out.println();
            b--;
        }


        //tarberak 3
        int b3 = 1;
        int y3 = 5;
        for (int i3 = 0; i3 < 5; i3++) {
            for (int x3 = 0; x3 < y3; x3++) {
                System.out.print(" ");
            }
            for (int a3 = 0; a3 < b3; a3++) {
                System.out.print("*");
            }
            System.out.println();
            b3++;
            y3--;
        }


        //tarberak 4
        int y4 = 0;
        int b4 = 5;
        for (int i4 = 0; i4 < 5; i4++) {
            for (int x4 = 0; x4 < y4; x4++) {
                System.out.print(" ");
            }
            for (int a4 = 0; a4 < b4; a4++) {
                System.out.print("*");
            }
            System.out.println();
            y4++;
            b4--;
        }

        //shexankyun
        int yShe = 3;
        int bShe = 1;
        for (int iShe = 0; iShe < 7; iShe++) {
            for (int xShe = 0; xShe < yShe; xShe++) {
                System.out.print(" ");
            }
            for (int aShe = 0; aShe < bShe; aShe++) {
                System.out.print("*");

            }
            System.out.println();

            if (iShe < 3) {
                bShe += 2;
                yShe--;
            } else if (iShe >= 3) {
                bShe -= 2;
                yShe++;
            }

        }


    }

}
