package auditorium.lesson6;


public interface Stack <T> {

    int DEFAULT_CAPACITY = 16;

    /**
     * Pushes an item onto the top of this stack.
     *
     * @param item the item to be pushed onto this stack.
     */
    void push(T item);

    T pop();

    T peek();

    boolean isEmpty();

}
