package homework.homework_2016_10_22.telman_gurgenyan.bracechecker;


public class Stack {

    public static final int DEFAULT_CAPACITY = 16;

//    TODO incorrect encapsulation
    /**
     * Data storage to store the Stack's values
     */
     int[] storage;

    /**
     * Index of the last element in the Stack.
     * Initial value must be -1.
     * This is not a length of data storage.
     * It must be increased when new element is added in to Stack
     * and decreased on pop action
     */
     int tos;

    //    START OF CONSTRUCTORS' BLOCK
    public Stack(int capacity) {
        this.storage = new int [capacity];
        this.tos = -1;
    }

    public Stack() {
        this(DEFAULT_CAPACITY);
    }
//    END OF CONSTRUCTORS

    public void push(int value) {
        tos++;
        storage[tos]= value;
    }

    public int pop() {
        if (tos > -1) {
            return storage[tos--];

        }
        return -1;
    }

}
