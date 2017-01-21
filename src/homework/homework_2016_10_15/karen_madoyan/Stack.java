package homework.homework_2016_10_15.karen_madoyan;


public class Stack {

    //    TODO what is this ???
    public static int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String args[]) {

        System.out.println(fact(4));
        //---------------------------

        Stack disc = new Stack(1);
        System.out.println(disc.tos);
        disc.push(5);
        System.out.println(disc.tos);
        disc.pop();
        disc.pop();
        disc.pop();
//        System.out.println(disc.tos);
        disc.push(5);
        disc.push(5);
        disc.push(5);
        disc.push(5);
        disc.push(5);
        disc.push(5);
        disc.pop();
        disc.pop();
        disc.pop();
        System.out.println(disc.pop());
        System.out.println(disc.tos);
    }

    public static final int DEFAULT_CAPACITY = 16;
    /**
     * Data storage to store the Stack's values
     */
    private int[] storage;
    /**
     * Index of the last element in the Stack.
     * Initial value must be -1.
     * This is not a length of data storage.
     * It must be increased when new element is added in to StackImpl
     * and decreased on pop action
     */
    private int tos;

    public Stack() {
        this(DEFAULT_CAPACITY);
    }

    public Stack(int capacity) {
        this.storage = new int[capacity];
        this.tos = -1;
    }

    //    END OF CONSTRUCTORS
    public void push(int value) {
        int length = storage.length;
        if (tos >= length - 1) {
            extendStorage();
        }
        storage[++tos] = value;
        // this is mean that it must be checked
        // if tos == storage.length -1 then must be called a method for instance "extendStorage()"
        // in the mentioned method You must create new int[] fill in content of storage field,
        // and then assign the new array reference to the storage field.
    }

    /**
     * Removes the object at the top of this stack and returns that
     * object as the value of this function.
     *
     * @return The value at the top of stack (tos) (the last item
     * of storage).
     */
    public int pop() {
        if (tos < 0) {
            return tos;
        } else {
            return tos--;
        }
    }

    /**
     * Method is invoked when storage is full and need to extend
     */
    private void extendStorage() {
//        TODO review
        int length = storage.length;
        int newLength = length * 3 / 2 + 1;
        int[] newStorage = new int[newLength];
//        TODO
        for (int i = 0; i < length; i++) {
            newStorage[i] = storage[i];
        }
        storage = newStorage;
    }

}
