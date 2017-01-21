package homework.homework_2016_09_17.telman_gurgenyan;

import java.util.Random;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] array = randomIntArray(20, 100);
        print(array);

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
        Random aR = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = aR.nextInt(n);
        }
        return a;
    }


    public static int getMaximum(int[] array) {
        int max = 0;
        for (int aM = 0; aM < array.length; aM++) {
            if (array[aM] > max) {
                max = array[aM];
            }
        }
        return max;
    }


    public static int getMinimum(int[] array) {
        int min = array[0];
        for (int aMin = 0; aMin < array.length; aMin++) {
            if (min > array[aMin]) {
                min = array[aMin];
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
        for (int iS = 0; iS < array.length; iS++) {
            sum += array[iS];
        }
//
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
        System.out.print("array [] = {");
        for (int j = 0; j < a.length; j++) {

            System.out.print(a[j] + ", ");

        }
        System.out.print("}");
        System.out.println();

    }


}
