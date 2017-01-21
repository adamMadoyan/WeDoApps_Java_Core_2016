package auditorium.lesson9;

/**
 * Class description.
 *
 * @author Adam Madoyan
 */
public class HanoiTower {


    public static void main(String[] args) {
        move(3, "A", "B", "C");
    }


    static void move(int n, String first, String second, String third) {
        if (n == 1) {
            System.out.println(first + " >> " + third);
            return;
        }
        move(n - 1, first, third, second);
        System.out.println(first + " >> " + third);
        move(n - 1, second, first, third);

    }

}
