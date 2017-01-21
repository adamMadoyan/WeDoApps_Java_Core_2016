package auditorium.lesson1;

/**
 * Class description.
 *
 * @author Adam Madoyan
 */
public class PrimitiveTypes {


    public static void main(String[] args) {

        byte b = 127;
        byte bb = -128;

        System.out.println("b + bb = " + (b + bb));

        float f = 45.3f;
        System.out.println("f / 5 = " + (f / 5));

        boolean v = true;

        System.out.println("v = " + v);

        char ch = '1';

        System.out.println("ch is : " + ch);
        System.out.println("ch int value is : " + (int) ch);


        int i = 4;

        int j = 5;

        System.out.println("i | j : "  + (i | j));

        System.out.println("i & j : "  + (i & j));

        System.out.println("i ^ j : "  + (i ^ j));

        System.out.println("~i : " + (~i));

        System.out.println("i >> 2 " + (i >> 2));




        int t = 42 % j;

        System.out.println("t : " + t);

        int y = 78;

        short sh = (short) y;




    }

}
