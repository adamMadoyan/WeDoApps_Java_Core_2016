package auditorium.lesson8.io;

import auditorium.lesson8.io.model.Address;
import auditorium.lesson8.io.model.Student;

import java.io.*;

/**
 * Class description.
 *
 * @author Adam Madoyan
 */
public class ObjectStreamDemo {

    public static void main(String[] args) {
        String filePath = "/home/adam/Desktop/student.txt";

        writeObjectDemo(filePath);
        readObjectDemo(filePath);
    }

    private static void writeObjectDemo(String path) {
        Address address = new Address("Armenia", "Gyumri", "Ghorghanyan", "house 5/14");
        Student student = new Student("Varuzhan", "Simonyan", 20, "+37477000000", address);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(path))) {

            outputStream.writeObject(student);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void readObjectDemo(String path) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(path))) {

            Student student = (Student) inputStream.readObject();

            System.out.println(student);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}



