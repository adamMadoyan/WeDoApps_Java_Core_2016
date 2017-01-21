package homework.homework_2016_10_22.robert_tadevosyan.bracechecker;

public class BraceChecker {
    /**
     * TO store the opened brackets in text to be parsed
     */
    private Stack stack;

    private String text;

    /**
     * TO store the parsing result
     */
    private String message = "No errors";

    /**
     * Error symbol index in parsing text
     */
    private int errorIndex = -1;

    /**
     * Getter method for message field
     *
     * @return the value of the message
     */
    public String getMessage() {
        return message;
    }

    public int getErrorIndex() {
        return errorIndex;
    }


    public BraceChecker() {
        stack = new Stack();
    }

    /**
     * Parses the text to check correctness of disposition of brackets in text ,
     * and in case of incorrectness initializes following errorIndex,
     * errorIndexInLine and errorLineNumber fields, to indicate where
     * incorrectness occur.
     *
     * @return true if parsing passed without error, otherwise false
     */
    public boolean parse(String text) {
        char firstCharOfText = text.charAt(0);
        if (firstCharOfText == '}' || firstCharOfText == ']' || firstCharOfText == ')') {
            return false;
        }
        int lengthOfText = text.length();
        char charAtCurrentIndex;
        for (int i = 0; i < lengthOfText; i++) {
            charAtCurrentIndex = text.charAt(i);
            if (charAtCurrentIndex == '{') {
                stack.push(charAtCurrentIndex);
            } else if (charAtCurrentIndex == '[') {
                stack.push(charAtCurrentIndex);
            } else if (charAtCurrentIndex == '(') {
                stack.push(charAtCurrentIndex);
            } else if (charAtCurrentIndex == ')') {
                if (stack.getTosObject() == '(') {
                    stack.pop();
                } else {
                    errorIndex = i;
                    message = "Error While Parsing Text";
                    break;
                }
            } else if (charAtCurrentIndex == ']') {
                if (stack.getTosObject() == '[') {
                    stack.pop();
                } else {
                    errorIndex = i;
                    message = "Error While Parsing Text";
                    break;
                }

            } else if (charAtCurrentIndex == '}') {
                if (stack.getTosObject() == '{') {
                    stack.pop();
                } else {
                    errorIndex = i;
                    message = "Error While Parsing Text";
                    break;
                }

            }
//            else {
//                continue;
//            }
        }
        boolean isStackEmpty = stack.getTos() == 0 || stack.getTos() == -1;
        if (!isStackEmpty) {
            message = "Error While Parsing Text";
            //errorIndex = i;
        }
        return isStackEmpty;

    }
}
