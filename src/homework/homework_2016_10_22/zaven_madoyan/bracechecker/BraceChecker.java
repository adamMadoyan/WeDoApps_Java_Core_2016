    package bracechecker;

    public class BraceChecker {

    private Stack stack;

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
    public String getMessage() { return message;
    }

    public int getErrorIndex() {
        return errorIndex;
    }


    public BraceChecker() {

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
      stack = new Stack();
        boolean b = true;
        int length = text.length();
        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            if ( c == '(' || c == '{' || c == '[') {
                stack.push(c);

            } else if (c == ')' || c == ']' || c == '}') {
                if (length != 0) {
                    char d;
                    switch (c) {
                        case ')':
                            d =  (char)stack.pop();
                            if (d != '(') {
                                b = false;
                            }
                        case ']':
                            d = (char) stack.pop();
                            if (d != '[') {
                                b = false;
                            }
                        case '}':
                            d = (char) stack.pop();
                            if (d != '{') {
                                b = false;
                            }
                    }
                } else {
                    b = false;
                }
            }


        }
        if (b && length != 0) {
            return true;
        } else {
            return false;
        }

    }

}
