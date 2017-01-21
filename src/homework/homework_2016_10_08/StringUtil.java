package homework.homework_2016_10_08;


public class StringUtil {


    public static void main(String[] args) {
//
//        System.out.println(toUpperCase("kuku"));
//        System.out.println(toLowerCase("KukU"));
//
//        System.out.println(calculateCount("kuku", 'u'));
//
//        System.out.println(subString("hello world", 1, 7));
//
//        System.out.println("trim '   text '|" + trim("   text ") + "|");
//        System.out.println("trim 'text '   |" + trim("text ") + "|");
//        System.out.println("trim 'te xt'   |" + trim("te xt") + "|");
//        System.out.println("trim '   '     |" + trim("   ") + "|");
//        System.out.println("trim ''        |" + trim("") + "|");
//

        System.out.println("------------------");

        String[] array = split("   hh    ", 'j');

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("------------------");
        System.out.println(parseInt("12h45"));
    }


    /**
     * Parses the specified inputText and divides it into tokens by the specified delimiter.
     *
     * @param text      the string to be splitted by the specified delimiter
     * @param delimiter the delimiter by which the specified inputText  will splitted.
     * @return the array of strings computed by splitting this string
     * around matches of the given delimiter.
     */
    public static String[] split(String text, char delimiter) {
        int length = text.length();
        String[] wordList = new String[length / 2 + 1];
        int count = 0;
        int index = 0;
        while (index < length) {
            while (index < length && text.charAt(index) == delimiter) {
                index++;
            }
            String word = "";
            while (index < length && text.charAt(index) != delimiter) {
                word += text.charAt(index++);
            }
            if (!word.isEmpty()) {
                wordList[count++] = word;
            }
        }

        String[] newWordList = new String[count];
        if (count > 0) {
            System.arraycopy(wordList, 0, newWordList, 0, count);
        }
        return newWordList;
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
        //TODO implement
        return null;
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
        //TODO: implement
        return null;
    }

    /**
     * Parses the string argument as a signed decimal integer. The
     * characters in the string must all be decimal digits, except
     * that the first character may be an ASCII minus sign.
     *
     * @param text a String containing the int representation to be parsed
     * @return the integer value represented by the argument in decimal.
     */
    public static int parseInt(String text) {
        int length = text.length();
        boolean negative = false;
        int number = 0;
        int i = 0;
        if (text.charAt(0) == '-') {
            negative = true;
            i++;
        }
        for (; i < length; i++) {
            char symbol = text.charAt(i);
            if (symbol >= '0' && symbol <= '9') {
                number = number * 10 + (symbol - '0');
            } else {
                System.out.println("NumberFormat Exception!");
                return -1;
            }
        }
        return negative ? -number : number;
    }

    public static String toLowerCase(String text) {
        if (text == null) {
            System.out.println("NullPointer Exception!");
            return null;
        }
        return changeCase(text, 'A', 'Z');
    }

    public static String toUpperCase(String text) {
        if (text == null) {
            System.out.println("NullPointer Exception!");
            return null;
        }
        return changeCase(text, 'a', 'z');
    }

    private static String changeCase(String text,
                                     char startIndex,
                                     char endIndex) {
        String res = "";
        int length = text.length();
        for (int i = 0; i < length; i++) {
            char symbol = text.charAt(i);
            if (symbol >= startIndex && symbol <= endIndex) {
                res += (char) (symbol ^ 32);
            } else {
                res += symbol;
            }
        }
        return res;
    }


    public static int calculateCount(String text, char symbol) {
        return 0; // TODO implement
    }
}