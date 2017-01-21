package auditorium.bracechecker;


import homework.homework_2016_10_22.BraceChecker;

public class BraceCheckerTest {
    public static void main(String[] args) {

        new BraceCheckerFrame();

    }

    public static void parseTest() {


        boolean isOk;

        BraceChecker braceChecker = new BraceChecker();

        isOk = braceChecker.parse("({{ }}\n" +
                                  "[] ]  ");
        // Here You have to write different test cases, for instance:
        //  opened '(' but not closed
        //  opened '{' but not closed
        //  opened '[' but not closed
        //
        //  opened '(' but closed other type's bracket
        //  opened '(' but closed other type's bracket
        //  opened '(' but closed other type's bracket
        //
        //  closed ')' but not opened
        //  closed '}' but not opened
        //  closed ']' but not opened

        BraceChecker.BracedItem b = new BraceChecker.BracedItem('g', 5, 6);
        BraceChecker checker = new BraceChecker();
        BraceChecker.Inner v = checker.new Inner();

        if (isOk) {
            System.out.println("'parseTest' is passed with 'No Error'");
        } else {
            System.err.println(braceChecker.getMessage());
        }
    }

}
