package homework.homework_2016_10_22.robert_tadevosyan.bracechecker;

public class Stack {

    public static final int DEFAULT_CAPACITY = 16;

    /**
     * Data storage to store the Stack's values
     */
    private char[] storage;

    /**
     * Index of the last element in the Stack.
     * Initial value must be -1.
     * This is not a length of data storage.
     * It must be increased when new element is added in to Stack
     * and decreased on pop action
     */
    private int tos;

    public int getTos() {
        return tos;
    }


    public Stack(int capacity) {
        this.storage = new char[capacity];
        this.tos = -1;
    }

    public Stack() {
        this(DEFAULT_CAPACITY);
    }
//    END OF CONSTRUCTORS

    public void push(char value) {
        if (storage.length - 1 == tos) {
            extendStorage();
        } else {
            storage[++tos] = value;
        }
    }

    public char pop() {
        if (storage.length == 0) {
            return (char) -1;
        }
        return storage[tos--];
    }

    private void extendStorage() {
        char[] externalStorage = new char[storage.length / 2 + 1];
        int storageLength = storage.length;
        for (int i = 0; i < storageLength; i++) {
            externalStorage[i] = storage[i];
        }
        storage = externalStorage;
    }

    public char getTosObject() {
        if (tos < 0) {
            return (char) -1;
        }
        return storage[tos];
    }
}
