package quiz.rob_tadevosyan;


// TODO score 11
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
        return size;
    }

    /**
     * Returns <tt>true</tt> if this DynamicArray contains no elements.
     *
     * @return <tt>true</tt> if this DynamicArray contains no elements
     */
    boolean isEmpty() {
        return size == 0;
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
        for(int i = 0;i < size;i++){
            if(e == storage[i]){
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the index of the I occurrence of the specified element
     * in this DynamicArray, or -1 if this DynamicArray does not contain the element.
     */
    int indexOf(int element) {
        for(int i = 0;i < size;i++){
            if(element == storage[i]){
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
        return index < size && index > 0 ? storage[index]: -1 ;
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
//        TODO incorrect validation -0.5
        return index < size ? storage[index] = element : -1;
    }

    /**
     * Appends the specified element to the end of this DynamicArray.
     *
     * @param element element to be appended to this DynamicArray
     * @return <tt>true</tt>
     */
    void add(int element) {
        if(size == storage.length){
            extendStorage();
        }
        storage[size++] = element;
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
        if(size == storage.length){
            extendStorage();
        }
        if(index > 0 && index < size){
            for(int i = size; i >index ;i--){
                storage[i] = storage[i-1];
            }
            storage[index] = element;
            size++;
        }else{
            System.out.println("The array has not such index :"+" ' "+index+" ' ");
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
        if(index > 0 && index < size){
            int returnValue = storage[index];
            for(int i = index; i < size-1;i++){
                storage[i] = storage[i+1];
            }
            size--;
            return returnValue;
        }
        return -1;
    }


    /**
     * Method is invoked when storage is already full, and need to extend it.
     */
    private void extendStorage() {
//        TODO wrong calculation when storage length is 0 -0.5
        int [] extendedStorage = new int[storage.length * 3/2];
        for(int i = 0; i < size; i++){
            extendedStorage[i] = storage[i];
        }
        storage = extendedStorage;
    }


}
