package auditorium.lesson5;

public class ClassDemo {

    public static void main(String[] args) {

        A a = new A();
        A b = new B();

//        a.print();


//        b.print();

//        b.test();

//        B bb = (B) new A();
//
//        ((B)b).print();
//
//        B obj = (B) b;
//
//        obj.print();
//


    }

}


class A {
    int a = 10;

    public A() {
//        System.out.println("A");
        print();
    }


    void print() {
//        System.out.println("In A class print method");
        System.out.println(a);
    }
}

class B extends A {
    int a = 50;

    public B() {
//        System.out.println("B");
    }

    @Override
    void print() {
//        System.out.println("In B class print method");
        System.out.println(a);
    }

}






