package homework.homework_2016_10_01.karen_madoyan;

import java.util.Random;

public class DynamicArray {


    public static final int DEFAULT_CAPACITY;

    static {
        DEFAULT_CAPACITY = 16;
    }

    private int[] storage;
    private int count;

    {
        Random random = new Random();
        System.out.println(DEFAULT_CAPACITY);
        storage = new int[DEFAULT_CAPACITY];
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            storage[i] = random.nextInt(101);
        }
        count = 45;
    }


    public DynamicArray() {
//        this(DEFAULT_CAPACITY);
//        storage = new int[DEFAULT_CAPACITY];
        count = 0;
    }

//    public DynamicArray(int capacity) {
//        storage = new int[capacity];
//        count = 0;
//    }

    int size() {
        return count;
    }

    boolean isEmpty() {
        return count == 0;
    }

    boolean contains(int e) {
        for (int i = 0; i < count; i++) {
            if (storage[i] == e) {
                return true;
            }
        }
        return false;
    }

    int indexOf(int element) {
        int tmp = -1;
        for (int i = 0; i < count; i++) {
            if (storage[i] == element) {
                tmp = i;
            }
        }
        return tmp;
    }

    int get(int index) {
        if (index < count) {
            return storage[index];
        }
        return -1;
    }

    int set(int index, int element) {
        int tmp = storage[index];
        if (index < count) {
            storage[index] = element;
            return tmp;
        }
        return -1;
    }

    boolean add(int element) {
        if (count >= DEFAULT_CAPACITY) {
            extendStorage();
        } else {
            storage[count++] = element;
            count++;
        }
        return true;
    }

    void add(int index, int element) {
        int tmp = 0;
        if (count >= DEFAULT_CAPACITY) {
            extendStorage();
        } else {
            for (; index <= count; index++) {
                tmp = storage[index];
                storage[index] = element;
                element = storage[index + 1];
                storage[index + 1] = tmp;
                index++;
            }
            count++;
        }// lavner Ad mshakvac, indz tvuma korekt codem mshakel estegh
    }

    int remove(int index) {
        int tmp = -1;
        if (index < count) {
            tmp = storage[index];
            for (; index < count - 1; index++) {
                storage[index] = storage[index + 1];
            }
            storage[count - 1] = 0;
            count--;
        }
        return tmp;
    }


    /**
     * Method is invoked when storage is already full, and need to extend it.
     */
    private void extendStorage() {
//        DynamicArray array = new DynamicArray(count++);
        //Ad es chem jokel inch piti anem
    }

    public static void staticMethod() {
        System.out.println("In static method!");
    }

}
