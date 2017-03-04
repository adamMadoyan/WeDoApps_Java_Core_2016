package auditorium.collection;


/**
 * Class description.
 *
 * @author Adam Madoyan
 */
@FunctionalInterface
public interface UserFactory<U extends User> {
    U createUser(Integer age,String name);
}
