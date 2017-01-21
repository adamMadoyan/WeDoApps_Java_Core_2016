package homework.homework_2016_10_08.telman_gurgenyan;

public class StringUtil {


    public static void main(String[] args) {

        String stringTest = "  Helo woRLd ";
        String intText = "458";
        System.out.print("Metod Splint- ");
        for (int i = 0; i < split(stringTest, ' ').length; i++) {
            System.out.print(split(stringTest, ' ')[i] + ":  ");
        }
        System.out.println();
        System.out.println("Metod SubString -  :" + subString(stringTest, 4, 7));
        System.out.println("Metod trim -       :" + trim(stringTest) + ":");
        System.out.println("Metod parsInt -    :" + parseInt(intText));
        System.out.println("Metod toLowerCase -:" + toLowerCase(stringTest));
        System.out.println("metod toUpperCase -:" + toUpperCase(stringTest));

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
        String str = "";

        String[] arayyWord = new String[calculateCount(inputText, delimiter) + 1];
        int arayyElement = 0;
        for (int i = 0; i < inputText.length(); i++) {

            if (inputText.charAt(i) != delimiter && i != inputText.length() - 1) {
                str += inputText.charAt(i);
            }
            if (inputText.charAt(i) == delimiter && i != inputText.length() - 1) {
                str += delimiter;
                arayyWord[arayyElement] = str;
                arayyElement++;
                str = "";
            }
            if (i == inputText.length() - 1) {
                arayyWord[arayyElement] = str;
            }
        }
        return arayyWord;
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
        String str = "";
        for (int i = beginIndex - 1; i < endIndex; i++) {
            str += inputText.charAt(i);
        }
        return str;
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
        char charDelet = ' ';
        int toDelet = 0;
        int fromDelet = 0;
        String textReturn = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != charDelet) {
                toDelet = i;
                break;
            }

        }
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != charDelet) {
                fromDelet = i;
                break;
            }

        }
        for (int i = toDelet; i <= fromDelet; i++) {
            textReturn += str.charAt(i);

        }
        return textReturn;
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
        int intRet = 0;
        int intArray[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > 47 && s.charAt(i) < 58) {
                intArray[i] = s.charAt(i) - 48;
            }
            for (int j = 0; j < intArray.length - 1; j++) {
                if (j == 0) {
                    intRet = intArray[0] * 10 + intArray[j + 1];
                } else {
                    intRet = intRet * 10 + intArray[j + 1];
                }
            }

        }
        return intRet;
    }

    public static String toLowerCase(String text) {
        String textLo = "";
        char simvl;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) > 64 && text.charAt(i) < 91) {
                simvl = (char) (text.charAt(i) + 32);
                textLo += simvl;
            } else {
                textLo += text.charAt(i);
            }
        }
        return textLo;
    }

    public static String toUpperCase(String text) {
        String textLo = "";
        char simvl;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) > 96 && text.charAt(i) < 123) {
                simvl = (char) (text.charAt(i) - 32);
                textLo += simvl;
            } else {
                textLo += text.charAt(i);
            }
        }
        return textLo;
    }

    private static String changeCase(String text, char startIndex, char endIndex) {

        return null;
    }

    public static int calculateCount(String text, char symbol) {
        int count = 0;
        for (int i = 0; i < text.length() - 1; i++) {
            if (symbol == text.charAt(i)) {
                count++;
            }
        }
        return count;
    }

}