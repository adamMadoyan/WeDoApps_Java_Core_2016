package auditorium.collection.set;

/**
 * Class description.
 *
 * @author Adam Madoyan
 */
public class Test {


    public static void main(String[] args) {

        CustomSet<String> set = new CustomHashSet<>();
        System.out.println(set.add("AaAaAa"));
        System.out.println(set.add("B"));
        System.out.println(set.add("AaAaBB"));
        System.out.println(set.add("AaBBAa"));
        System.out.println(set.add("BBAaAa"));

        System.out.println(set.size());
        System.out.println(set.contains("A"));
        System.out.println(set.contains("B"));

        System.out.println(set.remove("B"));

        System.out.println(set.contains("B"));
    }

}
