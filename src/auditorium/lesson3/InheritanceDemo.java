//package auditorium.lesson3;
//
//public class InheritanceDemo {
//
//    public static void main(String[] args) {
//        A a = new A();
//        a.print();
//
//        A aa = new B();
//        aa.print();
//
//        Object obj = new B();
//        System.out.println(obj);
//        ((B) obj).print();
//
//    }
//
//}
//
//
//class A {
//
//    /*final*/ void print() {
//        System.out.println("A");
//    }
//
//}
//
//class B extends A {
//
////    @Override
//    void print() {
//        System.out.println("B");
//        super.print();
//    }
//
//
//
//    @Override
//    public String toString() {
//        return "ToString in B class.";
//    }
//}
//
//class C extends A {
//
//    @Override
//    void print() {
//        System.out.println("C");
//    }
//}