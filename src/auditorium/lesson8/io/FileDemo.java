package auditorium.lesson8.io;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) {

//        UX = / WIN C:

        File dir = new File("/home/adam/Desktop");
        File file = new File(dir, "resize.sh");

        System.out.println("dir is file : " + dir.isFile());
        System.out.println("file is directory : " + file.isDirectory());
        System.out.println("absolute path" + file.getAbsolutePath());
        System.out.println("dir name : " + dir.getName());

        File newDir = new File("/home/adam/Desktop/testFolder");
        if (!newDir.exists()) {
            newDir.mkdir();
        }

        File newFile = new File(newDir, "a.txt");

        System.out.println("a is exist : " + newFile.exists());

        if (!newFile.exists()) {
            try {
                newFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        System.out.println("------------");
        String [] listFiles = dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".png");
            }
        });
        for (String listFile : listFiles) {
            System.out.println(listFile);
        }
        System.out.println("------------");

        System.out.println("+++++++++++++");
        File[] files = dir.listFiles(new MyFileFilter());
        for (File f : files) {
            System.out.println(f.getAbsolutePath());
        }
        System.out.println("+++++++++++++");
    }
}

class MyFileFilter implements FileFilter {

    @Override
    public boolean accept(File pathname) {
        return pathname.isFile();
    }
}