package homework.homework_2016_09_17.zhora_grigoryan;

/**
 * Created by Admin on 14.09.2016.
 */
public class Zhora {

    public static void main(String[] args) {

        int test = 5;
        for (int a = 0; a < test; a++) {
            for (int d = a; d < test; d++) {
                System.out.print("*");
            }
            System.out.println();


        }
        System.out.println();

        for (int a = 0; a < test; a++) {
            for (int d = (test - 1) - a; d < test; d++) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println();

        for (int a = 0; a < test; a++) {
            for (int c = a; c > 0; c--) {
                System.out.print(" ");
            }
            for (int d = a; d < test; d++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int a = 0; a < test; a++) {
            for (int c = (test - 1) - a; c > 0; c--) {
                System.out.print(" ");
            }
            for (int d = (test - 1) - a; d < test; d++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
