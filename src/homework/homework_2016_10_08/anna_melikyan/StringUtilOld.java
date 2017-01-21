package homework.homework_2016_10_08.anna_melikyan;

public class StringUtilOld {


    public static void main(String[] args) {

        System.out.println(calculateCount("kuku", 'u'));

        System.out.println(subString("hello world", 1, 7));

        String tx1 = "HELLO";
        System.out.println(toLowerCase(tx1));

        String tx2 = "hello";
        System.out.println(toUpperCase(tx2));

        String tx3 = " hello ";

        System.out.println(trim(tx3));

        //System.out.println("trim '   text '|" + trim("   text ") + "|");
        //System.out.println("trim 'text '   |" + trim("text ") + "|");
        //System.out.println("trim 'te xt'   |" + trim("te xt") + "|");
        //System.out.println("trim '   '     |" + trim("   ") + "|");
       //System.out.println("trim ''        |" + trim("") + "|");


        System.out.println("------------------");

        //String[] array = split("      He llo Ja v a          7", 'e');

        //for (int i = 0; i < array.length; i++) {
           // System.out.println(array[i]);
        //}
        //System.out.println("------------------" + array.length);
       parseInt("-1245");

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
        //TODO implement
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
        String s = "";

        for (int i = beginIndex; i <= endIndex; i++)
        {
            s = s + inputText.charAt(i);
        }
        return s;
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
        String s = "";
        int n = str.length()-1;
        if ((str.charAt(0) != ' ') && (str.charAt(str.length()-1) != ' ')) s = str;
        if (str.charAt(0) == ' ' || str.charAt(str.length()-1) == ' ') {str = str.substring(1,n);

            s = s  + str;
        }
        return str;
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
    int res = 0;
        char ch = ' ';
        for (int i = 0; i < s.length(); i++) {
            res = (int) (s.charAt(i));
            ch = (char) res;
            System.out.print(ch);
        }

        return 0; // TODO implement the method
    }

    public static String toLowerCase(String text) {
        String st = "";
        char ch  = ' ';
        for (int i = 0; i < text.length(); i++) {
            ch =  (char) (text.charAt(i)+32);
            st = st + ch;

        }

        return st;
    }

    public static String toUpperCase(String text) {
        String st = "";
        char ch  = ' ';
        for (int i = 0; i < text.length(); i++) {
            ch =   (char) (text.charAt(i)-32);
            st = st + ch;

        }

        return st;

    }

    private static String changeCase(String text, char startIndex, char endIndex) {
        // TODO implement
        return null;
    }


    public static int calculateCount(String text, char symbol) {

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == symbol ) count++;
        }
        return count;
    }
}