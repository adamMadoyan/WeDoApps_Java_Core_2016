package homework.homework_2016_09_17.anna_melikyan;

import java.util.Random;

/**
 * This class contains utility methods for util
 * manipulation.
 */
public class ArrayUtil {


    public static void main(String[] args) {

        int[] array = randomIntArray(15, 10);
        print(array);
        sortByOddAndEven(array);
        print(array);

        System.out.print("Max : ");
        int max = getMaximum(array);

        System.out.print("Min : ");
        int min = getMinimum(array);

        System.out.print("Sum : ");
        int sum = getSum(array);



    }

    public static void sortByOddAndEven(int[] array) {
        for (int i = 0; i < array.length - 2; i++) {
            if (((array[i] + array[i + 1]) & 1) == 1) {
                continue;
            }
            for (int j = i + 2; j < array.length; j++) {
                if (((array[i] + array[j]) & 1) == 1) {
                    swap(i + 1, j, array);
                }
            }
        }
    }

    private static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * Creates an util filled with random values.
     *
     * @param length the length of the util
     * @param n      the number of possible random values
     * @return an util filled with length numbers between
     * 0 and n-1
     */
    public static int[] randomIntArray(int length, int n) {
        int[] a = new int[length];

        Random array = new Random();

        for (int i = 0; i < a.length; i++) a[i] = array.nextInt(n);

        return a;
    }


    public static int getMaximum(int[] array) {

        int max = array[9];

        for (int i = 0; i <= array.length - 1; i++) {

            if (array[i] >= max) {

                max = array[i];


            }

        }

        System.out.println(max);

        return 0;   // this must be replaced by correct code
    }


    public static int getMinimum(int[] array) {
        int min = array[0];

        for (int i = 0; i <= array.length - 1; i++) {

            if (array[i] <= min) {
                min = array[i];
            }
        }

        System.out.println(min);

        return 0;   // this must be replaced by correct code
    }

    /**
     * Calculates the sum of specified <code>util</code>  elements
     *
     * @param array specified int util
     * @return the sum of the specified util elements
     */
    public static int getSum(int[] array) {

        int s = 0;

        for (int i = 0; i <= array.length - 1; i++)

            s = s + array[i];

        System.out.println(s);

        return 0;   // this must be replaced by correct code
    }

    public static void print(int[] a) {
        print(a, " ");
    }


    public static void print(int[] a, String delimiter) {

        delimiter = ", ";

        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + delimiter);

        }

        System.out.println();

    }


}
      
