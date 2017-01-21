package homework.homework_2016_10_22.telman_gurgenyan.bracechecker;


public class BraceCheckerTest {

    public static void main(String[] args) {
        String text = "({a}[b])";
        String textBrace = "([a}{b])";
        BraceChecker braceCheker = new BraceChecker();

        print(braceCheker.parse(text));
        print(braceCheker.parse(textBrace));
    }

    public static void print(boolean b) {
        BraceChecker braceCheker = new BraceChecker();

        System.out.println("******************");

        if(b){
            System.out.println(braceCheker.getMessage());
        }
        else {
            System.out.println(braceCheker.getErrorIndex());
        }
        System.out.println("******************");

    }

}
