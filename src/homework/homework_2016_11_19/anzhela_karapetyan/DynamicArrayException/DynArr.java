package DynamicArrayException;



    public interface DynArr  <T>  {
        public static final int DEFAULT_CAPACITY = 16;
        int size();
        boolean isEmpty();
        boolean contains(T e);
        int indexOf(T element);
        T get(int index) throws MyExceptions.WrongIndexExcepttion;

        T set(int index, T element) throws MyExceptions.WrongIndexExcepttion;
        void add(T element);
        void add(int index, T element) throws MyExceptions.WrongIndexExcepttion;
        T remove(int index) throws MyExceptions.WrongIndexExcepttion;




    }





