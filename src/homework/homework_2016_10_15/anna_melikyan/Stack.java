package homework.homework_2016_10_15.anna_melikyan;

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
//        TODO review
        if (tos == storage.length - 1) {
            extendStorage();
        } else {
            storage[++tos] = value;
        }

    }

    /**
     * Removes the object at the top of this stack and returns that
     * object as the value of this function.
     *
     * @return The value at the top of stack (tos) (the last item
     * of storage).
     */
    public int pop() {
// TODO please write all brackets
//        if (tos < 0) {
//            return -1;
//        } else {
//            return storage[tos--];
//        }
        return tos < 0 ? -1 : storage[tos--];
    }


    /**
     * Method is invoked when storage is full and need to extend
     */
    private void extendStorage() {
        int count = storage.length - 1;
//        TODO when storage length is 0 then throws exception
        int[] array = new int[count * 3 / 2 + 1];
        if (count > DEFAULT_CAPACITY) {
            System.arraycopy(storage, 0, array, 0, array.length - 1);
        }
    }

}
