package DynamicArrayException;


    public class MyExceptions {
        public static class WrongIndexExcepttion extends Exception {
            public WrongIndexExcepttion(String message) {
                super(message);
            }

            public WrongIndexExcepttion(String message, Throwable cause) {
                super(message, cause);
            }

            public WrongIndexExcepttion(Throwable cause) {
                super(cause);
            }

            public WrongIndexExcepttion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
                super(message, cause, enableSuppression, writableStackTrace);


            }
        }
        public static class EmptyArrayExcepttion extends Exception {
            public EmptyArrayExcepttion(String message) {
                super(message);
            }

            public EmptyArrayExcepttion(String message, Throwable cause) {
                super(message, cause);
            }

            public EmptyArrayExcepttion(Throwable cause) {
                super(cause);
            }

            public EmptyArrayExcepttion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
                super(message, cause, enableSuppression, writableStackTrace);


            }
        }

    }


