package homework.homework_2016_09_24.telman_gurgenyan;

import java.util.Random;


public class ArrayUtil2 {
    public static void main(String[] args) {

     int [] array = randomIntArray(10,50);
     print(array,": ");

        int max = getMaximum(array);
        System.out.println("Max : " + max);

        int min = getMinimum(array);
        System.out.println("Min : " + min);

        int sum = getSum(array);
        System.out.println("Sum : " + sum);

       reverse(array);
        print(array,": ");
    }






    public static int[] randomIntArray(int length, int n) {
        int [] a = new int[length];
        Random aR = new Random();
        for(int i = 0; i < a.length; i++){
            a[i]=aR.nextInt(n);
        }
        return a;
    }





    public static void sortByOddAndEven(int[] array) {
     /* for(int i = 0; i<array.length; i++){
          for(int j = i+1; j < (array.length-1);j++)
          if((array[i]+array[j])%2==0){
              swap(array, array[i+1],array[j+1]);
          }
          else
              break;
      }*/
    }





    public static int getMaximum(int[] array) {
        int max = 0;
        for (int aM = 0; aM < array.length; aM++){
            if(array[aM]> max) {
                max = array[aM];
            }
        }
        return max;
    }



    public static int getMinimum(int[] array) {
        int min = array[0];
        for(int aMin = 0; aMin <array.length; aMin++ ){
            if(min > array[aMin] ){
                min = array[aMin];
            }
        }
        return  min;
    }




    public static int getSum(int[] array) {
        int sum = 0;
        for (int iS = 0; iS<array.length;iS++){
            sum+= array[iS];
        }
        return sum;
    }


    /**
     * Creates the reversed to specified array new array and returns it.
     *
     * @param array  an array corresponting to wich must be created reversed array
     * @return new created reversed array to the specified paramter "array"
     */
    public static int[] reverse(int[] array) {
       int[] arrayTest = new int[array.length];
        for (int i = 0; i< array.length; i++){
            arrayTest[i]=array[(array.length-1)-i];
        }
        for(int i =0; i<array.length; i++){
            array[i]=arrayTest[i];
        }
        return array ;
    }



    /**
     * Reverses the elements order of the specified array
     * @param array  an array: Elements order of wich must be reversed
     */
    public static void reverseInSameArray(int[] array) {
//        TODO implement

    }



    private static void swap(int[] array, int i, int j) {

       int x;
        x = array[i];
        array[i] = array[j];
        array[j]=x;


    }



    public static void print(int[] a) {
        print(a, " ");
    }


    public static void print(int[] a, String delimiter) {
        System.out.print("array [] = {");
        for(int j = 0; j < a.length; j++){

            System.out.print(a[j] + delimiter);

        }
        System.out.print("}");
        System.out.println();
    }


}

