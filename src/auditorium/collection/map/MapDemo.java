package auditorium.collection.map;


import auditorium.model.User;

import java.util.*;

public class MapDemo {


    public static void main(String[] args) {


        Map<String, User> userMap = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            String username = "User_Name_" + i;
            User user = new User(username, "Name" + i, "LastName" + i,
                    new Date(), "email" + i, (i & 1) == 1 ? User.Gender.MALE : User.Gender.FEMALE);
            userMap.put(username, user);
        }


        System.out.println("================KEYS==============");
        Set<String> keys = userMap.keySet();

        keys.forEach(System.out::println);

        System.out.println("================VALUES==============");
        Collection<User> values = userMap.values();

        values.forEach(System.out::println);


        System.out.println("================Entries==============");
        Set<Map.Entry<String, User>> entries = userMap.entrySet();

        entries.forEach(System.out::println);


    }

}
