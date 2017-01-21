package homework.homework_2016_11_12.madoyan_karen;


public interface IDynamicArray<T> {

    int DEFAULT_CAPACITY = 16;

    /**
     * Returns the number of elements in this list.  If this list contains
     * more than <tt>Integer.MAX_VALUE</tt> elements, returns
     * <tt>Integer.MAX_VALUE</tt>.
     *
     * @return the number of elements in this list
     */
    int size();

    /**
     * @return true when list is empty otherwise false
     */
    boolean isEmpty();

    boolean contains(T element);

    int indexOf(T element);

    T get(int index);

    T set(int index, T element);

    void add(T element);

    void add(int index, T element);

    T remove(int index);
}
