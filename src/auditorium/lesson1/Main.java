package auditorium.lesson1;

/**
 * Class description.
 *
 * @author Adam Madoyan
 */
public class Main {


    public static void main(String[] args) {

        int length = 7;

        for (int i = 1; i <= length; i += 2) {
            for (int j = i; j < length; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 3; i <= length; i += 2) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = length; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
