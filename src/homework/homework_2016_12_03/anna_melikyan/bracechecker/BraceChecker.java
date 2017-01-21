package homework.homework_2016_12_03.anna_melikyan.bracechecker;

import homework.homework_2016_10_22.Stack;

public class BraceChecker {
    /**
     * TO store the opened brackets in text to be parsed
     */
    private homework.homework_2016_10_22.Stack stack;

    /**
     * TO store the parsing result
     */
    private String message = "No errors";

    /**
     * Error symbol index in parsing text
     */
    private int errorIndex = -1;


    public BraceChecker() {
        stack = new Stack();
    }

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


    /**
     * Parses the text to check correctness of disposition of brackets in text ,
     * and in case of incorrectness initializes following errorIndex,
     * errorIndexInLine and errorLineNumber fields, to indicate where
     * incorrectness occur.
     *
     * @return true if parsing passed without error, otherwise false
     */
    public boolean parse(String text) {

        int length = text.length();

        char element;
        int numberInLine = 0;
        int numberOfLine = 1;

        for (int i = 0; i < length; i++) {
            errorIndex = i;
            element = text.charAt(i);
            numberInLine++;
            if (element == '\n') {
                numberInLine = 0;
                numberOfLine++;
            }
            switch (element) {
                case '{':
                case '[':
                case '(':
                    stack.push(new BracedItem(element, numberOfLine, numberInLine));
                    break;
                case '}': {
                    if (stack.isEmpty()) {
                        message = "In " + numberOfLine + " line at " + numberInLine +
                                " index Closed '}' but not opened.";
                        return false;
                    } else {
                        BracedItem lastElement = (BracedItem) stack.pop();
                        if (lastElement.getValue() != '{') {
                            message = "'" + lastElement.getValue() + "' opened in " + lastElement.getNumberOfLine() +
                                    " line at " + lastElement.getNumberInLine() + " index but closed '}' in "
                                    + numberOfLine + " line at " + numberInLine + " index.";
                            return false;
                        }
                    }
                    break;
                }
                case ']': {
                    if (stack.isEmpty()) {
                        message = "Closed ']' but not opened.";
                        return false;
                    } else {
                        BracedItem lastElement = (BracedItem) stack.pop();
                        if (lastElement.getValue() != '[') {
                            message = "'" + lastElement.getValue() + "' opened in " + lastElement.getNumberOfLine() +
                                    " line at " + lastElement.getNumberInLine() + " index but closed ']' in "
                                    + numberOfLine + " line at " + numberInLine + " index.";
                            return false;
                        }
                    }
                    break;
                }
                case ')': {
                    if (stack.isEmpty()) {
                        message = "Closed ')' but not opened.";
                        return false;
                    } else {
                        BracedItem lastElement = (BracedItem) stack.pop();
                        if (lastElement.getValue() != '(') {
                            message = "'" + lastElement.getValue() + "' opened in " + lastElement.getNumberOfLine() +
                                    " line at " + lastElement.getNumberInLine() + " index but closed ')' in "
                                    + numberOfLine + " line at " + numberInLine + " index.";
                            return false;
                        }
                    }
                    break;
                }

            }
        }

        if (!stack.isEmpty()) {
            BracedItem lastElement = (BracedItem) stack.pop();
            message = "'" + lastElement.getValue() + "' opened in " + lastElement.getNumberOfLine() +
                    " line at " + lastElement.getNumberInLine() + " index but not closed.";
            return false;
        }
        return true;
    }


    public static class BracedItem {

        private char value;
        private int numberOfLine;
        private int numberInLine;

        public BracedItem(char value, int numberOfLine, int numberInLine) {
            this.value = value;
            this.numberOfLine = numberOfLine;
            this.numberInLine = numberInLine;
        }

        public char getValue() {
            return value;
        }

        public int getNumberOfLine() {
            return numberOfLine;
        }

        public int getNumberInLine() {
            return numberInLine;
        }
    }

}