package quiz.zaven_madoyan;

/**
 * Encapsulates the mathematical functions
 */
//  TODO score 9
public class MathUtil {

    public static void main(String[] args) {
        int a = -1;
//        System.out.println(a>>2);
//        System.out.println((a>>>1)== Integer.MAX_VALUE);

        System.out.println(factorial(4));

        System.out.println(gcd(72, 40));
        System.out.println(factorialByRecursion(5));
        System.out.println(abs(-5));
        printIntAsBinary(8789267254022766592l);
        System.out.println(reverse(-34));
        System.out.println(pow(2, 3));

    }

    public static int pow(int a, int n) {
        if (a < 0 || n < 0) {
            return -1;
        }
        int res = 1;
        for (int i = 0; i < n; i++) {
            res *= a;
        }
        return res;
    }

    public static int gcd(int x, int y) {

        while (x % y != 0) {
            int tmp = y;
            y = x % y;
            x = tmp;
        }
        return y;

    }

    public static long factorial(long n) {
//        TODO incorrect implementation and validate -3
        if (n == 0) {
            return 1;
        }
        long res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        return res;
    }

    public static long factorialByRecursion(long n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return factorialByRecursion(n - 1) * n;
    }

    public static int abs(int n) {
        return n < 0 ? -n : n ;

    }

    public static int reverse(int number) {
        int temp = 0;
        int res = 0;
        while (number != 0) {
            res = number % 10;
            number /= 10;
            temp = temp * 10 + res;
        }
        return temp;
    }

    public static void printIntAsBinary(long n) {
        for (int i = 0; i < 64 ; i++) {
            System.out.print((n >> i & 1) );

        }
        System.out.println();
    }
}






