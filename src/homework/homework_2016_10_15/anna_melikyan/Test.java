package homework.homework_2016_10_15.anna_melikyan;

/**
 * Created by Anna on 14.10.2016.
 */
public class Test {
    public static void main(String[] args) {
        Stack stack1 = new Stack(5);

        for (int i = 0; i <= 10; i++) {
            stack1.push(i);
        }


        for (int i = 0; i <= 10; i++) {
            System.out.println(stack1.pop());
        }

        //System.out.print(stack1.pop());
    }
}
