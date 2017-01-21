package attachment;


public class Stack {

    public static void main(String args[]) {

        Stack disc = new Stack(1);
        System.out.println(disc.tos);
        disc.push(5);
        System.out.println(disc.tos);
        disc.pop();
        disc.pop();
        disc.pop();
        disc.push(5);
        disc.push(5);
        disc.push(5);
        disc.push(5);
        disc.push(5);
        disc.push(5);
        disc.pop();
        disc.pop();
        disc.pop();
        System.out.println(disc.pop());
        System.out.println(disc.tos);
    }

    public static final int DEFAULT_CAPACITY = 16;

    private int[] storage;

    private int tos;

    public Stack() {
        this(DEFAULT_CAPACITY);
    }

    public Stack(int capacity) {
        this.storage = new int[capacity];
        this.tos = -1;
    }

    public void push(int value) {
        int length = storage.length;
        if (tos >= length - 1) {
            extendStorage();
        }
        storage[++tos] = value;
        // this is mean that it must be checked
        // if tos == storage.length -1 then must be called a method for instance "extendStorage()"
        // in the mentioned method You must create new int[] fill in content of storage field,
        // and then assign the new array reference to the storage field.
    }

    public int pop() {

        return tos < 0 ? -1 : storage[tos--];
    }

    private void extendStorage() {
        int length = storage.length;
        int newLength = (length * 3) / 2 + 1;
        int[] newStorage = new int[newLength];
        for (int i = 0; i < length; i++) {
            newStorage[i] = storage[i];
        }
        storage = newStorage;
    }

    public int showEndElemnt(){
        return storage[tos];
    }

    public boolean isEmpty(){
        if (tos >= 0) {
            return false;
        }
        return true;
    }
}
