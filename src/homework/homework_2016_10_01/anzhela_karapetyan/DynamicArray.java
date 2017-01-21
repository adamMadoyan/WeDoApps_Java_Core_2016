package homework.homework_2016_10_01.anzhela_karapetyan;

/**
 * Created by Angela on 9/29/2016.
 */
public class DynamicArray {
    public static void main(String[] args) {
        DynamicArrays a = new DynamicArrays();

        a.add(6);
        a.add(8);
        a.add(10);
        a.add(11);
        a.add(12);
        a.add(13);
        a.add(14);
        a.add(15);


        for (int i = 0; i < a.storage.length; i++) {
            System.out.print(a.storage[i] + " ");
        }


        System.out.println();

        int s;
        s = a.size();
        System.out.print(s);

        System.out.println();

        boolean e;
        e = a.isEmpty();
        System.out.print(e);

        System.out.println();

        boolean c;
        c = a.contains(8);
        System.out.print(c);

        System.out.println();

        int i;
        i = a.indexOf(11);
        System.out.print(i);

        System.out.println();

        int gI;
        gI = a.get(0);
        System.out.print(gI);

        System.out.println();


        int sI;
        sI = a.set(3, 2000);
        System.out.print(sI);

        System.out.println();

        for (i = 0; i < a.storage.length; i++) {
            System.out.print(a.storage[i] + " ");
        }

        System.out.println();

        a.add(5, 11);

        System.out.println();

        int r = a.remove(0);
        System.out.print(r);

        System.out.println();

        for (i = 0; i < a.storage.length; i++) {
            System.out.print(a.storage[i] + " ");
        }

    }

}




