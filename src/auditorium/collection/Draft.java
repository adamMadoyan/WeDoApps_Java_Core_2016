package auditorium.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Class description.
 *
 * @author Adam Madoyan
 */
public class Draft {
    static Integer a = 10;

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 12; i++) {
            int t = i * random.nextInt(20);
            users.add(new User(t, "Name " + i));
            System.out.print(t + " ");
        }
        System.out.println();

        Collections.sort(users, (a, b) -> b.name.compareTo(a.name));

        for (User number : users) {
            System.out.println(number);
        }


        Runnable runnable = System.out::println;

        new Thread(runnable);

        // JDK 1.8
        UserFactory<User> userFactory = User::new;
        User user = userFactory.createUser(a, "ANUN");

        UserFactory<User> userUserFactory = (d,c)-> {
            System.out.println(a++);
            return new User();
        };

        // JDK 1.7

        UserFactory<User> userFactory1 = new UserFactory<User>() {
            @Override
            public User createUser(Integer age, String name) {
                a = 12;
                return new User(a,name);
            }
        };

        userFactory1.createUser(10,"anun");

    }

}
