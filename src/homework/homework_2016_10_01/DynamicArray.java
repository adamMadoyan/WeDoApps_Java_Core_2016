package homework.homework_2016_10_01;


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


    /**
     * Returns the number of elements in this DynamicArray.
     *
     * @return the number of elements in this DynamicArray
     */
    int size() {
        return 0; // todo replace with correct code
    }

    /**
     * Returns <tt>true</tt> if this DynamicArray contains no elements.
     *
     * @return <tt>true</tt> if this DynamicArray contains no elements
     */
    boolean isEmpty() {
        return true; // todo replace with correct code
    }

    /**
     * Returns <tt>true</tt> if this DynamicArray contains the specified element.
     * More formally, returns <tt>true</tt> if and only if this DynamicArray contains
     * at least one element <tt>e</tt>
     *
     * @param e element whose presence in this DynamicArray is to be tested
     * @return <tt>true</tt> if this DynamicArray contains the specified element
     */
    boolean contains(int e) {
        return true; // todo replace with correct code
    }

    /**
     * Returns the index of the I occurrence of the specified element
     * in this DynamicArray, or -1 if this DynamicArray does not contain the element.
     */
    int indexOf(int element) {
        return 0; // todo replace with correct code
    }

    /**
     * Returns the element at the specified position in this DynamicArray.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this DynamicArray
     */
    int get(int index) {
        return 0; // todo replace with correct code
    }

    /**
     * Replaces the element at the specified position in this DynamicArray with
     * the specified element.
     *
     * @param index   index of the element to replace
     * @param element element to be stored at the specified position
     * @return the element previously at the specified position
     */
    int set(int index, int element) {
        return 0; // todo replace with correct code
    }

    /**
     * Appends the specified element to the end of this DynamicArray.
     *
     * @param element element to be appended to this DynamicArray
     * @return <tt>true</tt>
     */
    boolean add(int element) {
        // before adding element you must check length of storage, if storage is already full than call extendStorage() method
        return true; // todo replace with correct code
    }

    /**
     * Inserts the specified element at the specified position in this
     * DynamicArray. Shifts the element currently at that position (if any) and
     * any subsequent elements to the right (adds one to their indices).
     *
     * @param index   index at which the specified element is to be inserted
     * @param element element to be inserted
     */
    void add(int index, int element) {
        // before adding element you must check length of storage, if storage is already full than call extendStorage() method
        // todo implement
    }

    /**
     * Removes the element at the specified position in this DynamicArray.
     * Shifts any subsequent elements to the left (subtracts one from their
     * indices).
     *
     * @param index the index of the element to be removed
     * @return the element that was removed from the DynamicArray
     */
    int remove(int index) {
        return 0; // todo replace with correct code
    }


    /**
     * Method is invoked when storage is already full, and need to extend it.
     */
    private void extendStorage() {
        // todo implement
    }


}
