package homework.homework_2016_09_17.karen_madoyan;

import java.util.Random;

/**
 * Created by karen on 9/10/16.
 */
public class Main {

    public static void main(String args[]) {

        int a = 5;
//1
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------");
        //----------------------------------
//2
        for (int i = a; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------");
//3       //----------------------------------------
        for (int i = 0; i < a; i++) {
            for (int j = a; j > i + 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------");
//4       //----------------------------------------
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = a; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------");
        //-------------------------------------------
//5
        for (int i = 0; i < a; i++) {
            for (int j = a; j > i + 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = a; k > i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
//>>>>>>//------------------------------------------
        int[] array = randomIntArray(10, 50);
        print(array);

        int max = getMaximum(array);
        System.out.println("Max : " + max);

        int min = getMinimum(array);
        System.out.println("Min : " + min);

        int sum = getSum(array);
        System.out.println("Sum : " + sum);

        int[] b = {4, 8, 8, 9, 24, 3};
        print(b);
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
        Random generator = new Random();
        int[] a = new int[length];
        for (int i = 0; i < a.length; i++) {
            a[i] = generator.nextInt(n);
        }
        return a;
    }

    public static int getMaximum(int[] array) {
        int tmp = array[0];
        for (int i = 1; i < array.length; i++) {
            if(tmp < array[i]) {
                tmp = array[i];
            }
        }
        return tmp;   // this must be replaced by correct code
    }

    public static int getMinimum(int[] array) {
        int tmp = array[0];
        for (int i = 1; i < array.length; i++) {
            if(tmp > array[i]) {
                tmp = array[i];
            }
        }
        return tmp;   // this must be replaced by correct code
    }
    /**
     * Calculates the sum of specified <code>util</code>  elements
     *
     * @param array specified int util
     * @return the sum of the specified util elements
     */
    public static int getSum(int[] array) {
        int tmp = array[0];
        for (int i = 1; i < array.length; i++) {
            tmp += array[i];
        }
        return tmp;   // this must be replaced by correct code
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
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + delimiter);
        }
        System.out.println();
    }


}