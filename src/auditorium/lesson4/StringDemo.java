package auditorium.lesson4;

public class StringDemo {

    public static void main(String[] args) {

        String a = new String("kuku");
        String b = "kuku";
        String c = "kuku";

        b = b + "u";

        System.out.println(a == b);
        System.out.println(c == b);

        for (int i = 0; i < c.length(); i++) {
            System.out.println(c.charAt(i));
        }

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    private class Inner {

    }

}
