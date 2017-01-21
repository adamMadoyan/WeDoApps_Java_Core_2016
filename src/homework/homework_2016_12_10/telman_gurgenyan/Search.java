package homework.homework_2016_12_10.telman_gurgenyan;

import java.io.File;
import java.util.ArrayList;

public class Search {


    public void search(ArrayList<String> result, String searchPath, String mask) {

        File f = new File(searchPath);
        String s[] = f.list();
        int sLenght = s.length;
        result = new ArrayList<>(sLenght);
        int indexList = 0;
        boolean goList = false;

        for (int i = 0; i < sLenght; i++) {
            String pahDir = searchPath + "/" + s[i];
            File f2 = new File(pahDir);
            if (f2.isDirectory()) {
                result.add(indexList, pahDir);
                indexList++;
            }
            if (f2.isFile()) {
                if (f2.getName() == mask) {
                    System.out.println("File found -- " + pahDir);
                    goList = true;
                    break;
                }

            }
        }

        if (!goList) {
            for (int i = 0; i < result.size(); i++) {
                search(null, result.get(i), mask);
            }
        }


    }


}

class SearchMain {
    public static void main(String[] args) {
        Search s = new Search();


        s.search(null, "C:\\Users\\Telman\\Desktop", "hh.txt");
    }
}


   /* void search(ArrayList<String> result, String searchPath, String search mask) {}
    result - to put in found files,
    searchPath - where to search
    mask - what to search*/


class A {


    long fact(int n) {

        if (n == 1 || n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }



}