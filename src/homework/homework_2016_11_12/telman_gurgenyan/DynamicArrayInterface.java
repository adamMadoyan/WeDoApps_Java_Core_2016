package X_DynamicArray_Test;

import java.util.Objects;

public interface DynamicArrayInterface<T> {
    int DEFAULT_CAPACITY = 16;

    int size();
    boolean isEmpty();
    boolean contains(T e);
    int indexOf(T element);
    T get(int index);
    T set(int index, Objects element);
    boolean add(T element);
    void add(int index, T element);
    T remove(int index);


}
