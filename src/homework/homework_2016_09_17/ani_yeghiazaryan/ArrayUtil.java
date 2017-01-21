package homework.homework_2016_09_17.ani_yeghiazaryan;

import java.util.Random;

public class ArrayUtil {

    public static void main(String[] args) {

        int[] array = randomIntArray(5, 15);
        print(array, " ");

        int max = getMaximum(array);
        System.out.println("Max : " + max);

        int min = getMinimum(array);
        System.out.println("Min : " + min);

        int sum = getSum(array);
        System.out.println("Sum : " + sum);
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
        Random generator = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = generator.nextInt(n);
        }
        return a;
    }

    public static int getMaximum(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= max) {
                max = array[i];
            }
        }
        return max;
    }


    public static int getMinimum(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
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
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
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
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + delimiter);
        }
        System.out.println();
    }
}
