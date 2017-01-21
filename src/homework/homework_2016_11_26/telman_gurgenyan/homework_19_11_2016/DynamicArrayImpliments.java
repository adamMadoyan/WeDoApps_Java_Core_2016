package homework_16_11_26.homework_19_11_2016;

import java.util.Objects;

public class DynamicArrayImpliments<T> implements IDynamicArray<T> {
    private Objects[] storege;
    private int count;


    public DynamicArrayImpliments() {
        storege = new Objects[DEFAULT_CAPACITY];
    }

    public DynamicArrayImpliments(int capasity) {
        storege = new Objects[capasity];
        count = 0;
    }


    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        if (count > -1) {
            return false;
        }
        return true;
    }

    @Override
    public boolean contains(T e) {
        for (int i = 0; i < count; i++) {

            if (storege[i] == e) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(T element) {
        for (int i = 0; i < count; i++) {
            if (storege[i] == element) {
                break;
            }
            return i;
        }
        return -1;
    }

    @Override
    public T get(int index) {
        return (T) storege[index];
    }

    @Override
    public T set(int index, T element) {

        T ret = null;
        ret = (T) storege[index];
        storege[index] = (Objects) element;
        return ret;
    }

    @Override
    public void add(T element) {
        if (count >= storege.length) {
            extendStorage();
        }
        try {
            storege[count++] = (Objects) element;
        } catch (Exception e) {
            System.out.println("Exception Array---- " + e);
        }
    }


    @Override
    public void add(int index, T element) {
        if (count == storege.length) {
            extendStorage();
        }
        for (int i = count; i > index; i--) {
            storege[i] = storege[i - 1];
        }
        storege[index] = (Objects) element;
        count++;
    }

    @Override
    public T remove(int index) {

        T indRet = null;
        if (count > -1) {
            try {
                indRet = (T) storege[index];
            } catch (Exception x) {
                System.out.println("Excepton ----" + x);
            }
            for (int i = index; i < count; i++) {
                storege[i] = storege[i + 1];
            }
            count--;
        }

        return indRet;
    }

    private void extendStorage() {
        Objects[] newstorage = new Objects[storege.length + storege.length * 2 / 3 + 1];
        System.arraycopy(storege, 0, newstorage, 0, count);
        storege = newstorage;
    }
}
