package homework.homework_2016_09_17.rob_tadevosyan;

import java.util.Random;

/**
 * Created by Robert on 12.09.2016.
 */
public class ArraysClass {

    public static void main(String[] args) {
        int [] array = randomIntArray(5, 10);
        print(array);

        int max = getMaximum(array);
        System.out.println("Max : " + max);

        int min = getMinimum(array);
        System.out.println("Min : " + min);

        int sum = getSum(array);
        System.out.println("Sum : " + sum);
     //   print(array," - ; ");
    }


    /**
     * Creates an util filled with random values.
     *
     * @param length the length of the util
     * @param n      the number of possible random values
     * @return an util filled with length numbers between
     *         0 and n-1
     */
    public static int[] randomIntArray(int length, int n) {
        int[] a = null;
        // create an util by the specified  "length" parameter instead of assigning null
        //  Random generator = new Random();
        // use the following method: "nextInt(n)"   of Random class
        // initialize the util (a) using for loop and above mentioned method
        Random generator = new Random();
        a = new int[50];
        for(int i = 0; i < length; i++){
            a[i] = generator.nextInt(n);
        }

        return a;
    }

    public static int getMaximum(int[] array) {
        for(int i = 0; i < array.length; i++){
            for (int j = 0;j < array.length; j++){
                if (array[i] > array[j]) {
                    array[i]= array[i] + array[j];
                    array[j]= array[i]- array[j];
                    array[i]= array[i] - array[j];
                }
            }
        }
        return array[0];
    }


    public static int getMinimum(int[] array) {
        for(int i = 0; i < array.length; i++){
            for (int j = 0;j < array.length; j++){
                if (array[i] < array[j]) {
                    array[i]= array[i] + array[j];
                    array[j]= array[i]- array[j];
                    array[i]= array[i] - array[j];
                }
            }
        }return array[0];
    }

    /**
     * Calculates the sum of specified <code>util</code>  elements
     *
     * @param array specified int util
     * @return the sum of the specified util elements
     */
    public static int getSum(int[] array) {
        int sumOfArrayElements = 0;
        for(int index = 0; index < array.length; index++){
            sumOfArrayElements = sumOfArrayElements + array[index];
        }

        return sumOfArrayElements;   // this must be replaced by correct code

    }

    public static void print(int[] a) {
        print(a, "; ");
    }

    /**
     * Prints all elements in an array by using specified delimiter between elements.
     *
     * @param a the util to print
     */
    public static void print(int[] a, String delimiter) {
        for (int index = 0; index < a.length; index++){
            System.out.printf(a[index]+ delimiter);
        }
        System.out.println("\n");
    }
}
