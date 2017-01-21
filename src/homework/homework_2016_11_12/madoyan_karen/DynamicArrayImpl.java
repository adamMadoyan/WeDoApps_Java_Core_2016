package homework.homework_2016_11_12.madoyan_karen;


/**
 * Created by karen on 11/12/16.
 */
public class DynamicArrayImpl<T> implements IDynamicArray<T> {

    private Object[] storage;
    private int count;

    public DynamicArrayImpl() {
        this(DEFAULT_CAPACITY);
    }

    public DynamicArrayImpl(int capacity) {
        storage = new Object[capacity];
        count = 0;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public boolean contains(T element) {
        for (int i = 0; i < count; i++) {
            if (storage[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(T element) {
        int tmp = -1;
        for (int i = 0; i < count; i++) {
            if (storage[i].equals(element)) {
                return i;
            }
        }
        return tmp;
    }

    @Override
    public T get(int index) {
        // index  = -456879521;BUG
        if (index < count) {
            return (T) storage[index];
        }
        return null;
    }

    @Override
    public T set(int index, T element) {
        if (index < count) {
            T tmp = (T) storage[index];
            storage[index] = element;
            return tmp;
        }
        return null;
    }

    @Override
    public void add(T element) {
        if (count >= storage.length) {
            extendStorage();
        }
        storage[count++] = element;
    }

    @Override
    public void add(int index, T element) {
        if (index >= count) {
            extendStorage();
        }
        for (int i = count; i > index; i--) {
            storage[i] = storage[i - 1];
        }
        storage[index] = element;
        count++;
    }

    @Override
    public T remove(int index) {
        T tmp = null;
        if (index < count) {
            tmp = (T) storage[index];
            for (; index < count - 1; index++) {
                storage[index] = storage[index + 1];
            }
            count--;
        }
        return tmp;
    }

    public void extendStorage() {
        Object[] array = new Object[count * 3 / 2 + 1];
        for (int i = 0; i < count; i++) {
            array[i] = storage[i];
        }
        storage = array;
    }
}
