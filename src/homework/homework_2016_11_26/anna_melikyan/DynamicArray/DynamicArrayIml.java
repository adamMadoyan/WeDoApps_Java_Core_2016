package homework.homework_2016_11_26.anna_melikyan.DynamicArray;


/**
 * Created by Anna on 09.11.2016.
 */
public class DynamicArrayIml<T> implements DynamicArray<T> {

    private Object[] storage;
    private int size;

    public DynamicArrayIml() {
        storage = new Object[DynamicArray.DEFAULT_CAPACITY];
    }

    public DynamicArrayIml(int capacity) {
         storage = new Object[capacity];
          size = 0;
        if (size < 0) throw  new NegativeArraySizeException();

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public boolean contains(T e) {
        for (int i = 0; i < size; i++)
            if (storage[i] == e) {
                return true;
            }
        return false;
    }

    @Override
    public int indexOf(T element) {
        for (int i = 0; i < size; i++) {
            if (storage[i] == element) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public T get(int index) {
        if(index > size || index < 0)   throw new ArrayIndexOutOfBoundsException();


        if (index<size){
            return (T) storage[index];
        }
        return null;
    }



    @Override
    public T set(int index, T element) {


            if(index > size || index < 0)   throw new ArrayIndexOutOfBoundsException();



        T ar = (T) storage[index];
        if (index < size) {
            storage[index] = element;
            return (T) ar;
        }
        return null;
    }


    @Override
    public boolean add(T element) {

        if (size > DEFAULT_CAPACITY) {
            extendStorage();
        }
            storage[size++] = element;


        return true;

    }



    @Override
    public void add(int index, T element) {
            int i;
            if (size > DEFAULT_CAPACITY) {
                extendStorage();
            }
            T el =(T) storage[index+1];

             for (i = size-1; i > index+2; i--) {
                storage[i+1] = storage[i];
                i--;
            }
        storage[index] = element;
    }

    @Override
    public T remove(int index) {
        for (int i = size - 1; i > index; i--) {
            T ar = (T) storage[index];
            storage[i] = storage[i + 1];
            size--;
            return ar;
        }
        return  null;
    }

    private void extendStorage() {
        int count = storage.length - 1;
        int[] array = new int[count * 3 / 2 + 1];
        if (count > DEFAULT_CAPACITY) {
            System.arraycopy(storage, 0, array, 0, array.length - 1);
        }
    }

}
class MyException extends Exception {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
