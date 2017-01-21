package homework.homework_2016_09_17;

/**
 * This class contains utility methods for util
 * manipulation.
 */
public class ArrayUtil {


    public static void main(String[] args) {

        int [] array = randomIntArray(50, 10);
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
     *         0 and n-1
     */
    public static int[] randomIntArray(int length, int n) {
        int[] a = null; // create an util by the specified  "length" parameter instead of assigning null
        //  Random generator = new Random();
        // use the following method: "nextInt(n)"   of Random class
        // initialize the util (a) using for loop and above mentioned method
        return a;
    }

    public static int getMaximum(int[] array) {
//        TODO   implement
        return 0;   // this must be replaced by correct code
    }


    public static int getMinimum(int[] array) {
//        TODO implement
        return 0;   // this must be replaced by correct code
    }

    /**
     * Calculates the sum of specified <code>util</code>  elements
     *
     * @param array specified int util
     * @return the sum of the specified util elements
     */
    public static int getSum(int[] array) {
//        TODO implement
        return 0;   // this must be replaced by correct code
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
        // todo implement
    }


}
      
