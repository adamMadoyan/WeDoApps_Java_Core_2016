package auditorium.collection;

import java.io.Serializable;

/**
 * Class description.
 *
 * @author Adam Madoyan
 */
public class User implements Serializable{

    Integer age;
    String name;

    public User() {
    }

    public User(Integer age, String name) {
        this.age = age;
        this.name = name;
    }
}
