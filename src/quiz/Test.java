package quiz;

class Test {
    public static void main(String [] args) 
    {

        String s1 = "a";
        String s2 = "a";

        System.out.println(s1 == s2);

        Test p = new Test();
        p.start();
    }
    void start() 
    {
        Boolean b1 = false;
        Boolean b2 = fix(b1);
        System.out.println(b1 + " " + b2);
    }
    boolean fix(Boolean b1)
    {
        b1 = true;
        return b1;
    }
}