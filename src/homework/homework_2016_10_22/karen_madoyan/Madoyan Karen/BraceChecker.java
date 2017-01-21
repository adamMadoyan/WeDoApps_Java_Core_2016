package attachment;

public class BraceChecker {
    private Stack stack;
    private String message = "No errors";
    private int errorIndex = -1;

    public String getMessage() {
        return message;
    }

    public String getErrorIndex() {
        return "errorIndex";
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
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(' || text.charAt(i) == '[' || text.charAt(i) == '{') {
                stack.push(i);
            }
            if (text.charAt(i) == stack.showEndElemnt()) {
                stack.pop();
            }            
        }

        return stack.isEmpty();
    }

}
