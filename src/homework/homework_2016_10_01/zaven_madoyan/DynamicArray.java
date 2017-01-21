package homework.homework_2016_10_01.zaven_madoyan;


public class DynamicArray {

    public static final int DEFAULT_CAPACITY = 16;
    private int[] storage;
    private int size;

    public DynamicArray() {
        this(DEFAULT_CAPACITY);
    }


    public DynamicArray(int capacity) {
        storage = new int[capacity];
        size = 0;
    }


    int size() {

        return size;
    }

    boolean isEmpty(){
        return size == 0;
    }


    boolean contains(int e) {
        for (int i = 0; i < size; i++) {
            if (storage[i] == e){
                return true;}
        }
           return false;
    }


    int indexOf(int element) {
        for (int i = 0; i < size; i++) {
                if (storage[i] == element){
                    return i;
                }
        }
        return -1;
    }


    int get(int index) {
        if (index < size) return storage[index];
        return -1;
    }


    int set(int index, int element) {
        int a = -1;
        if (index < size){
            a = storage[index];
            storage[index] = element;
        }
        return -2;
    }

    void add(int element){
       if (size == storage.length){
           extendStorage();
        size ++;

            }
        }

    void add(int index, int element) {
        if (index >= storage.length - 1){
            extendStorage();
        }
            for (int i = size; i > index; i--) {
              storage[i] = storage[i-1];
                storage[index] = element;
            }
        size ++;
        }

    int remove(int index) {
        if (index >= storage.length){
            extendStorage();
        }
        int a = storage[index];
        for (int i = index; i < size; i++) {
            storage[i] = storage[i + 1];
        }
        size--;
        return a;
    }

    private void extendStorage() {
        int array[] = new int [2 * storage.length];
        for (int i = 0; i < size; i++) {
            array[i] = storage[i];        }
      storage = array;
    }


    void print(int a){
        System.out.println(a);
    }


    void print(boolean a){
        System.out.println(a);
    }


}
