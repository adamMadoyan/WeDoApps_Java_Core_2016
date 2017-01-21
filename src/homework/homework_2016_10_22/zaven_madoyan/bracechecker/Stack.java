package bracechecker;

public class Stack {

    public static final int DEFAULT_CAPACITY = 16;
    public int tos;
    public int[] storage;

    public Stack() {
        this(DEFAULT_CAPACITY);
    }

    public Stack(int capacity) {
        this.storage = new int[capacity];
        this.tos = -1;
    }

    public void push(int value) {
        int length = storage.length;
        if (tos == length - 1) {
            extendStorage();
        }
        storage[++tos] = value;
    }

    public int pop() {
        if (tos < 0)
            return -1;
        else {
            return storage[tos--];
        }
    }


    private void extendStorage() {
        int length = storage.length;
        int[] array = new int[length * 3 /2 + 1];
        for (int i = 0; i < length; i++) {
            array[i] = storage[i];
        }
        storage = array;
    }
}

