package homework.homework_2016_11_19.artur_khachatryan;

/**
 * Created by Arthur on 18.11.2016.
 */
public class DynamicArraywithTryCatch {
    public static final int DEFAULT_CAPACITY = 16;

    private int[] storage;
    private int count;

    public DynamicArraywithTryCatch() {

        this(DEFAULT_CAPACITY);
    }

    public DynamicArraywithTryCatch(int capacity) {
        try {
            storage = new int[capacity];
        } catch (NegativeArraySizeException exc) {


        }

        count = 0;
    }


    /**
     * Returns the number of elements in this DynamicArray.
     *
     * @return the number of elements in this DynamicArray
     */
    int size() {
        return count; // todo replace with correct code
    }

    /**
     * Returns <tt>true</tt> if this DynamicArray contains no elements.
     *
     * @return <tt>true</tt> if this DynamicArray contains no elements
     */
    boolean isEmpty() {
        return count == 0;
        // todo replace with correct code
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
        for (int i = 0; i < count; i++) {
            if (storage[i] == e) {
                return true;
            }
        }

        return false; // todo replace with correct code
    }

    /**
     * Returns the index of the I occurrence of the specified element
     * in this DynamicArray, or -1 if this DynamicArray does not contain the element.
     */
    int indexOf(int element) {
        for (int i = 0; i < count; i++) {
            if (storage[i] == element) {
                return i;
            }
        }
        return -1; // todo replace with correct code
    }

    /**
     * Returns the element at the specified position in this DynamicArray.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this DynamicArray
     */
    int get(int index) {

        try {
            if (index >= count) throw new Exception();
            return storage[index];

        } catch (NegativeArraySizeException exc) {


        } catch (Exception exc) {

        }
// ??????
        return 0;

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
        try {
            if (index >= count) throw new Exception();
            int u = storage[index];


        } catch (NegativeArraySizeException exc) {
            System.out.println("hey you stupid boy what are you doing");

        } catch (Exception exc) {
            System.out.println("there is not " + index + " th element, there is only " + (count) + " elements");
        }

        storage[index] = element;

        return 0;


    }

    /**
     * Appends the specified element to the end of this DynamicArray.
     *
     * @param element element to be appended to this DynamicArray
     * @return <tt>true</tt>
     */
    boolean add(int element) {
        // before adding element you must check length of storage, if storage is already full than call extendStorage() method

        if (count == storage.length) {
            extendStorage();
        }
        storage[count++] = element;
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
        if (count == storage.length) {
            extendStorage();
        }
        if (index >= 0 && index < count){
            for (int i = count; i > index; i--) {
                storage[i] = storage[i - 1];
                storage[index] = element;
            }
        }
        try {
            throw new Exception();
        } catch (NegativeArraySizeException exc) {
            System.out.println("hhhh");
        } catch (Exception exc) {
            System.out.println("llllll");
        }
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
        try {
            if (index >= count) {
                throw new Exception();
//                for (int i = index; i < count; i++) {
//                    storage[i] = storage[i + 1];
//                }
            }
            int r = storage[index];
        } catch (NegativeArraySizeException exc) {

        } catch (Exception exc) {

        }

        return 0;
        // todo replace with correct code
    }


    /**
     * Method is invoked when storage is already full, and need to extend it.
     */
    private void extendStorage() {
        int[] extended = new int[(storage.length * 3 / 2) + 1];
        for (int i = 0; i < storage.length; i++) {
            extended[i] = storage[i];
        }
        storage = extended;
        // todo implement
    }


}
