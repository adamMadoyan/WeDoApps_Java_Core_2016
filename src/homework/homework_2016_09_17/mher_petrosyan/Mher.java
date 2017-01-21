package homework.homework_2016_09_17.mher_petrosyan;

public class Mher {
    public static void main(String[] args) {
        int myInt = 5;
        for (int i = 0; i < myInt; i++) {
            for (int j = i; j < myInt; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < myInt; i++) {
            for (int j = (myInt - 1) - i; j < myInt; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

}

    