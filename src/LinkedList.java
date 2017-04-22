import java.util.NoSuchElementException;


public class LinkedList {

    private Link first;
    private Link last;

    public void addFirst(int value) {
        boolean isFistElement = false;
        if (first == null) {
            isFistElement = true;
        }
        Link newItem = new Link();
        newItem.value = value;
        newItem.next = first;
        first = newItem;
        if (isFistElement) {
            last = first;
        } else {
            first.previous = newItem;
        }

    }

    public int removeFirst() throws NoSuchElementException {
        if (first == null) {
            throw new NoSuchElementException();
        }
        int tmp = first.value;
        first = first.next;
        if (first != null) {
            first.previous = null;
        }
        return tmp;
    }

    public void addLast(int value) {
        if (first == null) {
            addFirst(value);
        } else {
            Link newItem = new Link();
            newItem.value = value;
            last.next = newItem;
            newItem.previous = last;
            last = newItem;
        }
    }


    void removeLatest() {
        if (first == last) {
            removeFirst();
        }
        last = last.previous;
        last.next = null;
    }

    void removeLessThen(int value) {
        ListIterator iterator = listIterator();
        while (iterator.hasNext()) {
            int val = iterator.next();
            if (val <= value) {
                iterator.remove();
            }
        }
    }

    void add(int value) {
        addLast(value);
    }

    private static class Link {
        private int value;
        private Link next;
        private Link previous;
    }


    public ListIterator listIterator() {
        return new ListIterator();
    }

    public class ListIterator {

        private Link position;
        private Link previous;

        public ListIterator() {
            position = null;
            previous = null;
        }

        public int next() throws NoSuchElementException {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            if (position == null) {
                position = first;
            } else {
                previous = position;
                position = position.next;
            }
            return position.value;
        }

        public boolean hasNext() {
            if (position != null) {
                return position.next != null;
            }
            return first != null;
        }

        public void add(int obj) {
            if (position == null) {
                addFirst(obj);
                position = first;
            } else {
                Link newItem = new Link();
                newItem.value = obj;
                newItem.next = position.next;
                position.next = newItem;
                position = position.next;
            }
            previous = position;
        }

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

        public void set(int obj) throws NoSuchElementException {
            if (position == null) {
                throw new NoSuchElementException();
            }
            position.value = obj;
        }
    }

}
