package quiz.karen_madoyan;

import java.util.ArrayList;
import java.util.List;

public class DynamicArrayTest {

    public static void main(String[] args) {

//        List<Integer> a = new ArrayList<>();
//        a.add(45);
//        System.out.println(a.get(0));

        DynamicArray array = new DynamicArray(5);

        array.add(454);  // 0     [454, 453, -458] 0 0 0 0 0 0 0 0 0 0
        array.add(453);  // 1     [454,  45,  453, -458] 0 0 0 0 0 0 0
        array.add(-458); // 2     [454,  453, -458] -458 0 0 0 0 0 0 0
        System.out.println(array.size());

        array.add(1, 45);
        System.out.println(array.remove(1));

        System.out.println(array.set(12, -555));

        System.out.println(array.get(45));
        System.out.println(array.get(0));

        boolean b = array.contains(458);
        System.out.println(b);
 ;
        System.out.println(array.get(2));
        System.out.println(array.get(3));
        int t = array.size();

        DynamicArray array1 = new DynamicArray();
        array1.add(5656);

        int size = array1.size();

        System.out.println(size);


    }
}
