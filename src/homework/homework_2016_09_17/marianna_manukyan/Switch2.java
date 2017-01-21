package homework.homework_2016_09_17.marianna_manukyan;

/**
 * Created by Mariana on 9/16/2016.
 */
public class Switch2 {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
