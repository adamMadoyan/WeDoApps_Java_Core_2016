//package myHomeworks;
//
///**
// * Created by Arthur on 10.11.2016.
// */
//public class myBest {
//}
//
//
//
//
//interface DinamicArray<T> {
//
//
//    //  why this  is not pussible        T [] storage = new T [DEFAULT_CAPACITY];
//    int size();
//
//    boolean isEmpty();
//
//    boolean contains(T e);
//
//    int indexOf(T element);
//
//    T get(int index);
//
//    int set(int index, T element);
//
//    boolean add(T element);
//
//    void add(int index, T element);
//
//    T remove(int index);
//
//
//    void extendStorage();
//
//}
//
//class DinamicArrayImpl<T> implements DinamicArray<T> {
//
//    int chg = 66;
//    private int count;
//    int DEFAULT_CAPACITY = 16;
//    Object [] storage = new  Object[DEFAULT_CAPACITY];
//
//    public int size() {
//        return count;
//
//    }
//
//    public boolean isEmpty() {
//        return count == 0;
//
//    }
//
//    public boolean contains(T e) {
//        for (int i = 0; i < storage.length; i++) {
//            if (storage[i] == e) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public int indexOf(T element) {
//        for (int i = 0; i < count; i++) {
//            if (storage[i] == element) {
//                return i;
//            }
//        }
//        return -1;
//
//    }
//
//    public T get(int index) {
//        if (index >= count) {
//            return -1;
//        }
//        return storage[index];
//    }
//
//    public int set(int index, T element) {
//
//        int u = storage[index];
//        storage[index] = element;
//        return u;
//    }
//
//    public boolean add(T element) {
//        if (count == storage.length) {
//            extendStorage();
//        }
//        storage[count++] = element;
//        return true;
//    }
//
//    void add(int index, T element) {
//        if (index < count && index >= 0) {
//            if (count == storage.length) {
//                extendStorage();
//            }
//            for (int i = count; i > index; i--) {
//                storage[i] = storage[i - 1];
//            }
//            storage[index] = element;
//        }
//    }
//
//    public T remove(int index) {
//// TODO please Artur jan check index value
//        if (index < 0 || index >= count) return -1;
//        int r = storage[index];
//        for (int i = index; i < count; i++) {
//            storage[i] = storage[i + 1];
//        }
//        return r;
//    }
//
//    public void extendStorage() {
//
//        int[] ss = new int[(storage.length * 3 / 2) + 1];
//        for (int i = 0; i < storage.length; i++) {
//            extendStorage[i] = storage[i];
//        }
//        storage = extendStorage;
//    }
//
//    public void printArray() {
//        for (int i = 0; i < count; i++) {
//            System.out.print(s[i]);
//        }
//        System.out.println();
//        System.out.println(count);
//    }
//
//}
//
//
//
//
