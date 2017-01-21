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
        Integer c = 5;

        a++;

        Integer aaa = new Integer(55);

        int cc = aaa;

        System.out.println(c == aa);
        System.out.println(a == aaa);

        a = -128;
        aa = -128;
        System.out.println(a == aa);

        Integer w = new Integer(55);
        Integer q = new Integer(56);
        int iQ = 55;
        System.out.println(q == iQ);




    }

}
