package auditorium.lesson7;

import java.io.Closeable;

public class AutoCloseableDemo {

    public static void main(String[] args) {

        try (StreamDemo streamDemo = new StreamDemo()) {
            streamDemo.write("DINED");
        } catch (AccessDeniedException e) {
            e.printStackTrace();
        }
    }

}


class StreamDemo implements Closeable {

    private String stream;

    public StreamDemo() {
        stream = "Opened";
        System.out.println(stream);
    }

    void write(String key) throws AccessDeniedException {
        if (!"ALLOW".equalsIgnoreCase(key)) {
            throw new AccessDeniedException("Permission dined.");
        }
    }

    public String getStream() {
        return stream;
    }

    @Override
    public void close() {
        stream = "Closed";
        System.out.println(stream);
    }
}


class AccessDeniedException extends Exception {

    public AccessDeniedException(String message) {
        super(message);
    }
}