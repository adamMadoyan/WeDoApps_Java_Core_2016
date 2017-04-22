package auditorium.collection.list;

import java.util.NoSuchElementException;

public interface LinkedList<T> {

    /**
     * Returns the first element in the linked list.
     *
     * @return the first element in the linked list
     */
    T getFirst() throws NoSuchElementException;

    /**
     * Removes the first element in the linked list.
     *
     * @return the removed element
     */
    T removeFirst() throws NoSuchElementException;

    /**
     * Adds an element to the front of the linked list.
     */
    void addFirst(T obj);

    /**
     * Returns an iterator for iterating through this list.
     *
     * @return an iterator for iterating through this list
     */
    ListIterator listIterator();

}
