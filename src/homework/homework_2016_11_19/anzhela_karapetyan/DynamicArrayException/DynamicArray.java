package DynamicArrayException;
import java.util.Arrays;




    public class DynamicArray <T> implements DynArr <T> {


        public  T [] storage;
        private int count;

        public DynamicArray() {
            this(DEFAULT_CAPACITY);
        }

        public DynamicArray(int capacity) {
            storage =  (T[]) new Object [capacity];
            count = 0;
        }


        public void add(T element){
            if(count == storage.length)extendStorage();
            storage[count]  =  (T) element;
            count++;
            System.out.println(Arrays.toString(storage));
        }


        public int size() {

            return count;
        }

        public   boolean isEmpty(){
            if(count == 0){
                return true;}
            else return false;
        }


        public  boolean contains(T e) {
            int a = 0;

            for (int i = 0; i < count; i++) {
                if (storage[i].equals(e)) {
                    a++;
                }
            }
            if(a != 0){
                return true;
            }
            else return false;
        }



        public int indexOf(T element) {
            int a = -1;
            for(int i = 0; i < count; i++){
                if(storage[i].equals(element)){
                    a = i;
                }
            }
            if(a != -1 ) {
                return a;
            }
            else return -1;
        }


        public  T get(int index) throws MyExceptions.WrongIndexExcepttion {


                  if ((index >= 0 && index < count)) {

                      return storage[index];
                  }

            throw new MyExceptions.WrongIndexExcepttion("Index must be greater or equal to 0 and less or equal to count");
        }


        public T set(int index, T element) throws MyExceptions.WrongIndexExcepttion {
            if (index >=0 && index <=count){
            T a =  storage[index];
            storage[index] = (T) element;
            return a;}
            throw new MyExceptions.WrongIndexExcepttion("Index must be greater or equal to 0 and less or equal to count");

        }





        public   void add(int index, T element) throws MyExceptions.WrongIndexExcepttion {
            if(count == storage.length) extendStorage();
            if (index >=0 && index <=count){
            for (int i = count + 1; i > index ; i-- ){
                storage[i] = storage[i - 1];}
            storage[index] = (T) element;
            count++;
            System.out.println(Arrays.toString(storage));}
            throw new MyExceptions.WrongIndexExcepttion("Index must be greater or equal to 0 and less or equal to count");
        }



        public T remove(int index) throws MyExceptions.WrongIndexExcepttion {
            if (index >=0 && index <=count){
            T a = storage[index];
            if (count != 0) {
                for (int i = index; i < count; i++) {
                    storage[i] = storage[i + 1];
                }
                count--;
            }
            return a;}
            throw new MyExceptions.WrongIndexExcepttion("Index must be greater or equal to 0 and less or equal to count");
        }



        private void extendStorage() {
            T storage1[] = (T[]) new Object[storage.length * 2];
            System.arraycopy(storage, 0 , storage1, 0, count);
            storage = storage1;

        }


    }





