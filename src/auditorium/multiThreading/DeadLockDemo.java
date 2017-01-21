package auditorium.multiThreading;

public class DeadLockDemo {


    public static void main(String[] args) {

        final A a = new A();
        final B b = new B();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                a.test(b);

            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {

                b.test(a);

            }
        });

        t1.start();
        t2.start();
    }

}

class A {

    synchronized void test(B b) {
        System.out.println("Used class A");

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        b.test(this);

        System.out.println("Unused class A");
    }
}

class B {
    synchronized void test(A a) {
        System.out.println("Used class B");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a.test(this);
        System.out.println("Unused class B");
    }
}