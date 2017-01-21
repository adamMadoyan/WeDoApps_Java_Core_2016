package auditorium.lesson6;


import auditorium.lesson3.Circle;
import auditorium.lesson4.StringDemo;

public class Draft {

    public static void main(String [] args) {


        Object o = new Object();
        o = null;

        String s = "JAAAAVA";

        Circle circle = (Circle) o;

        System.out.println(circle.getX());

        System.out.println(circle);

        StringDemo stringDemo = new StringDemo();
    }

    public void test() throws CloneNotSupportedException {
        super.clone();
    }

}
