package auditorium.lesson10;


public class InheritedThread extends Thread {


    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        System.out.println(main.getName() + " started.");
        System.out.println(main.getName() + " priority = " + main.getPriority());
        System.out.println(main.getName() + " state = " + main.getState());

        InheritedThread demo = new InheritedThread("demo");
        System.out.println(demo.getName() + " state = " + demo.getState());
        demo.start();

//        Car bmw = new Car("BMW");
//        bmw.drive(20, 2);
//        Car benz = new Car("AUDI");
//        benz.drive(20, 8);
//
//        for (int i = 0; i < 15; i++) {
//            System.out.println(main.getName() + " > " + i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }


        System.out.println(main.getName() + " ended.");
    }


    public InheritedThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " started.");
        for (int i = 0; i < 15; i++) {
            System.out.println(getName() + " > " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName() + " ended.");
    }
}

class Car implements Runnable {

    private String name;
    private int distance;

    public Car(String name) {
        this.name = name;
    }

    public void drive(int distance, int priority) {
        this.distance = distance;
        Thread thread = new Thread(this);
        thread.setPriority(priority);
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 1; i <= distance; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " moved " + i + " m");
        }
    }
}
