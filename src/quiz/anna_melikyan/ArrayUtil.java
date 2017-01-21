package quiz.anna_melikyan;

import java.util.Random;

// TODO score 8
public class ArrayUtil {

    public static void main(String[] args) {
        int[] array = randomIntArray(40, 10);
        print(array);

        System.out.println();

        sortByOddAndEven(array);
        print(array);

        System.out.println();


        int max = getMaximum(array);
        System.out.println("Max:" + max);

        int min = getMinimum(array);
        System.out.println("Min:" + min);

        int sum = getSum(array);
        System.out.println("Sum:" + sum);

        print(reverse(array));


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
// TODO missing validation -0.5
        int[] array = new int[length];
        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(n);
        }

        return array;
    }

    /**
     * Sorts the util elements by odd and even number
     * such that if first number is odd then second must be even number
     * this means that it will be found the next even number and swap with the second element
     * if the second element is odd. And so on for the next elements of the util
     */
    public static void sortByOddAndEven(int[] array) {
// TODO missing validation -0.5
        for (int i = 0; i < array.length - 2; i++) {
            if (((array[i] + array[i + 1]) & 1) == 1) {
                continue;
            }
            for (int j = i + 2; j < array.length; j++) {
                if (((array[i] + array[j]) & 1) == 1) {
                    swap(array, i + 1, j);
                }
            }
        }
    }

    public static int getMaximum(int[] array) {
// TODO missing validation -0.5
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
            }
        }
        return max;   // this must be replaced by correct code
    }


    public static int getMinimum(int[] array) {
// TODO missing validation -0.5
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
        }
        return min;   // this must be replaced by correct code
    }

    /**
     * Calculates the sum of specified <code>util</code>  elements
     *
     * @param array specified int util
     * @return the sum of the specified util elements
     */
    public static int getSum(int[] array) {
// TODO missing validation -0.5
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }


    /**
     * Creates the reversed to specified array new array and returns it.
     *
     * @param array an array corresponting to wich must be created reversed array
     * @return new created reversed array to the specified paramter "array"
     */
    public static int[] reverse(int[] array) {
// TODO missing validation -0.5
        int i;
        int j;
        for (i = 0, j = array.length - 1; i < j; i++, j--) {
            swap(array, i, j);
        }
        return array;
    }

    /**
     * Reverses the elements order of the specified array
     *
     * @param array an array: Elements order of wich must be reversed
     */
    public static void reverseInSameArray(int[] array) {
//        TODO missing implementation -1

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
        int z = array[i];
        array[i] = array[j];
        array[j] = z;
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
// TODO missing validation -0.5
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + delimiter);
        }
        System.out.println();
    }


}



