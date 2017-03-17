package homework.homework_2017_02_18.telman_gurgenyan;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        carT();
        System.out.println("************************");
        userT();

    }

    public static void carT() {
        TreeSet<Car> setCar = new TreeSet<>();
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            Car car = new Car("BMW", "3 Seria", (r.nextInt(27) + 1990));
            setCar.add(car);
        }

        for (Car c : setCar) {
            System.out.println(c);
        }

    }

    public static void userT() {
        String[] nameArray = {"Karen", "Zaven", "Robert", "Anna", "Telman"};
        String[] srnameArray = {"Madoyan", "Xachatryan", "Tadevosyan", "Melikyan", "Gurgenyan"};
        Set<User> setUser = new HashSet<>();
        Random rn = new Random();


        for (int i = 0; i < 10; i++) {
            rn.nextInt();
            User user = new User(nameArray[rn.nextInt(4)], srnameArray[rn.nextInt(4)], 20);
            setUser.add(user);

        }

        for (User user : setUser) {
            user.printUser(user);
        }
    }


}
