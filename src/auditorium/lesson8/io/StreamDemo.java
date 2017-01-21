package auditorium.lesson8.io;


import java.io.*;

public class StreamDemo {

    public static void main(String[] args) {

        File file = new File("/home/adam/Desktop/testFolder", "a.txt");
//        writeOnFile(file, "Text for writting on file. \n :)");

        String text = readFromFile(file);
        System.out.println(text);

    }

    private static String readFromFile(File file) {
        InputStream inputStream = null;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            inputStream = new FileInputStream(file);
            int i;
            while ((i = inputStream.read()) != -1) {
                stringBuilder.append((char) i);
            }
        } catch (IOException e) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
        return stringBuilder.toString();
    }

    private static void writeOnFile(File file, String text) {
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(file);
            outputStream.write(text.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.flush();
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
