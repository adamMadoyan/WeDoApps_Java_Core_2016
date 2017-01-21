package homework.homework_2016_10_15.telman_gurgenyan;


public class Stack {

    public static final int DEFAULT_CAPACITY = 16;

    /**
     * Data storage to store the Stack's values
     */
    private int[] storage;
    /**
     * Index of the last element in the Stack.
     * Initial value must be -1.
     * This is not a length of data storage.
     * It must be increased when new element is added in to Stack Impl
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
//        TODO review
        if (tos == storage.length - 1) {
            extendStorage();
        }
        storage[++tos] = value;

    }

    /**
     * Removes the object at the top of this stack and returns that
     * object as the value of this function.
     *
     * @return The value at the top of stack (tos) (the last item
     * of storage).
     */
    public int pop() {
//        TODO review
        if (tos > -1) {
            return storage[tos--];
        }
        System.out.println("Stack is empty!");
        return -1;
    }

    /**
     * Method is invoked when storage is full and need to extend
     */
    private void extendStorage() {
//        TODO review
        int[] newstorage = new int[storage.length + 1];
        System.arraycopy(storage, 0, newstorage, 0, tos);
        storage = newstorage;
    }

    //    TODO review ???
    public void print() {
        for (int i = tos; i >= 0; i--) {
            System.out.println("Staсk elements - :" + storage[i]);
        }
    }
}

