package homework.homework_2016_10_15;


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
        // TODO implement such that it will have ability to add elements unlimited.
        // this is mean that it must be checked
        // if tos == storage.length -1 then must be called a method for instance "extendStorage()"
        // in the mentioned method You must create new int[] fill in content of storage field,
        // and then assign the new array reference to the storage field.
    }

    /**
     * Removes the object at the top of this stack and returns that
     * object as the value of this function.
     *
     * @return  The value at the top of stack (tos) (the last item
     *          of storage).
     */
    public int pop() {
        return 1; // TODO implement
    }

    /**
     * Method is invoked when storage is full and need to extend
     */
    private void extendStorage() {
        // TODO implement
    }

}
