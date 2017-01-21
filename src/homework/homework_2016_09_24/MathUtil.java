package homework.homework_2016_09_24;

/**
 * Encapsulates the mathematical functions
 */
public class MathUtil {

    public static void main(String[] args) {
        int a = -1;
//        System.out.println(a>>2);
//        System.out.println((a>>>1)== Integer.MAX_VALUE);

        System.out.println(factorial(49));
        System.out.println(factorialByRecursion(49));

        printIntAsBinary(8789267254022766592l);


    }

    /**
     * Returns the value of the first argument raised to the power of the
     * second argument, such that a > 0 and n > 0.
     *
     * @param a the base
     * @param n the exponent
     * @return the value <code>a<sup>b</sup></code>.
     */
    public static int pow(int a, int n) {
        return 1;
    }

    /**
     * Calculates and returns Greatest common divisor
     *
     * @param x
     * @param y
     * @return gcd of specified x and y numbers
     */
    public static int gcd(int x, int y) {
        return 1;
    }

    /**
     * Calculates and returns the factorial of specified n number
     *
     * @param n the number factorial of which must be calculated
     * @return calculated number
     */
    public static long factorial(long n) {
        return 1;
    }

    public static long factorialByRecursion(long n) {
        return 1;
    }


    /**
     * Calculates and returns the absolute value
     * of specified n number
     *
     * @param n specified number to find the absolute number
     * @return absolute number of specified n
     */
    public static int abs(int n) {
        return 1;

    }

    public static int reverse(int number) {
        return 1;
    }

    public static void printIntAsBinary(long n) {

    }
}






