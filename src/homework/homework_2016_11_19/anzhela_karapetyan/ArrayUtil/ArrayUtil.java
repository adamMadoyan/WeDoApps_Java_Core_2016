import java.util.Arrays;
import java.util.Random;

public class ArrayUtil {
    /**
     * Creates an util filled with random values.
     *
     * @param length the length of the util
     * @param n      the number of possible random values
     * @return an util filled with length numbers between
     * 0 and n-1
     */

    public static int[] randomIntArray(int length, int n) {
        Random genertaor = new Random();
        int[] a = new int[length];
        for (int i = 0; i < a.length; i++) {
            a[i] = genertaor.nextInt(n);
        }


        // create an util by the specified  "length" parameter instead of assigning null
        //  Random generator = new Random();
        // use the following method: "nextInt(n)"   of Random class
        // initialize the util (a) using for loop and above mentioned method
        return a;
    }

    /**
     * Sorts the util elements by odd and even number
     * such that if first number is odd then second must be even number
     * this means that it will be found the next even number and swap with the second element
     * if the second element is odd. And so on for the next elements of the util
     */
    public static void sortByOddAndEven(int array[]) {
        for (int k = 0; k <= array.length - 1; k++) {
            for (int i = array.length - 1; i > k; i--) {
                if (array[i] % 2 == 1) {
                    int a = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = a;
                }

            }
        }
        System.out.println(Arrays.toString(array));
    }

//        TODO   implement


    public static int getMaximum(int[] array) {
        int Max = array[0];
        for (int x : array){
            if (x > Max){
                Max = x;
            }
        }

        return Max;   // this must be replaced by correct code
    }


    public static int getMinimum(int[] array) {
      int Min = array[0];
        for (int x : array) {
            if (x < Min){
                Min = x;
            }
        }
            return Min;   // this must be replaced by correct code
    }

    /**
     * Calculates the sum of specified <code>util</code>  elements
     *
     * @param array specified int util
     * @return the sum of the specified util elements
     */
    public static int getSum(int[] array) {
          int sum = 0;
        for (int x : array){
            sum += x;
        }
        return sum;   // this must be replaced by correct code
    }


    /**
     * Creates the reversed to specified array new array and returns it.
     *
     * @param array an array corresponting to wich must be created reversed array
     * @return new created reversed array to the specified paramter "array"
     */
    public static int[] reverse(int[] array) {
        reverseInSameArray(array);
        int array1[] = new int[array.length];

          for (int i = 0; i < array1.length; i++){
             array1[i] = array[i];
   }
           return array1;


    }

    /**
     * Reverses the elements order of the specified array
     *
     * @param array an array: Elements order of wich must be reversed
     */
    public static void reverseInSameArray(int[] array) {
        for (int k = 0; k <= array.length - 1; k++ ) {
            for (int i = array.length - 1; i > k; i--) {
                int a = array[i];
                array[i] = array[i - 1];
                array[i - 1] = a;

            }
        }
        System.out.println(Arrays.toString(array));

//        TODO implement

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
    public static void swap(int[] array, int i, int j) {
        if (i >= 0 && i < array.length && j >= 0 && j < array.length){
            int a;
            a = array[i];
            array[i] = array[j];
            array[j] = a;
        }
        System.out.println(Arrays.toString(array));;
    }

    public static void print(int[] a) {

        print(a, "*");
    }

    /**
     * Prints all elements in an array by using specified delimiter between elements.
     *
     * @param a the util to print
     *///amen elementic heto orinak ket//
    public static void print(int[] a, String delimiter) {
        for (int x : a){
            System.out.print(x + delimiter);
        }


    }
}





