package homework.homework_2016_10_08.karen_madoyan;

/**
 * Created by karen on 10/5/16.
 */

public class StringUtil {


    public static void main(String[] args) {

        System.out.println(calculateCount("kuku", 'u'));

        System.out.println(subString("hello wrld", 1, 7));

        System.out.println("trim '   text '|" + trim("   text ") + "|");
        System.out.println("trim 'text '   |" + trim("text ") + "|");
        System.out.println("trim 'te xt'   |" + trim("te xt") + "|");
        System.out.println("trim '   '     |" + trim("   ") + "|");
        System.out.println("trim ''        |" + trim("") + "|");
//----------------------------------------------------------------------
        System.out.println("trimSpase '   text '|" + trimSpace("   text ") + "|");
        System.out.println("trimSpase 'text '   |" + trimSpace("text ") + "|");
        System.out.println("trimSpase 'te xt'   |" + trimSpace("te xt") + "|");
        System.out.println("trimSpase '   '     |" + trimSpace("   ") + "|");
        System.out.println("trimSpase ''        |" + trimSpace("") + "|");


        System.out.println("------------------");

        String[] array = split("      He llo Ja v a          7", (char) 32);
        System.out.println(array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("------------------" + array.length);
        System.out.println(parseInt("-01234"));
        System.out.println(changeCase("KaRren", 'a', 'e'));
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
        int j = 0;
        String[] a = new String[inputText.length()];
        for (int i = 0; i < inputText.length(); i++) {
            a[i] = "";
            if (inputText.charAt(i) != (char) 32) {
                if (inputText.charAt(i) != delimiter) {
                    a[j] += inputText.charAt(i);
                } else j++;
            }
        }
        return a;
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
        if (beginIndex >= endIndex) {
            return "-1";
        }
        String subString = new String();
        for (int i = beginIndex; i < endIndex; i++) {
            subString += inputText.charAt(i);
        }
        return subString;
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
        String text = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                text += str.charAt(i);
            }
        }
        return text;
    }

    public static String trimSpace(String str) {
        int startSpace = 0;
        int endSpace = 0;
        boolean b = false;
        int length = str.length();
        for (int i = 0; i < length - 1; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                startSpace = i + 1;
                b = !b;
                continue;
            } else if (str.charAt(i) != ' ' && str.charAt(i + 1) == ' ' && b) {
                endSpace = i + 1;
                break;
            }
        }
        return subString(str, startSpace, endSpace);
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
        int tmp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                if (s.charAt(i) != '-') {
                    tmp *= 10;
                    tmp += (s.charAt(i) - 48);
                }
            }
        }
        if (s.charAt(0) == '-') tmp = -tmp;
        return tmp;
    }

    public static String toLowerCase(String text) {
        // TODO implement
        return null;
    }

    public static String toUpperCase(String text) {
        // TODO implement
        return null;
    }

    private static String changeCase(String text, char startIndex, char endIndex) {
        String string = "";
        for (int i = 0; i < text.length(); i++) {
            if (startIndex < text.length() && endIndex < text.length() && startIndex != endIndex && startIndex < endIndex) {
                for (int j = startIndex; j <= endIndex; j++) {
                    if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {

                    }
                }

            }
        }
        return string;
    }

    public static int calculateCount(String text, char symbol) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }
}