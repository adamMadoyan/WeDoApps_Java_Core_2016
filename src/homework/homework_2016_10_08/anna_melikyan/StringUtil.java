package homework.homework_2016_10_08.anna_melikyan;

public class StringUtil {


    public static void main(String[] args) {

        System.out.println(calculateCount("kuku", 'u'));

        System.out.println(subString("hello world", 1, 7));

        String tx1 = "HEllO";
        System.out.println(toLowerCase(tx1));

        String tx2 = "heLLo";
        System.out.println(toUpperCase(tx2));

        String tx3 = " hello ";

        System.out.println(trim(tx3));

        //System.out.println("trim '   text '|" + trim("   text ") + "|");
        //System.out.println("trim 'text '   |" + trim("text ") + "|");
        //System.out.println("trim 'te xt'   |" + trim("te xt") + "|");
        //System.out.println("trim '   '     |" + trim("   ") + "|");
       //System.out.println("trim ''        |" + trim("") + "|");


        System.out.println("------------------");

        String[] array = split("      He llo Ja v a          7", 'a');

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("------------------" );
        System.out.println(array.length);

        System.out.println(parseInt("-145"));

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
        int length  = inputText.length();
        String [] wordList  = new String[length / 2 +1];

        int count  = 0;
        int index  = 0;


        while (index < length && inputText.charAt(index) == delimiter ) {
                index ++;
        }
        String word = "";
        while (inputText.charAt(index) != delimiter) {
            word += inputText.charAt(index);
            index++;
        }
        if (!word.isEmpty() ) {
            wordList[count++] = word;
        }

        String [] newWordList = new String[count];

        if (count > 0) {
            System.arraycopy(wordList, 0, newWordList, 0, count);
        }
       System.arraycopy(wordList, 0, newWordList, 0, count);

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
        int number  = 0;
        int length = s.length();
        boolean negative = false;
        int i = 0;
        //char symbol = ' ';

        if (s.charAt(0) == '-') {
            negative = true; i++;
        }

        for ( i = 1; i < length; i++) {
            char symbol = s.charAt(i);
            if (symbol >= '0' && symbol <= '9') {
                number = number * 10 + (symbol - '0');
            } else {
                System.out.println("bla");
                return -1;
            }


        }

        return negative ? - number: number;
    }

    public static String toLowerCase(String text) {
        if (text == null){
            System.out.println("Is Empty");
            return null;
        }

        return changeCase(text, 'A', 'Z');
    }

    public static String toUpperCase(String text) {
        if (text == null) {
            System.out.println("Is Empty");
            return null;
        }

        return changeCase(text, 'a', 'z');

    }

    private static String changeCase(String text, char startIndex, char endIndex) {
        String res = "";
        int length  = text.length();

        for (int count = 0; count < length; count++) {
            char symbol = text.charAt(count);
            if (symbol >= startIndex && symbol <= endIndex) {
                res += (char) (symbol ^ 32);
            } else {
                res += symbol;
            }
        }
        return res;
    }


    public static int calculateCount(String text, char symbol) {

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == symbol ) count++;
        }
        return count;
    }
}