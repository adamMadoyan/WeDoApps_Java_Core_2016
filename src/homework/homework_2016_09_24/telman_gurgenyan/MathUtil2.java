package homework.homework_2016_09_24.telman_gurgenyan;

/**
 * Encapsulates the mathematical functions
 */
public class MathUtil2 {

    public static void main(String[] args) {

        System.out.println(factorial(49));

        printIntAsBinary(8789267254022766592l);
        System.out.println(pow(2,4));
        System.out.println(factorial(3));
        System.out.println(reverse(145));
        System.out.println(gcd(24,14));
    }

    public static int pow(int a, int n) {
        int art = 1;
        for (int i = 0; i< n; i ++ ){
           art = art * a;
        }
        return art;
    }



    public static int gcd(int x, int y) {

        while (x%y !=0){
            int sev = y;
            y = x%y;
            x = sev;
        }
        return y;
    }




    public static long factorial(long n) {
     long facSum = 1;
       for(int i = 1; i <= n;i++ ){
          facSum *= i;
       }
        return facSum;
    }


    /**
     * Calculates and returns the absolute value
     * of specified n number
     *
     * @param n specified number to find the absolute number
     * @return absolute number of specified n
     */
    public static int abs(int n) {
        return 0; // todo implement
    }

    public static int reverse(int number) {
        int tiv;
        int rev = 0;
        while (number != 0 ){

           tiv = number % 10;
           rev =  rev * 10 + tiv;
            number = number/10;
        }
        return rev;
    }



    public static void printIntAsBinary(long n) {

    }
}






