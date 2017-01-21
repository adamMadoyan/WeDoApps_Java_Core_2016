package homework.homework_2016_10_08.artur_khachatryan;

public class StringUtil {


    public static void main(String[] args) {
        System.out.println(calculateCount("lkokikbk", 'k'));

        System.out.println(subString("hello world", 1, 7));
        System.out.println("trim '   text '|" + trim("   text ") + "|");

        System.out.println("trim 'text '   |" + trim("text ") + "|");

        System.out.println("trim 'te xt'   |" + trim("te xt") + "|");

        System.out.println("trim '   '     |" + trim("   ") + "|");

        System.out.println("trim ''        |" + trim("") + "|");


        System.out.println("------------------");


        String[] array = split("      He llo Ja v a          7", 'e');


        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);

        }

        System.out.println("------------------" + array.length);

        System.out.println(parseInt("-1245"));

        char ch = 'p';
        char ch1 = 'l';
        System.out.print(calculateCount("HGFHGFHGFHGFHGF", ch));
        System.out.print(changeCaseInt("HGFhGFHGFHGFHGF", 3, 8));
        System.out.print(changeCase("ooopoooooolooo", ch, ch1));
        System.out.print(toUpperCase("absdefjhi"));
        System.out.print(toLowerCase("ABCDEFG"));
        int a = parseInt("6512");
        System.out.print(a);
        String s = " abcdefjhi ";
        System.out.println(s);

        System.out.println(trim(s));
        System.out.print(subString("absdefg", 2, 6));


    }


    /**
     * Parses the specified inputText and divides it into tokens by the specified delimiter.
     * tekst@ verlucel  yev ayn bajanarari nshanov bajanel
     *
     * @param inputText the string to be splitted by the specified delimiter
     * @param delimiter the delimiter by which the specified inputText  will splitted.
     * @return the array of strings computed by splitting this string
     * veradardznel stringneri masiv  vor@ hashvvac e ays  bajanvac  masivov
     * <p>
     * around matches of the given regular expression.
     */

    public static String[] split(String inputText, char delimiter) {
        int count = 1;
        for (int i = 1; i <= inputText.length() - 1; i++) {
            if (inputText.charAt(i) == delimiter) {
                count++;
            }

        }
        if (count == 1) {
            String[] newString = new String[1];
            newString[0] += inputText;
            return newString;
        }


        String[] newSplitString = new String[count];
        int indexchanger = 0;
        for (int i = 0; i < inputText.length(); i++) {

            if (inputText.charAt(i) == delimiter) {
                if (i > 0) indexchanger++;
                continue;
            }


            newSplitString[indexchanger] += inputText.charAt(i);

        }


        return newSplitString;

    }


    /**
     * Returns a string that is a substring of this string. The
     * <p>
     * substring begins at the specified {@code beginIndex} and
     * <p>
     * extends to the character at index {@code endIndex - 1}.
     * <p>
     * Thus the length of the substring is {@code endIndex-beginIndex}.
     * <p>
     * <p>
     * Examples:
     * <blockquote><pre>
     * <p>
     * "hamburger".substring(4, 8) returns "urge"
     * <p>
     * "smiles".substring(1, 5) returns "mile"
     * <p>
     * </pre></blockquote>
     *
     * @param beginIndex the beginning index, inclusive.
     * @param endIndex   the ending index, exclusive.
     * @return the specified substring.
     */

    static public String subString(String inputText, int beginIndex, int endIndex) {


        String subInputText = "";
        for (int i = beginIndex - 1; i < endIndex; i++) {
            subInputText = subInputText + inputText.charAt(i);
        }
        return subInputText;
    }


    /**
     * Returns a copy of the specified str, with leading and trailing whitespace
     * <p>
     * omitted.
     *
     * @param str the String will be trimmed.
     * @return A copy of the string with leading and trailing white
     * <p>
     * space removed, or this string if it has no leading or
     * <p>
     * trailing white space.
     */

    public static String trim(String str) {

        // int lastIndex = str.length()-1;
        //   if( str.charAt(0) != ' ' && str.charAt(lastIndex) != ' '){
        //     return str;
        //  }


        //  String newstr = "";
        // for(int i = 0; i < str.length(); i++){
        //    if ( str.charAt(i) == ' ' ){
        //        continue;
        //    }


        //  newstr += str.charAt(i) ;
        // }
        //return newstr;
        // int k = str.length()-2;


        return subString(str, 2, str.length() - 1);
    }


    /**
     * Parses the string argument as a signed decimal integer. The
     * <p>
     * characters in the string must all be decimal digits, except
     * <p>
     * that the first character may be an ASCII minus sign.
     *
     * @param s a String containing the int representation to be parsed
     * @return the integer value represented by the argument in decimal.
     */

    public static int parseInt(String s) {

        int count = 0;
        if (s.charAt(0) == '-') {
            count++;
        }

        int reformed = 0;
        int reformer = 1;
        for (int i = 1; i < s.length() - count; i++) {
            reformer = reformer * 10;
        }


        for (int i = count; i < s.length(); i++) {
            reformed += ((s.charAt(i) - 48) * reformer);
            reformer = reformer / 10;

        }


        if (count == 1) {
            reformed -= (reformed * 2);
        }
        return reformed;

    }


    public static String toLowerCase(String text) {

        // String text2 = text;
        // String newtext = "";
        // char ch;
        // for(int i = 0; i < text2.length();i++){
        // ch = text2.charAt(i);
        // newtext = newtext + (char)(ch+32);
        // }


        //  return newtext;
        int lastindex = text.length() - 1;
        String s = changeCase(text, text.charAt(0), text.charAt(lastindex));

        return s;
    }


    public static String toUpperCase(String text) {


// String text2 = text;
        //     String newtext = "";
        //    char ch;
        //    for(int i = 0; i < text2.length();i++){
        //    ch = text2.charAt(i);
        //    newtext = newtext + (char)(text2.charAt(i)-32);
        //   }


        //   return newtext;
        int lastindex = text.length() - 1;
        String s = changeCase(text, text.charAt(0), text.charAt(lastindex));

        return s;


    }


    public static String changeCase(String text, char startIndex, char endIndex) {

        String newText = "";
        int realStartIndex = 0;
        int realEndIndex = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == startIndex) {
                realStartIndex = i;
            }
            if (text.charAt(i) == endIndex) {
                realEndIndex = i;
            }
        }


        for (int i = 0; i < text.length(); i++) {
            int caseChanger = 0;
            if (i >= realStartIndex && i <= realEndIndex) {
                if (text.charAt(i) >= 65 && text.charAt(i) <= 95) {
                    caseChanger = 32;
                } else if (text.charAt(i) >= 97 && text.charAt(i) <= 122) {
                    caseChanger = -32;
                }
            }

            newText = newText + (char) (text.charAt(i) + caseChanger);

        }
        return newText;
    }


    public static String changeCaseInt(String text, int startIndex, int endIndex) {


        String newtext = "";
        for (int i = 0; i < text.length(); i++) {

            int caseChanger = 0;
            if (i >= (startIndex - 1) && i < (endIndex - 1)) {
                if (text.charAt(i) >= 65 && text.charAt(i) <= 95) {
                    caseChanger = 32;
                } else if (text.charAt(i) >= 97 && text.charAt(i) <= 122) {
                    caseChanger = -32;
                }
            }
            if (i >= endIndex) {
                caseChanger = 0;
            }
            newtext = newtext + (char) (text.charAt(i) + caseChanger);

        }
        return newtext;
    }


    public static int calculateCount(String text, char symbol) {
        String text2 = new String(text);
        int count = 0;

        for (int i = 0; i < text2.length(); i++)
            if (text2.charAt(i) == symbol) {
                count++;
            }
        return count;
    }


}
