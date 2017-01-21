package homework_16_11_26.homework_19_11_2016;

public interface IDynamicArray<T> {
    int DEFAULT_CAPACITY = 16;

    int size();
    boolean isEmpty();
    boolean contains(T e);
    int indexOf(T element);
    T get(int index);
    T set(int index, T element);
    void add(T element);
    void add(int index, T element);
    T remove(int index);
}
