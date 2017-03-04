package auditorium.collection;

import auditorium.User;
import auditorium.figure.Figure;

import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) throws RuntimeException{
        Collection<User> users = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            users.add(new User("Name" + i, "Surname" + i, 20 + i));
        }

        Collection<User> userList = new java.util.LinkedList<>();
        for (int i = 3; i < 8; i++) {
            userList.add(new User("Name" + i, "Surname" + i, 20 + i));
        }

        System.out.println(users.size());
        System.out.println(userList.size());

        System.out.println(users.contains(new User("Name0", "Surname0", 20)));
        System.out.println(userList.contains(new User("Name0", "Surname0", 20)));
        System.out.println(users.containsAll(userList));

        users.removeAll(userList);

        for (User user : users) {
            System.out.println(user);
        }

        Object[] u = users.toArray();
//        User [] u1 = (User[]) users.toArray();  // wrong way
        for (Object o : u) {
            User s = (User) o;
            System.out.println(s.getAge());
        }

        User[] u2 = users.toArray(new User[]{});
        for (User o : u2) {
            System.out.println(o.getAge());
        }

        for (int i = 3; i < 6; i++) {
            users.add(new User("Name" + i, "Surname" + i, 20 + i));
        }

        System.out.println(users.retainAll(userList));

        System.out.println("----------");
        for (User user : users) {
            System.out.println(user);
        }

        String[] args1 = {"1", "2", "3", "3", "4", "5"};
        String[] args2 = {"4", "3", "1", "3", "3", "40", "50"};

        String[] result = intersection(args1, args2);
//
//        for (String s : result) {
//            System.out.print(s + " ");
//        }
        Iterator<User> iterator = users.iterator();

        while (iterator.hasNext()) {
            User user = iterator.next();
            System.out.println(user);
        }


    }

    public static String[] intersection(String[] first, String[] second) {
        Collection<String> col1 = new ArrayList<>();
        Collection<String> col2 = new ArrayList<>();
        Collections.addAll(col1, first);
        Collections.addAll(col2, second);
        col1.retainAll(col2);
        return col1.toArray(new String[]{});
    }

}
