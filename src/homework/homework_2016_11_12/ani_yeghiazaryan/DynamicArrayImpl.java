package java.homework_2016_11_12;


public class DynamicArrayImpl<T> implements DynamicArray<T>{

    public static final int DEFAULT_CAPACITY = 16;

    private Object[] storage;
    private int size;

    public DynamicArrayImpl() {
        this(DEFAULT_CAPACITY);
    }

    public DynamicArrayImpl(int capacity) {
        if (capacity < DEFAULT_CAPACITY)
            capacity = DEFAULT_CAPACITY;
        storage = new Object[capacity];
        size = 0;
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public boolean contains(T val) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == val){
                return true;
            }
        }return false;
    }


    @Override
    public int indexOf(T element) {
        for (int i = 0; i < size; i++) {
            if (storage[i] == element){
                return i;
            }
        }
        return -1;
    }


    @Override
    public T get(int index) {
        if (index >= size){
            return null;
        }
        return (T)storage[index];
    }


    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(T element) {
        if (size == storage.length){
            extendStorage();
        }
        storage[size++] = element;
    }

    @Override
    public void add(int index, T element) {
        if (index < size && index > -1) {


            if (size == storage.length) {
                extendStorage();
            }
            for (int i = size; i > index; i--) {
                storage[i] = storage[i - 1];
            }
            storage[index] = element;
            size++;
        }
    }

    @Override
    public int remove(int index) {
                for (int i = 0; i < size; i++) {
            if (i > index){
                storage[i-1] = storage[i];
            }
        }
        size--;
        return index;
    }

    private void extendStorage() {
        Object [] a = new Object[storage.length * 3/2 + 1];
        System.arraycopy(storage, 0, a, 0, storage.length - 1);
        storage = a;
    }


}
