package auditorium.lesson4;

/**
 * Class description.
 *
 * @author Adam Madoyan
 */
public class WrapperClassDemo {


    public static void main(String[] args) {
        Integer i = new Integer(5);
        Character ch = new Character('5');
        Double d = new Double(45.00);
        Float f = new Float(45.5f);
        Boolean b = new Boolean(true);

        Integer a = 5;
        Integer aa = 5;

        Long l = 5L;
        Long ll = 5L;
        Integer c = -129;
        Integer c1 = -129;

        System.out.println("l == ll > " + (l == ll));
        System.out.println("c == c1 > " + (c == c1));

        a++;

        Integer aaa = new Integer(55);

        int cc = aaa;

        System.out.println(c == aa);
        System.out.println(a == aaa);

        a = -128;
        aa = -128;
        System.out.println(a == aa);

        Integer w = new Integer(55);
        Integer q = new Integer(55);
        int iQ = 55;
        System.out.println("(w == q) = " + (w == q));
        System.out.println(q == iQ);




    }

}
