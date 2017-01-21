package auditorium.lesson8.io;

import java.io.*;

public class ReaderDemo {

    public static void main(String[] args) {

        String path = File.separator + "home"
                + File.separator + "adam"
                + File.separator + "Desktop"
                + File.separator + "bla.txt";

        writeText(path, "Բարև Հայաստան :Ճ. \nHow are you?");

        String text = readText(path);

        System.out.println(text);


    }

    private static String readText(String path) {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String s;
            while ((s = reader.readLine()) != null) {
                builder.append(s + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.substring(0, builder.length() - 1);
    }

    private static void writeText(String path, String text) {
        try (Writer writer = new BufferedWriter(new FileWriter(path), 1024)) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
