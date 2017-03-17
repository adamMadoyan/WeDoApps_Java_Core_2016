package homework.homework_2017_02_18.zaven_madoyan.com;

/**
 * Created by Zaven on 15.02.2017.
 */

import java.util.HashSet;
import java.util.TreeSet;

public class Car implements Comparable<Car> {
    private String brend;
    private String model;
    private int manufacture;

    public Car(String brend, String model, int manufacture) {
        this.brend = brend;
        this.model = model;
        this.manufacture = manufacture;
    }


    @Override
    public int compareTo(Car obj) {
        Car entry = (Car) obj;
        int result = brend.compareTo(entry.brend);
        int result1 = model.compareTo(entry.model);
        if (result != 0 || result1 != 0) {
            return result + result1;
        }

        result = manufacture - entry.manufacture;
        if (result != 0 || result1 != 0) {
            return (int) result / Math.abs(result) + (int) result1 / Math.abs(result1);
        }

        return 0;
    }

    public static void main(String[] args) {
        // TreeSet Objects
        TreeSet<Car> ts = new TreeSet<Car>();
        ts.add(new Car("Mersedes", "S600", 2000));
        ts.add(new Car("BMW", "X5", 2006));
        ts.add(new Car("HONDA", "BRIO", 2016));
        for (Car e : ts) {
            System.out.println("Car: " + e.brend + ", model :" + e.model + ", Year: " + e.manufacture);
        }

        // HashSet Objectsn
        HashSet hs = new HashSet();
        hs.add(new User("Zaven", "Madoyan", 28));
        hs.add(new User("Karen", "Madoyan", 27));
        System.out.println(hs);
    }
}
