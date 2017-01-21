package quiz.telman_gurgenyan;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

/**
 * This class contains utility methods for util
 * manipulation.
 */
//TODO score 8
public class ArrayUtil {


    public static void main(String[] args) {

        int[] array = randomIntArray(5, 10);
        print(array);
        sortByOddAndEven(array);
        print(array);

        int max = getMaximum(array);
        System.out.println("Max : " + max);

        int min = getMinimum(array);
        System.out.println("Min : " + min);

        int sum = getSum(array);
        System.out.println("Sum : " + sum);
        print(reverse(array));
        print(array);
        reverseInSameArray(array);
        print(array);

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
//        TODO missing validation  -0.5
        int[] a = new int[length];
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            a[i] = r.nextInt(n);
        }
        return a;
    }

    /**
     * Sorts the util elements by odd and even number
     * such that if first number is odd then second must be even number
     * this means that it will be found the next even number and swap with the second element
     * if the second element is odd. And so on for the next elements of the util
     */
    public static void sortByOddAndEven(int[] array) {
//        TODO missing validation incorrect implementation -1.5
        int leg = array.length - 1;
        for (int i = 0; i < leg; i++) {
            if ((array[i] + array[i + 1]) % 2 == 1) {
                continue;
            }
            int k = i + 2;
            while ((array[i] + array[i + 1]) % 2 == 0 && k < 49) {
                swap(array, i + 1, k);
                k++;
            }
        }
    }


    public static int getMaximum(int[] array) {
//        TODO missing validation -0.5
        int arLe = array.length - 1;
        int retMax = array[0];
        for (int i = 0; i < arLe; i++) {
            if (array[i + 1] > retMax) {
                retMax = array[i + 1];
            }
        }
        return retMax;
    }


    public static int getMinimum(int[] array) {
//        TODO missing validation -0.5
        int arLe = array.length - 1;
        int retMin = array[0];
        for (int i = 0; i < arLe; i++) {
            if (array[i + 1] < retMin) {
                retMin = array[i + 1];
            }
        }
        return retMin;
    }

    /**
     * Calculates the sum of specified <code>util</code>  elements
     *
     * @param array specified int util
     * @return the sum of the specified util elements
     */
    public static int getSum(int[] array) {
//        TODO missing validation -0.5
        int leg = array.length;
        int sumRet = 0;
        for (int i = 0; i < leg; i++) {
            sumRet += array[i];
        }
//
        return sumRet;
    }


    /**
     * Creates the reversed to specified array new array and returns it.
     *
     * @param array an array corresponding to wich must be created reversed array
     * @return new created reversed array to the specified paramter "array"
     */
    public static int[] reverse(int[] array) {
//        TODO missing validation -0.5
        int leg = array.length;
        int[] revArray = new int[leg];
        for (int i = 0; i < leg; i++) {
            revArray[leg - 1 - i] = array[i];
        }
        return revArray;
    }

    /**
     * Reverses the elements order of the specified array
     *
     * @param array an array: Elements order of wich must be reversed
     */
    public static void reverseInSameArray(int[] array) {
//        TODO missing validation -0.5
        int leg = array.length / 2;
        int arrLe = array.length-1;
        for (int i = 0; i < leg; i++){
            swap(array,i, arrLe-i);
        }
    }

    /**
     * Swaps the elements at the specified positions in the specified array.
     * (If the specified positions are equal, invoking this method leaves
     * the array unchanged.)
     *
     * @param array The array in which to swap elements.
     * @param i     the index of one element to be swapped.
     * @param j     the index of the other element to be swapped.
     * @throws IndexOutOfBoundsException if either i or j
     *                                   is out of range (i < 0 || i >= array.length
     *                                   || j < 0 || j >= array.length).
     */
    private static void swap(int[] array, int i, int j) {
        int save = array[i];
        array[i] = array[j];
        array[j] = save;
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
//        TODO missing validation -0.5
        int arrLe = a.length;
        for (int i = 0; i < arrLe; i++) {
            System.out.print(a[i] + delimiter);
        }
        System.out.println();
    }


}
      
