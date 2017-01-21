package homework.homework_2016_10_15.zaven_madoyan;

public class Stack {

    public static final int DEFAULT_CAPACITY = 16;
    private int tos;
    private int[] storage;

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
//        TODO why need length
        int length = storage.length;
//        TODO please write all brackets
        if (tos < 0) {
            return -1;
        } else {
            return storage[tos--];
        }
    }


    private void extendStorage() {
        int length = storage.length;
        int[] array = new int[length * 3 / 2 + 1];
//        TODO use already written code when you do not know your code more effective than libs
        for (int i = 0; i < length; i++) {
            array[i] = storage[i];
        }
        storage = array;
    }
}

