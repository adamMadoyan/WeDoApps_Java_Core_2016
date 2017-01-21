package homework.homework_2016_10_22.anna_melikyan.bracechecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        parseTest();
    }

    public static void parseTest() {
        boolean isOk = true;
        BraceChecker braceChecker = new BraceChecker();
        braceChecker.parse("sa hf ( )");
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


        if (isOk) {
            System.out.println("'parseTest' is passed with 'No Error'");
        }
    }
}
