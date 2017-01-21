package homework.homework_2016_10_01.artur_khachatryan;


public class DynamicArray {

    public static final int DEFAULT_CAPACITY = 16;


    public int[] s;
    private int count;

    public DynamicArray() {
        this(DEFAULT_CAPACITY);
    }


    public DynamicArray(int capacity) {
        s = new int[capacity];
        count = 0;
    }


    /**
     * Returns the number of elements in this DynamicArray.
     *
     * @return the number of elements in this DynamicArray
     */


    int size() {
        return count;
    }


    /**
     * Returns <tt>true</tt> if this DynamicArray contains no elements.
     *
     * @return <tt>true</tt> if this DynamicArray contains no elements
     */


    boolean isEmpty() {
        return count == 0;
    }

    /**
     * Returns <tt>true</tt> if this DynamicArray contains the specified element.
     * <p>
     * More formally, returns <tt>true</tt> if and only if this DynamicArray contains
     * <p>
     * at least one element <tt>e</tt>
     *
     * @param e element whose presence in this DynamicArray is to be tested
     * @return <tt>true</tt> if this DynamicArray contains the specified element
     */

    boolean contains(int e) {
        for (int i = 0; i < s.length; i++) {
            if (s[i] == e) {
                return true;
            }
        }
        return false;
    }


    /**
     * Returns the index of the I occurrence of the specified element
     * <p>
     * in this DynamicArray, or -1 if this DynamicArray does not contain the element.
     */
    int indexOf(int element) {
        for (int i = 0; i < count; i++) {
            if (s[i] == element) {
                return i;
            }
        }
        return -1;
    }


    /**
     * Returns the element at the specified position in this DynamicArray.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this DynamicArray
     */

    int get(int index) {
        if (index >= count) {
            return -1;
        }
        return s[index];
    }


    /**
     * Replaces the element at the specified position in this DynamicArray with
     * <p>
     * the specified element.
     *
     * @param index   index of the element to replace
     * @param element element to be stored at the specified position
     * @return the element previously at the specified position
     */

    int set(int index, int element) {
//        TODO check, index can not be more than count
        int u = s[index];
        s[index] = element;
        return u;
    }


    /**
     * Appends the specified element to the end of this DynamicArray.
     *
     * @param element element to be appended to this DynamicArray
     * @return <tt>true</tt>
     */
    boolean add(int element) {
        if (count == s.length) {
            extendStorage();
        }
        s[count++] = element;
        return true;
    }


    /**
     * Inserts the specified element at the specified position in this
     * <p>
     * DynamicArray. Shifts the element currently at that position (if any) and
     * <p>
     * any subsequent elements to the right (adds one to their indices).
     *
     * @param index   index at which the specified element is to be inserted
     * @param element element to be inserted
     */


    void add(int index, int element) {
        if (index < count && index >= 0) {
            if (count == s.length) {
                extendStorage();
            }
            for (int i = count; i > index; i--) {
                s[i] = s[i - 1];
            }
            s[index] = element;
        }
    }


    /**
     * Removes the element at the specified position in this DynamicArray.
     * <p>
     * Shifts any subsequent elements to the left (subtracts one from their
     * <p>
     * indices).
     *
     * @param index the index of the element to be removed
     * @return the element that was removed from the DynamicArray
     */

    int remove(int index) {
// TODO please Artur jan check index value
        int r = s[index];
        for (int i = index; i < count; i++) {
            s[i] = s[i + 1];
        }
        return r;
    }


    /**
     * Method is invoked when storage is already full, and need to extend it.
     */

    private void extendStorage() {

        int[] ss = new int[(s.length * 3 / 2) + 1];
        for (int i = 0; i < s.length; i++) {
            ss[i] = s[i];
        }
        s = ss;
    }

    void printArray() {
        for (int i = 0; i < count; i++) {
            System.out.print(s[i]);
        }
        System.out.println();
        System.out.println(count);
    }


}
