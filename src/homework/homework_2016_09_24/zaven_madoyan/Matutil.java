package homework.homework_2016_09_24.zaven_madoyan;

/**
 * Created by Zaven on 23.09.2016.
 */
public class Matutil {

    public static void main(String[] args) {
        int res = pow(45, 5);
        System.out.println(res);
        System.out.println(gcd(11, 9));
        long k = factorial(5);
        System.out.println(k);
        System.out.println(abs(-5));
        System.out.println(reverse(789));
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
        int b = 1;
        for (int i = 0; i < n; i++) {
            b *= a;
        }
        return b;
    }

    /**
     * Calculates and returns Greatest common divisor
     *
     * @param x
     * @param y
     * @return gcd of specified x and y numbers
     */
    public static int gcd(int x, int y) {
        int res;
        while ((res = x % y) != 0) {
//           int a = x % y;
            x = y;
            y = res;
        }
        return y;
    }

    /**
     * Calculates and returns the factorial of specified n number
     *
     * @param n the number factorial of which must be calculated
     * @return calculated number
     */
    public static long factorial(long n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }


    /**
     * Calculates and returns the absolute value
     * of specified n number
     *
     * @param n specified number to find the absolute number
     * @return absolute number of specified n
     */
    public static int abs(int n) {
//        if (n < 0) {
//            return -n;
//        }
//        return n;
        return n < 0 ? -n : n;

    }


    /**
     * Calculates and returns reversed value of specified n number
     *
     * @param number specified number which will be reversed
     * @return reversed number
     */
    public static int reverse(int number) {
        int temp = 0;
        int res = 0;
        while(number != 0) {
           res = number % 10;
            number /= 10;
            temp = temp * 10 + res;
          //  temp += res;
        }
        return temp;
//        int res = 0;
//        while(number != 0) {
//            res = res * 10 + number%10;
//            number /= 10;
//        }
//        return res;
    }

    /**
     * Calculates and print as binary of specified n number
     *
     * @param n specified number to print binary code
     */
    public static void printIntAsBinary(long n) {
        for (int i = 0; i < 64; i++) {
           int j = i & 1 << 63; 

        }
    }
}