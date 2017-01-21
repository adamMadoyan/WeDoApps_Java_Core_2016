package auditorium.lesson2;

import javax.swing.*;

public class OperatorsDemo {


    public static void main(String[] args) {

//        String someText = "Hello, my name is kuku!";
//
//        System.out.println(someText);

//
        String result = "";

        while (result != null) {
            result = JOptionPane.showInputDialog(null, "Please input a number.",
                    "Title", JOptionPane.QUESTION_MESSAGE);

            if (result == null) {
                return;
            }

            int res = Integer.parseInt(result);

            printIntAsBinary(res);
        }


//        int i = 5;
//
//        int j = 45;
//
//        if (i > j) {
//            System.out.println("i > j is " + (i > j));
//        } else if (i == j) {
//            System.out.println("i == j is " + (i == j));
//        } else {
//            System.out.println("i < j is " + (i < j));
//        }

//        int u = 5;
//        System.out.println(++u);
//        System.out.println(u);

//        int res = 45;

//        for (int m = 0; m <= res; m++) {
//            if (m == 5) {
//                continue;
//            }
//            if ((m & 1) == 1) {
//                System.out.println(m + " is odd.");
//            }
//            if (m == 10) {
//                break;
//            }
//        }
//
//        int t = 45; // decimal value
//        t = 0xA; // hexadecimal value
//        t = 071; // octal value
//        t = 0b010101; // binary value

//        int[] array = {4, 8, 9, 6};

//        int[] arr = new int[4];

//        System.out.println(arr.length);

//        arr[0] = 45;
//        arr[1] = 415;
//        arr[2] = 456;
//        arr[3] = 457;

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("arr[" + i + "] > " + arr[i]);
//        }
//
//        int[][] a = new int[2][5];
////        int [][] a = {{1, 5}, {4, 5}};
//
//        Random r = new Random();
//
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                a[i][j] = r.nextInt(50);
//            }
//        }
//
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }

//        System.out.println();
//        for (char i = '0'; i <= '9'; i++) {
//            System.out.println((int)i);
//        }

//        int t = 0;
//        while (t < 11) {
//            System.out.println(t++);
//        }

        int week = 8;

        switch (week) {
            default:
                System.out.println("You choose wrong week :( ");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
        }

    }

    public static void printIntAsBinary(int a) {
        for (int i = 31; i >= 0; i--) {
            if (((1 << i) & a) != 0) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }
        System.out.println();
    }

    public static int sum(int a, int b) {
        return a + b;
    }

}
