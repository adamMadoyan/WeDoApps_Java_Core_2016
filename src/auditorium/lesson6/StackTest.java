package auditorium.lesson6;

public class StackTest {

    public static void main(String[] args) {

        try {

            Stack<String> stack = new StackImpl<>(-5);


            Stack<Integer> stackInteger = new StackImpl<>();

            stackInteger.push(45);
            stackInteger.push(45);
            stackInteger.push(45);
            stackInteger.push(45);

            stack.push("Hello world!");

            String s = stack.pop();

            System.out.println(s);

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }


}
