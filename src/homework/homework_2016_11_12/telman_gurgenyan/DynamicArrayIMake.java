package X_DynamicArray_Test;

import java.util.Objects;


public class DynamicArrayIMake<T> implements DynamicArrayInterface<T> {

    private Objects [] storege;
    private int count;


    public DynamicArrayIMake(){
        this(DynamicArrayInterface.DEFAULT_CAPACITY);
    }

    public DynamicArrayIMake(int capasity){
     storege = new Objects[capasity];
     count = 0;
    }



    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        if(count > -1){
            return false;
        }
        return true;
    }

    @Override
    public boolean contains(T e) {
        for(int i = 0; i<count; i++){

            if(storege[i] == e){
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(T element) {
        for (int i = 0; i <count; i++){
            if(storege[i]== element){
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
    public T set(int index, Objects element) {
        T ret = (T) storege[index];
        storege[index] = element;
        return ret;
    }

    @Override
    public boolean add(T element) {
        if(storege.length == count){
            extendStorage();
        }
        storege[count]= (Objects) element;
        count++;

        return true;
    }

    @Override
    public void add(int index, T element) {
        if(count == storege.length){
            extendStorage();
        }
        for(int i = count; i > index; i--){
            storege[i] = storege[i-1];
        }
        storege[index]= (Objects) element;
        count++;
    }

    @Override
    public T remove(int index) {
        T indRet = null;
        if(count>-1) {
            indRet = (T) storege[index];
            for (int i = index; i<count; i++){
                storege[i] = storege[i+1];
            }
            count--;
        }

        return indRet;
    }

    private void extendStorage() {
         Objects [] newstorage = new Objects [storege.length + storege.length * 2/3+1];
          System.arraycopy(storege,0,newstorage,0,count);
         storege = newstorage;
    }
}
