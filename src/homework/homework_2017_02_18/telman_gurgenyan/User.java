package homework.homework_2017_02_18.telman_gurgenyan;


public class User {

    private String name;
    private String srname;
    private int age;

    public User (String name, String srname, int age){

        this.name = name;
        this.srname = srname;
        this.age = age;

    }


    public void printUser (User user){

        System.out.println("Name: "+user.name+ "   Srname: " + user.srname + "   Age: "+user.age + "   HashCode:  " + user.hashCode());
    }


}
