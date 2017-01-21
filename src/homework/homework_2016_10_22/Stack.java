package homework.homework_2016_10_22;

public class Stack {

    public static final int DEFAULT_CAPACITY = 16;

    /**
     * Data storage to store the Stack's values
     */
    private Object[] storage;

    /**
     * Index of the last element in the Stack.
     * Initial value must be -1.
     * This is not a length of data storage.
     * It must be increased when new element is added in to Stack
     * and decreased on pop action
     */
    private int tos;

    public Stack() {
        this(DEFAULT_CAPACITY);
    }

    public Stack(int capacity) {
        this.storage = new Object[capacity];
        this.tos = -1;
    }

    public void push(Object value) {
//        TODO check  if stack is full then extend storage
        if (storage.length-1 == tos) {
            extendStorage();
        }
        storage[++tos] = value;
    }

    public Object pop() {
        return tos == -1 ? null : storage[tos--];
    }

    public Object peek() {
        return tos == -1 ? null : storage[tos];
    }

    public boolean isEmpty() {
        return tos == -1;
    }

    private void extendStorage() {

    }

}
