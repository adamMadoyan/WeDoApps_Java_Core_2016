package homework.homework_2016_10_22.zaven_madoyan;

public class Util {

    public static void main(String[] args) {
        System.out.println(palindrome("ara katak ara"));

        findLongestPalindrome("madam .");

        //shiftLeft
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        array = shiftLeft(array, 7);
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static boolean palindrome(String text) {
        int a = text.length();
        for (int i = 0; i < (a / 2); ++i) {
            if (text.charAt(i) != text.charAt(a - 1 - i)) {
                return false;
            }
        }

        return true;
    }


    /**
     * A palindrome is a word, phrase, number or other sequence of units that has
     * the property of reading the same in either direction
     * like ara , anna, madam, wow, radar, etc
     *
     * @param text text
     * @return longist palindrome from text
     */
    public static String findLongestPalindrome(String text) {

        return null;
    }

    public static int[] shiftLeft(int a[], int shiftSize) {
        int length = a.length;
        int i = 0;
        int j = 0;
        int[] array = new int[length];
        for (; shiftSize + i < length; i++) {
            array[shiftSize + i] = a[i];
        }
        while (j != shiftSize) {
            array[j] = a[i];
            i++;
            j++;

        }
        return array;
    }

}
