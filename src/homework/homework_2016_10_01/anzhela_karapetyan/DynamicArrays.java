package homework.homework_2016_10_01.anzhela_karapetyan;

public class DynamicArrays {

    public static final int DEFAULT_CAPACITY = 16;

    public int[] storage;
    private int count;

    public DynamicArrays() {
        this(DEFAULT_CAPACITY);
    }

    public DynamicArrays(int capacity) {
        storage = new int[capacity];
        count = 0;
    }


    void extendStorage() {
        int newArray[] = new int[storage.length * 2];
        for (int i = 0; i < storage.length; i++) {
            newArray[i] = storage[i];
            storage = newArray;
        }


    }

    boolean add(int element) {
        if (count == storage.length) {
            extendStorage();
        }
        storage[count] = element;
        count++;

        return true;


    }

    int size() {
        return count;
    }


    boolean isEmpty() {
        if (count == 0) return true;
        else return false;
    }


    boolean contains(int e) {
        int a = 0;
        for (int i = 0; i < count; i++) {
            if (storage[i] == e) {
                a++;

            }
        }
        if (a != 0)
            return true;
        else return false;
    }

    int indexOf(int element) {
        int index = 0;
        int b = 0;
        int i;
        for (i = 0; i < count; i++) {
            if (storage[i] == element) {
                index = i;
                b++;

            }
        }
        if (b != 0) return index;
        else return -1;

    }


    int get(int index) {
        return storage[index];
    }

    int set(int index, int element) {
        int a = storage[index];
        storage[index] = element;
        return a;
    }


    void add(int index, int element) {
        if (count == 16) extendStorage();
        for (int i = count - 1; i >= index; i--) {
            storage[i + 1] = storage[i];
        }
        storage[index] = element;
        count++;
        for (int i = 0; i < storage.length; i++) {
            System.out.print(storage[i] + " ");
        }

    }

    int remove(int index) {
        int a = storage[index];
        for (int i = index; i < count; i++) {
            storage[i] = storage[i + 1];
        }
        count--;
        return a;
    }


}
