package homework.homework_2016_10_01.artur_khachatryan;


public class JavaApplication2 {


    public static void main(String[] args) {

        DynamicArray a = new DynamicArray(15);
        a.printArray();


        System.out.println(a.isEmpty());


        System.out.println(a.size());
        a.add(3);
        a.add(7);
        a.add(5);
        a.add(1);
        for (int i = 0; i < a.s.length; i++) {
            System.out.print(a.s[i]);
        }
        System.out.println();
        System.out.println(a.size());
        System.out.println(a.isEmpty());
        System.out.println(a.contains(3));
        System.out.println(a.contains(9));
        System.out.println("uuuuuuuuuu");

        System.out.println(a.indexOf(1));
        System.out.println(a.get(3));
        for (int i = 0; i < a.s.length; i++) System.out.print(a.s[i]);
        System.out.println();
        a.printArray();
        a.set(3, 4);

        for (int i = 0; i < a.s.length; i++) System.out.print(a.s[i]);
        System.out.println();
        a.add(1, 9);
        for (int i = 0; i < a.s.length; i++) System.out.print(a.s[i]);
        System.out.println();
        a.remove(2);
        for (int i = 0; i < a.s.length; i++) System.out.print(a.s[i]);
        System.out.println();
        a.add(9);
        a.add(7);
        a.add(4);
        for (int i = 0; i < a.s.length; i++) System.out.print(a.s[i]);
        System.out.println();

        a.add(4);
        a.add(4);

        a.add(4);
        a.add(4);
        a.add(4);
        a.add(4);
        a.add(4);

        a.add(4);
        a.add(4);
        a.add(4);

        for (int i = 0; i < a.s.length; i++) System.out.print(a.s[i]);
        System.out.println();
        System.out.println("uuuuuuuuuuuuuuuuuuu");

        a.printArray();


    }

}


