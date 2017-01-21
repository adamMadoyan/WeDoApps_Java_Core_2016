package homework.homework_2016_10_08.ani_yeghiazaryan;


import static java.lang.Math.pow;

public class StringUtil {


    public static void main(String[] args) {

//        System.out.println(calculateCount("kuku", 'u'));
//
//        System.out.println(subString("hello world", 1, 10));
//        System.out.println(toLowerCase("Hello World"));
//        System.out.println(toUpperCase("Hello World"));
//        System.out.println(calculateCount("hhhh jjjjjjhhh", 'h'));
//
//        System.out.println("trim '   text '|" + trim("   text ") + "|");
//        System.out.println("trim 'text '   |" + trim("text ") + "|");
//        System.out.println("trim 'te xt'   |" + trim("te xt") + "|");
//        System.out.println("trim '   '     |" + trim("   ") + "|");
//        System.out.println("trim ''        |" + trim("") + "|");
//        System.out.println(trim("    jjjj     gg    "));
//
//        System.out.println("------------------");
//
//        String[] array = split("      He llo Ja e v ahgfhdehgju          7", 'e');
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//        System.out.println("------------------" + array.length);
//        System.out.println(parseInt("245887"));
//        System.out.println(parseInt("-4701245"));
//        System.out.println(changeCase("Hello World", 'e', 'r'));
    }


    /**
     * Parses the specified inputText and divides it into tokens by the specified delimiter.
     *
     * @param inputText the string to be splitted by the specified delimiter
     * @param delimiter the delimiter by which the specified inputText  will splitted.
     * @return the array of strings computed by splitting this string
     * around matches of the given regular expression.
     */
    public static String[] split(String inputText, char delimiter) {

        char[] array = new char[inputText.length()];
        inputText.getChars(0, inputText.length(), array, 0);
        System.out.println(array);
        int j = 0;
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == delimiter) {
                for (j = k; j < i; j++) {
                    System.out.print(array[j]);
                }
                k = i;
                System.out.println();

            }
            if (i == array.length - 1) {
                for (j = k; j < i; j++) {
                    System.out.print(array[j]);
                }
                System.out.println();
            }
        }
        return null;
    }

    /**
     * Returns a string that is a substring of this string. The
     * substring begins at the specified {@code beginIndex} and
     * extends to the character at index {@code endIndex - 1}.
     * Thus the length of the substring is {@code endIndex-beginIndex}.
     * <p>
     * Examples:
     * <blockquote><pre>
     * "hamburger".substring(4, 8) returns "urge"
     * "smiles".substring(1, 5) returns "mile"
     * </pre></blockquote>
     *
     * @param beginIndex the beginning index, inclusive.
     * @param endIndex   the ending index, exclusive.
     * @return the specified substring.
     */
    static public String subString(String inputText, int beginIndex, int endIndex) {

        char[] array = new char[inputText.length()];
        inputText.getChars(0, inputText.length(), array, 0);

        for (int j = beginIndex; j < endIndex; j++) {
            System.out.print(array[j]);
        }
        return "";
    }

    /**
     * Returns a copy of the specified str, with leading and trailing whitespace
     * omitted.
     *
     * @param str the String will be trimmed.
     * @return A copy of the string with leading and trailing white
     * space removed, or this string if it has no leading or
     * trailing white space.
     */
    public static String trim(String str) {
        int k = 0;

        char[] array = new char[str.length()];
        str.getChars(0, str.length(), array, 0);
        int m = str.length();
        if (str.length() == 0) {
            return "";
        }
        for (int i = 0; i < str.length(); i++) {
            if (array[i] != ' ') {
                k = i;
                break;
            }
            if (i == str.length() - 1) {
                return "";
            }
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            if (array[i] != ' ') {
                m = i;
                break;
            }
        }
        char[] array2 = new char[m - k + 1];

        for (int i = k, j = 0; i <= m; i++, j++) {
            array2[j] = array[i];
        }
        String arr2 = String.valueOf(array2);
        return arr2;
    }

    /**
     * Parses the string argument as a signed decimal integer. The
     * characters in the string must all be decimal digits, except
     * that the first character may be an ASCII minus sign.
     *
     * @param s a String containing the int representation to be parsed
     * @return the integer value represented by the argument in decimal.
     */
    public static int parseInt(String s) {
        char[] array = new char[s.length()];
        s.getChars(0, s.length(), array, 0);
        int number = 0;
        int value = 0;
        int sum = 0;
        int sign = 0;
        for (int i = 0; i < array.length; i++) {
            number = (int) array[i];
            if (number == 45) {
                sign = 1;
                continue;
            }
            switch (number) {
                case 48:
                    value = 0;
                    break;
                case 49:
                    value = 1;
                    break;
                case 50:
                    value = 2;
                    break;
                case 51:
                    value = 3;
                    break;
                case 52:
                    value = 4;
                    break;
                case 53:
                    value = 5;
                    break;
                case 54:
                    value = 6;
                    break;
                case 55:
                    value = 7;
                    break;
                case 56:
                    value = 8;
                    break;
                case 57:
                    value = 9;
                    break;
            }
            sum = sum + (value * (int) pow(10, s.length() - i - 1));


        }
        if (sign == 0)
            return sum;
        else
            return 0 - sum;
    }

    public static String toLowerCase(String text) {
        char[] array = new char[text.length()];
        text.getChars(0, text.length(), array, 0);
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            number = (int) array[i];
            if (number == 32) {
                System.out.print((char) number);
            } else if (number < 97) {
                number = number + 32;
                System.out.print((char) number);
            } else {
                System.out.print((char) number);
            }
        }
        return "";
    }

    public static String toUpperCase(String text) {
        char[] array = new char[text.length()];
        text.getChars(0, text.length(), array, 0);
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            number = (int) array[i];
            if (number == 32) {
                System.out.print((char) number);
            } else if (number > 96) {
                number = number - 32;
                System.out.print((char) number);
            } else {
                System.out.print((char) number);
            }
        }
        return "";
    }

    private static String changeCase(String text, char startIndex, char endIndex) {
        // TODO implement
        return "";
    }


    public static int calculateCount(String text, char symbol) {
        char[] array = new char[text.length()];
        text.getChars(0, text.length(), array, 0);
        int count = 0;
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            if ((int) symbol == array[i]) {
                number = number + 1;
            }
        }
        return number;
    }
}