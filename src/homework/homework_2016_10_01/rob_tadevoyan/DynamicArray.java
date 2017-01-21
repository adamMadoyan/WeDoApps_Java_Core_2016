package homework.homework_2016_10_01.rob_tadevoyan;

/**
 * Created by Robert on 27.09.2016.
 */
public class DynamicArray {

        public static final int DEFAULT_CAPACITY = 16;
        public static  int lenghtOfArray = DEFAULT_CAPACITY;

        private static int[] storage;
        private int count;

        public DynamicArray() {
            this(DEFAULT_CAPACITY);
        }

        public DynamicArray(int capacity) {
            storage = new int[capacity];
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
//
//        /**
//         * Returns <tt>true</tt> if this DynamicArray contains no elements.
//         *
//         * @return <tt>true</tt> if this DynamicArray contains no elements
//         */
        boolean isEmpty(){
            return count == 0;
        }
//
//        /**
//         * Returns <tt>true</tt> if this DynamicArray contains the specified element.
//         * More formally, returns <tt>true</tt> if and only if this DynamicArray contains
//         * at least one element <tt>e</tt>
//         *
//         * @param e element whose presence in this DynamicArray is to be tested
//         * @return <tt>true</tt> if this DynamicArray contains the specified element
//         */
        boolean contains(int e) {
            for(int i = 0;i <  count; ++i){
                if(e == storage[i]){
                   return true;
                }
            }
            return false;
        }
//
//        /**
//         * Returns the index of the I occurrence of the specified element
//         * in this DynamicArray, or -1 if this DynamicArray does not contain the element.
//         */
        int indexOf(int element) {
             int elementIndex = -1;
            for(int i = 0;i < count; ++i){
                if(element == storage[i]){
                    elementIndex = i;
                    break;
                }
            }
            return elementIndex;
        }
//
//        /**
//         * Returns the element at the specified position in this DynamicArray.
//         *
//         * @param index index of the element to return
//         * @return the element at the specified position in this DynamicArray
//         */
        int get(int index) {
            if(index < count){
                return storage[index];
            }else{
                System.out.println("The array does not contain any object at this index");
            }
            return 0;
        }
//
//        /**
//         * Replaces the element at the specified position in this DynamicArray with
//         * the specified element.
//         *
//         * @param index   index of the element to replace
//         * @param element element to be stored at the specified position
//         * @return the element previously at the specified position
//         */
       public  int set(int index, int element) {
           int currentObject = 0;
            if(index < count){
               currentObject = storage[index];
                storage[index ] = element;
            }else{
                System.out.println("The array does not contain any object at this index");
            }
            return currentObject; // todo replace with correct code
        }
//
//        /**
//         * Appends the specified element to the end of this DynamicArray.
//         *
//         * @param element element to be appended to this DynamicArray
//         * @return <tt>true</tt>
//         */
         boolean  add(int element){
         if(count == storage.length){
             extendStorage();
         }
         storage[count] = element;
             count++;
             return true;
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
            if (index < count) {
                count++;
                int[] newArray = new int[storage.length];
                newArray[count] = element;
                for (int i = 0; i < index; i++) {
                    newArray[i] = storage[i];
                }
                for (int i = count; i > index; i--) {
                    newArray[i] = storage[i - 1];
                }
                newArray[index] = element;
                storage = newArray;
            }else{
                System.out.println("The array does not contain any object at this index");
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
            if (index < count) {
                for(int i = index;i < count; i++){
                    storage[i] = storage[i+1];
                }
                count--;
            }else{
                System.out.println("The array does not contain any object at this index");
            }
            return 0;
        }

        /**
         * Method is invoked when storage is already full, and need to extend it.
         */
        private  void extendStorage() {
            int [] newArray = new int[storage.length+storage.length];
            for(int i = 0; i < storage.length;++i){
                newArray[i] = storage[i];
            }
            storage = newArray;
        }

        public void printDynamicArrayElements(){
            for(int i = 0;i < count; i++){
                System.out.println(storage[i]);
            }
        }

    @Override
    public String toString() {
        return "DynamicArray{" +
                "count=" + count +
                '}';
    }
}
