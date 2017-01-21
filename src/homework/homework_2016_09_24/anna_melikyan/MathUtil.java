package homework.homework_2016_09_24.anna_melikyan;

/**
 * Encapsulates the mathematical functions
 */
public class MathUtil {

    public static void main(String[] args) {
        int a = -1;

        System.out.println(factorial(49));

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

        int result  = 1;

        for (int i = 0; i < n; i++) {

            result *= a; // result = result * a;
        }

        System.out.println(result);

        return 0;  // todo implement
    }

    /**
     * Calculates and returns Greatest common divisor
     *
     * @param x
     * @param y
     * @return gcd of specified x and y numbers
     */
    public static int gcd(int x, int y) {

        while (x % y != 0) {

            int k = y;

            y = x % y;

            x = k;
        }

        System.out.println(y);

        return 0;  // todo implement
    }

    /**
     * Calculates and returns the factorial of specified n number
     *
     * @param n the number factorial of which must be calculated
     * @return calculated number
     */
    public static long factorial(long n) {

        long result = 1;

        if( n == 0 || n == 1){

            return result;
        }

        for (long i = 2; i <= n; i++) {
            result *= i;
        }

        //System.out.println(result);

        return result;
    }


    /**
     * Calculates and returns the absolute value
     * of specified n number
     *
     * @param n specified number to find the absolute number
     * @return absolute number of specified n
     */
    public static int abs(int n) {

        return n > 0 ? n : -n;

    }

    public static int reverse(int number) {

        int result = 0;

        while (number != 0) {

            result = result * 10 + number % 10;

            number /= 10;
        }

        System.out.println(result);

        return 0;  // todo implement
    }

    public static void printIntAsBinary(long n) {

        for (int i = 63; i >= 0 ; i--) {

            System.out.print((n >> i & 1));

        }

        System.out.println();

    }
}






