package auditorium.lesson3;


public class ClassDemo {


    public static void main(String[] args) {

        int count = 10;

        Figure[] figures = new Figure[count];

//        Figure figure1 = new Figure() {
//            @Override
//            public void draw() {
//                System.out.println("");
//            }
//
//            @Override
//            public boolean isBelong(int x, int y) {
//                return false;
//            }
//        };


        for (int i = 0; i < count; i++) {
            figures[i] = i % 2 == 1 ? new Circle() : new Rectangle();
//            figures[i].draw();
//            if (figures[i] instanceof Circle) {
//                ((Circle) figures[i]).print();
//            } else if (figures[i] instanceof Rectangle) {
//                ((Rectangle) figures[i]).print();
//            }
        }

//        for (Figure f : figures) {
//            if (f instanceof Circle) {
//                System.out.println(((Circle) f).getTest());
//            } else if (f instanceof Rectangle) {
//                System.out.println(((Rectangle) f).getCount());
//            }
//        }


    }


    private static void referenceTypeTest(Rectangle rectangle) {
        rectangle.setHeight(999);
    }


    private static void primitiveTypeTest(int a) {
        a = 999;
    }


}
