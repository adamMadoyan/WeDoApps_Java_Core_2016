package java.homework_2016_11_12;

public interface DynamicArray<T> {

    int size();

    boolean isEmpty();

    boolean contains(T val);

    int indexOf(T element);

    T get(int index);

    T set(int index, T element);

    void add(T element);

    void add(int index, T element);

    int remove(int index);


}
