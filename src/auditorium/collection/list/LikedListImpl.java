package auditorium.collection.list;

import java.util.NoSuchElementException;


public class LikedListImpl<T> implements LinkedList<T> {

    private Link<T> first;

    public LikedListImpl() {
        first = null;
    }

    /**
     * (Non java doc)
     *
     * @see LinkedList#getFirst()
     */
    @Override
    public T getFirst() throws NoSuchElementException {
        if (first == null) {
            throw new NoSuchElementException();
        }
        return first.data;
    }

    @Override
    public T removeFirst() throws NoSuchElementException {
        if (first == null) {
            throw new NoSuchElementException();
        }
        T tmp = first.data;
        first = first.next;
        return tmp;
    }

    @Override
    public void addFirst(T obj) {
        Link<T> newItem = new Link<T>();
        newItem.data = obj;
        newItem.next = first;
        first = newItem;
    }

    @Override
    public ListIterator listIterator() {
        return new Iterator();
    }

    private static class Link<T> {
        private T data;
        private Link<T> next;
    }

    private class Iterator implements ListIterator<T> {

        private Link<T> position;
        private Link<T> previous;

        public Iterator() {
            position = null;
            previous = null;
        }

        @Override
        public T next() throws NoSuchElementException {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            if (position == null) {
                position = first;
            } else {
                previous = position;
                position = position.next;
            }
            return position.data;
        }

        @Override
        public boolean hasNext() {
            if (position != null) {
                return position.next != null;
            }
            return first != null;
        }

        @Override
        public void add(T obj) {
            if (position == null) {
                addFirst(obj);
                position = first;
            } else {
                Link<T> newItem = new Link<T>();
                newItem.data = obj;
                newItem.next = position.next;
                position.next = newItem;
                position = position.next;
            }
            previous = position;
        }

        @Override
        public void remove() throws IllegalStateException, NoSuchElementException {
            if (position == null) {
                throw new NoSuchElementException();
            }
            if (previous == position) {
                throw new IllegalStateException();
            }
            if (position == first) {
                removeFirst();
            } else {
                previous.next = position.next;
            }
            position = previous;
        }

        @Override
        public void set(T obj) throws NoSuchElementException {
            if (position == null) {
                throw new NoSuchElementException();
            }
            position.data = obj;
        }
    }

}