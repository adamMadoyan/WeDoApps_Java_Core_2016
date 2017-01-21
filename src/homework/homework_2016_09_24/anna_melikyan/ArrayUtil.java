package homework.homework_2016_09_24.anna_melikyan;

import java.util.Random;

/**
 * This class contains utility methods for util
 * manipulation.
 */
public class ArrayUtil {
    public static void main(String[] args) {

        int [] array = randomIntArray(30, 20);
        print(array);


        int max = getMaximum(array);
        System.out.println("Max : " + max);

        int min = getMinimum(array);
        System.out.println("Min : " + min);

        int sum = getSum(array);
        System.out.println("Sum : "+ sum);

       print(reverse(array));
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

        int[] ar = new int[length];

        Random array = new Random();

        for (int i = 0; i < ar.length; i++) ar[i] = array.nextInt(n);

        return ar;
    }

    /**
     * Sorts the util elements by odd and even number
     * such that if first number is odd then second must be even number
     * this means that it will be found the next even number and swap with the second element
     * if the second element is odd. And so on for the next elements of the util
     */
    public static void sortByOddAndEven() {
        //for (int i = 0; i <= randomIntArray(arr).length; i++);
    }

    public static int getMaximum(int[] array) {
        int max = array[0];

        for ( int i = 0; i<= array.length-1; i++) {

            if (array[i] >= max) {

                max = array[i];

            }

        }

        return max;   // this must be replaced by correct code
    }


    public static int getMinimum(int[] array) {

        int min = array[0];

        for ( int i = 0; i<= array.length-1; i++) {

            if (array[i] <= min) { min = array[i];}
        }

        return min;
    }

    /**
     * Calculates the sum of specified <code>util</code>  elements
     *
     * @param array specified int util
     * @return the sum of the specified util elements
     */
    public static int getSum(int[] array) {

        int s = 0;

        for ( int i = 0; i <= array.length - 1; i++)

            s = s + array[i];

        return s;
    }


    /**
     * Creates the reversed to specified array new array and returns it.
     *
     * @param array  an array corresponting to wich must be created reversed array
     * @return new created reversed array to the specified paramter "array"
     */
    public static int[] reverse(int[] array) {

        int [] arr = new int[array.length] ;
        int i;
        int j;
        for( i = 0, j = array.length - 1; i < j; i++, j--) {
            swap(array, i, j );

        }

        return array;   // this must be replaced by correct code
    }

    /**
     * Reverses the elements order of the specified array
     * @param array  an array: Elements order of wich must be reversed
     */
    

    /**
    * Swaps the elements at the specified positions in the specified array.
    * (If the specified positions are equal, invoking this method leaves
    * the array unchanged.)
    *
    * @param array The array in which to swap elements.
    * @param i the index of one element to be swapped.
    * @param j the index of the other element to be swapped.
    * @throws IndexOutOfBoundsException if either i or j
    *         is out of range (i < 0 || i >= array.length
    *         || j < 0 || j >= array.length).
    */
    private static void swap(int[] array, int i, int j) {

        int c;

            c = array[i];

            array[i] = array[j];

            array[j] = c;

    }

    public static void print(int[] a) {
        print(a, " ");
    }

    /**
     * Prints all elements in an array by using specified delimiter between elements.
     *
     * @param a the util to print
     */
    public static void print(int[] a, String delimiter) {

        delimiter = ", ";

        for (int i = 0; i < a.length; i++)  {

            System.out.print(a[i]+delimiter);

        }

        System.out.println();

    }

}



      
