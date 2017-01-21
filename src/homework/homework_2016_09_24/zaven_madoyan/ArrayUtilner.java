package homework.homework_2016_09_24.zaven_madoyan;

import java.util.Random;
public class ArrayUtilner {

    public static void main(String[] args) {
        int[] a = randomIntArray(10, 51);
        print(a);
        sortArray(a);
        print(a);
        int[] b = randomIntArray(5, 51);
        print(b);
        print(reverse(b));
        int max = getMaximum(a);
        System.out.println(" max = " + max);
        int min = getMinimum(a);
        System.out.println(" min = " + min);
        int sum = getSum(a);
        System.out.println(" sam = " + sum);
    }

    public static int[] randomIntArray(int length, int n) {
        int[] a = new int[length];
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            a[i] = r.nextInt(n) + 1;
        }
        return a;
    }

    public static void sortArray(int array[]) {
        for (int i = 0; i < array.length - 2; i++) {
            if ((array[i] + array[i + 1]) % 2 != 0) {
                continue;
            } else {
                for (int j = i + 2; j < array.length; j++)
                    if ((array[i] + array[j]) % 2 != 0) {
                        swap(array, i + 1, j);
                    }
            }
        }
    }

    private static void swap(int array[], int i, int j) {
        int c = array[i];
        array[i] = array[j];
        array[j] = c;
    }

    public static int getMaximum(int[] array) {
        int i = array[0];
        for (int j = 1; j < array.length; j++) {
            if (array[j] > i) {
                i = array[j];
            }
        }
        return i;
    }

    public static int getMinimum(int[] array) {
        int i = array[0];
        for (int j = 1; j < array.length; j++) {
            if (array[j] < i) {
                i = array[j];
            }
        }

        return i;
    }

    public static int getSum(int[] array) {
        int i = 0;
        for (int j = 0; j < array.length; j++) {
            i += array[j];
        }

        return i;
    }

    public static int[] reverse(int[] array) {
        int[] a = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            a[i] = array[i];

        }
        reverseInSameArray(a);
        return a;
    }

    public static void reverseInSameArray(int[] array) {
        for (int i = 0, j = array.length - 1; i < j; i++, j--)
            swap(array, i, j);
    }

    public static void print(int[] a) {
        print(a, "*");
    }

    public static void print(int[] a, String delimiter) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + delimiter);
        }
        System.out.println();
    }
}



////    * Swaps the elements at the specified positions in the specified array.
////    * (If the specified positions are equal, invoking this method leaves
////    * the array unchanged.)
////    *
////    * @param array The array in which to swap elements.
////    * @param i the index of one element to be swapped.
////    * @param j the index of the other element to be swapped.
////    * @throws IndexOutOfBoundsException if either i or j
////    *         is out of range (i < 0 || i >= array.length
////    *         || j < 0 || j >= array.length).
////    */
// private static void swap(int[] array, int i, int j) {
////        //todo: implement
////    }
////
////    public static void print(int[] a) {
////        print(a, " ");
////    }
////
////    /**
////     * Prints all elements in an array by using specified delimiter between elements.
////     *
////     * @param a the util to print
////     */
////    public static void print(int[] a, String delimiter) {
////        // todo implement
////    }
////
////
////}
////
//