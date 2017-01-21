package homework.homework_2016_11_12.anna_melikyan;


public class DynamicArrayTest {

    public static void main(String[] args) {

        DynamicArrayIml<String> array = new DynamicArrayIml<>();


        array.add("One");
        array.add("Two");
        array.add("Three");
        array.add("Four");
        array.add("Five");

        array.add(2, "seven");

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));

        }

        System.out.println();
        System.out.println(array.indexOf("One"));

        System.out.println();
        System.out.println(array.remove(1));

        System.out.println();
        System.out.println(array.contains("Hi"));

        System.out.println();
        System.out.println(array.set(0, "rdrdrd"));


    }

}

