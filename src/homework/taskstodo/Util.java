package homework.taskstodo;

public class Util {

    public static void main(String[] args) {


        findLongestPalindrome("madam .");

        //shiftLeft
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        array = shiftLeft(array, 4);
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    /**
     * A palindrome is a word, phrase, number or other sequence of units that has
     * the property of reading the same in either direction
     * like ara , anna, madam, wow, radar, etc.
     *
     * @param text text
     * @return true if text is palindrome
     */
    public static boolean palindrome(String text) {
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

    /**
     * Shift array element left appropriate shiftSize
     * like this we have   [1, 2, 3, 4, 5, 6] end we want to shift 2
     * the result must be  [5, 6, 1, 2, 3, 4]
     *
     * @param a         array
     * @param shiftSize shit size
     * @return array which already shifted
     */
    public static int[] shiftLeft(int a[], int shiftSize) {
        return null;
    }

}
