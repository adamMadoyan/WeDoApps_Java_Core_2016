package homework.homework_2016_10_22.anna_melikyan.bracechecker;

public class BraceChecker {
    /** TO store the opened brackets in text to be parsed */
    private Stack stack;

    /** TO store the parsing result */
    private String message = "No errors";

    /** Error symbol index in parsing text */
    private int errorIndex = -1;

    /**
     * Getter method for message field
     * @return the value of the message
     */
    public String getMessage() {

        message = "No find an opening bracket";
        return message;
    }

    public int getErrorIndex() {
        return errorIndex;
    }


    public BraceChecker() {

       Stack stack = new Stack();
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


        for (int  i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(' || text.charAt(i) == '[' || text.charAt(i) == '{' ) {
                stack.push(i);
            } else
                if (text.charAt(i) == ')') {
                    if (stack == null) {
                        getMessage();
                        return false;
                }
                    if (stack.pop() != '(') {
                        return false;
                    }
                }

            else
                    if (text.charAt(i) == ']') {
                        if (stack == null) {
                            getMessage();
                            return false;
                        }
                        if (stack.pop() != '[') {
                            return false;
                        }
                    }

                else
                    if (text.charAt(i) == '}') {
                        if (stack == null) {
                            getMessage();
                            return false;
                        }
                        if (stack.pop() != '{') {
                            return false;
                        }
                    }




        }

        return false;
    }


}
