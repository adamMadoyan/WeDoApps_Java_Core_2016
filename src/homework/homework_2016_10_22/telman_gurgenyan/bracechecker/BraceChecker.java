package homework.homework_2016_10_22.telman_gurgenyan.bracechecker;

public class BraceChecker {
    /**
     * TO store the opened brackets in text to be parsed
     */
    private Stack stack = new Stack();

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
        // TODO initialize  the "stack" by calling of default constructor
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

//        TODO use local variable
        for (int i = 0; i < text.length(); i++) {

            char simvl = text.charAt(i);

            if (simvl == '(' || simvl == '[' || simvl == '{') {
                stack.push(text.charAt(i));
//                TODO continue if any of this character
            }


            if (simvl == ')') {
                if (stack.storage[stack.tos] == '(' && stack.tos >= 0) {
                    stack.pop();
                } else {
                    return false;

                }
            }

            if (simvl == ']') {
                if (stack.storage[stack.tos] == '[' && stack.tos >= 0) {
                    stack.pop();
                } else {
                    return false;

                }
            }

            if (simvl == '}') {
                if (stack.storage[stack.tos] == '{' && stack.tos >= 0) {
                    stack.pop();
                } else {
                    return false;

                }
            }

        }


        return stack.tos < 0 ? true : false;

    }


}

