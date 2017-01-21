package DynamicArrayException;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;




    public class TwoDate {
        public static void main(String args[]) {
            DynamicArray ob = new DynamicArray();
            ob.add("a");
            ob.add("b");
            ob.add("c");
            ob.add("d");


            int s = ob.size();
            System.out.println(s);

            boolean b = ob.isEmpty();
            System.out.println(b);

            boolean c = ob.contains("c");
            System.out.println(c);

            int i = ob.indexOf("j");
            System.out.println(i);

           try{
                Object g = ob.get(18);
                System.out.println(g);
           }
           catch (MyExceptions.WrongIndexExcepttion e){
              System.out.println(e.getMessage());
           }



            try {
            Object set = ob.set(0, "b");
            System.out.println(set);
            }
            catch (MyExceptions.WrongIndexExcepttion e){
                System.out.println(e.getMessage());
            }

            System.out.println(Arrays.toString(ob.storage));

            try{
            ob.add(0, 33);
            }
            catch (MyExceptions.WrongIndexExcepttion e){
                System.out.println(e.getMessage());
            }

           try{
            Object r = ob.remove(2);
            System.out.println(r);}
           catch (MyExceptions.WrongIndexExcepttion e){
               System.out.println(e.getMessage());
           }


        }
    }


