package homework_16_11_26.homework_19_11_2016;

public class ArrayTest {

    public static void main(String[] args) {

        DynamicArrayImpliments<String> tDS = new DynamicArrayImpliments<>(4);


        tDS.isEmpty();

        tDS.add("555");
        tDS.contains("ss");
        tDS.get(0);
       try {
           tDS.set(0, "m");
       }catch (Exception e){
           System.out.println("set  in this method there is problem" + e);
       }
        System.out.println(tDS.indexOf("ss"));
        System.out.println(tDS.size());


        System.out.println(tDS.remove(20));

        System.out.println("End ****");

    }
}

