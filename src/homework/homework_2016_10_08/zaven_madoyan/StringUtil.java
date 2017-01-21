package homework.homework_2016_10_08.zaven_madoyan;


public class StringUtil {


    public static void main(String[] args) {

        System.out.println(calculateCount("kuku", 'u'));

        System.out.println(subString("hello world", 0, 3));

        System.out.println("trim '   text '|" + trim("   text ") + "|");
        System.out.println("trim 'text '   |" + trim("text ") + "|");
        System.out.println("trim 'te xt'   |" + trim("te xt") + "|");
        System.out.println("trim '   '     |" + trim("   ") + "|");
        System.out.println("trim ''        |" + trim(" ") + "|");
        System.out.println(changeCase("hello" , 0));
        System.out.println(changeCase("ABUlo", 'B', 'l'));
        System.out.println(toLowerCase("Hhow Hare Yyou"));

        String[] array = split("Javai jani", 'a');

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println("------------------" + array.length);
        System.out.println(parseInt("-12345"));
        System.out.println(toUpperCase("HeEsLlLlOo"));
    }


    public static String[] split(String inputText, char delimiter) {
        int i;
        int j = 0;
        String a[] = new String[inputText.length()];
        for (i = 0; i < inputText.length(); i++) {
            a[j] = "";
            if (inputText.charAt(i) == delimiter) {
                a[j] += " ";
            }
            while (inputText.charAt(i) != delimiter) {
                a[j] += "";
                a[j] += inputText.charAt(i);
                break;
            }
            j++;
        }
        return a;
    }

    static public String subString(String inputText, int beginIndex, int endIndex) {
        String res = "";
        if (endIndex <= beginIndex){
            return "-1";
        }
        for (int i = beginIndex; i < endIndex; i++) {
            res += (inputText.charAt(i));
        }

        return res;
    }

    public static String trim(String str) {
        String res = "";
        int i = 0;
        for (str.charAt(i); i < str.length(); i++) {
            if (str.charAt(i) == 32) {
                continue;
            } else {
                res += str.charAt(i);
            }
        }
        return res;
    }

    public static int parseInt(String s) {
        int i;
        int count = 0;
        for (i = 0; i < (s.length()); i++) {
            if (s.charAt(i) == '-') {
                continue;
            } else {
                count *= 10;
                count += s.charAt(i) - 48;
            }
        }
        if (s.charAt(0) == '-') {
            count = 0 - count;
        }
        return count;
    }

    public static String toUpperCase(String text) {
        int i = 0;
        String res = "";
        for (text.charAt(i); i < text.length(); i++) {
            if (text.charAt(i) >= 97 && text.charAt(i) < 123) {
                res += (char) (text.charAt(i) - 32);
            } else {
                res += text.charAt(i);
            }
        }
        return res;
    }

    public static String toLowerCase(String text) {
        int i = 0;
        String res = "";
        for (text.charAt(i); i < text.length(); i++) {
            if ((text.charAt(i) >= 41) && text.charAt(i) < 91) {
                res += (char) (text.charAt(i) + 32);
            } else {
                res += text.charAt(i);
            }
        }
        return res;
    }

    private static String changeCase(String text1, int Index) {
        String res = "";
        int i = 0;
        while (i < text1.length()) {
            if (Index < 0 || Index >= text1.length()) {
                return " NOT INDEX";
            } else if ((Index == i && text1.charAt(Index) >= 97 && text1.charAt(Index) < 123)) {
                res += ((char) (text1.charAt(Index) - 32));
                i++;
            } else if ((Index == i && (text1.charAt(Index) >= 41) && text1.charAt(Index) < 91)) {
                res += ((char) (text1.charAt(Index) + 32));
                i++;
            } else {
                res += text1.charAt(i);
                i++;
            }
        }
        return res;
    }

    private static String changeCase(String text1, char startIndex, char endIndex) {
        int i = 0;
        String res = "";
        for (text1.charAt(i); i < text1.length(); i++) {
            if (text1.charAt(i) == startIndex) {
                while (text1.charAt(i) != endIndex) {
                    if (text1.charAt(i) >= 97 && text1.charAt(i) < 123) {
                        res += (char) (text1.charAt(i) - 32);
                        i++;
                    } else if ((text1.charAt(i) >= 41) && text1.charAt(i) < 91) {
                        res += (char) (text1.charAt(i) + 32);
                        i++;
                    }
                    if (text1.charAt(i) == endIndex) {
                        res += endIndex;
                    }
                }
            } else if (text1.charAt(i) != startIndex) {

                res += text1.charAt(i);
            }
        }

        return res;
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