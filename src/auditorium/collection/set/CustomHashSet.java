package auditorium.collection.set;

import java.util.Collection;
import java.util.LinkedList;

public class CustomHashSet<E> implements CustomSet<E> {

    private static final int DEFAULT_CAPACITY = 100;

    private LinkedList<E>[] buckets;

    private int size;

    public CustomHashSet() {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public CustomHashSet(int capacity) {
//        TODO add validation on capacity value
        this.size = 0;
        buckets = (LinkedList<E>[])new LinkedList[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(E element) {
        int position = element.hashCode() % buckets.length;
        LinkedList<E> bucket = buckets[position];
        if (bucket == null) {
            return false;
        }
        return bucket.contains(element);
    }

    @Override
    public boolean add(E e) {
        int position = e.hashCode() % buckets.length;
        LinkedList<E> bucket = buckets[position];
        if (bucket == null) {
            buckets[position] = new LinkedList<>();
            bucket = buckets[position];
        }
        if (bucket.contains(e)) {
            return false;
        }
        bucket.add(e);
        size++;
        return true;
    }

    @Override
    public boolean remove(E o) {
        int position = o.hashCode() % buckets.length;
        LinkedList<E> bucket = buckets[position];
        boolean isRemoved = bucket.remove(o);
        if (isRemoved) {
            size--;
        }
        return isRemoved;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @SuppressWarnings("unchecked")
    public void clear() {
        this.size = 0;
        buckets = (LinkedList<E>[])new LinkedList[buckets.length];
    }
}
