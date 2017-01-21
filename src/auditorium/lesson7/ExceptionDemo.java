package auditorium.lesson7;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo {


    public static void main(String[] args) {

        try {
            System.out.println("START");
            String res = calculate(45, 78);
            System.out.println(res);
            System.out.println("END");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    static String calculate(double a, double b) {
        String result  = " ";
        try {
            double quotient = divide(a, b);
            result = a + " / " + b + " = " + quotient;
//            throw new ClassCastException("Class cast exception");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        } finally {
//            throw new NullPointerException("Null pointer exception");
            System.out.println();
        }
        return result;
    }

    static double divide(double a, double b) throws MyException, IOException {
        if (b == 0) {
            throw new MyException("Number can not be divided by zero.");
        }
        if (b == 45) {
            throw new IOException("Number can not be divided by zero.");
        }
        return a / b;
    }

}


class MyException extends Exception {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

class A {

    public A() throws IOException {
    }

    void test() throws Exception {

    }


    void a () throws Exception {

    }

}

class B extends A {

    public B() throws Exception {
        super();
    }

    @Override
    void test() throws FileNotFoundException {

    }

}

class Main {
    public static void main(String[] args) {



    }
}
