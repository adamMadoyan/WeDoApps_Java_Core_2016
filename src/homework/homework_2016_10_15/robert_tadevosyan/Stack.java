package homework.homework_2016_10_15.robert_tadevosyan;

/**
 * Created by Robert on 14.10.2016.
 */
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
        if (tos < 0) {
            System.out.printf("Nothing to pop");
            return -1;
        }
        return storage[tos--];
    }

    /**
     * Method is invoked when storage is full and need to extend
     */
    private void extendStorage() {
        int[] externalStotageArray = new int[storage.length * 3 / 2 + 1];
        for (int i = 0; i < storage.length; i++) {
            externalStotageArray[i] = storage[i];
        }
        storage = externalStotageArray;
    }

    public void printStackValues() {
        if (tos >= 0) {
            System.out.printf("Stack = { ");
            for (int i = 0; i <= tos; i++) {
                System.out.printf(String.valueOf(storage[i]) + ", ");
            }
            System.out.println("}");
        } else {
            System.out.println("The stack is empty");
        }
    }
}