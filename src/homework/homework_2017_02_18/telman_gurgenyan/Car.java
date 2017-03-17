package homework.homework_2017_02_18.telman_gurgenyan;


public class Car implements Comparable<Car> {

    private String breand;
    private String model;
    private int release;


    public Car(String breand, String model, int release) {

        this.breand = breand;
        this.model = model;
        this.release = release;

    }

    @Override
    public String toString() {
        return "Brend " + breand + ": Model " + model + ": Relase " + release;
    }


    @Override
    public int compareTo(Car o) {
        return this.release - o.release;
    }
}
