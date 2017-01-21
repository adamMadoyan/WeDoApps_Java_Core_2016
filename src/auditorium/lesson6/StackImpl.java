package auditorium.lesson6;


import java.security.InvalidParameterException;

public class StackImpl<T> implements Stack<T> {

    private Object [] storage;

    private int tos;

    public StackImpl() {
        this(DEFAULT_CAPACITY);
    }

    public StackImpl(int capacity) {
//        if (capacity < 0) {
//            throw new InvalidParameterException("Capacity can not be negative." + capacity);
//        }
        try {
            storage = new Object[capacity];
        } catch (NegativeArraySizeException e) {
            throw e;
        }
        tos = -1;
    }

    @Override
    public void push(T item) {
        storage[++tos] = item;
    }

    @Override
    public T pop() {
        return (T) storage[tos--];
    }

    @Override
    public T peek() {
        return (T) storage[tos];
    }

    @Override
    public boolean isEmpty() {
        return tos == -1;
    }

}
