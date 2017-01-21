package homework.homework_2016_12_10.anzhela_karapetyan;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;

public class Search {
    public static void main(String args[]) {
        Search ob = new Search();
        ArrayList<String> res = new ArrayList<String>();
        String searchPath = "C:\\Users\\Angela\\Desktop\\lesson7";
        String searchmask = ".java";
        ob.search(res, searchPath, searchmask);

    }

    void search(ArrayList<String> result, String searchPath, String searchmask) {
//        result - to put in found files,
//        searchPath - where to search
//        mask - what to search
        //  searchPath = "C:\\Users\\Angela\\Desktop";
        File dir = new File(searchPath);

        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathName) {
                return pathName.isFile();
            }
        });
        for (File f : files) {
            String a = f.getAbsolutePath();
            result.add(a);
        }

        System.out.println(result);
    }
}
