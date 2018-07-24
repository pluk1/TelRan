package tl_07_22_byteIOApp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class CompareFiles {
    public static void main(String[] args) throws IOException {
        String file1 = "/Users/cartman/Documents/text1.txt";
        String file2 = "/Users/cartman/Documents/text2.txt";

        FileInputStream flInput1 = new FileInputStream(file1);
        FileInputStream flInput2 = new FileInputStream(file2);

        ArrayList<Integer> arr1 = readFile(file1);
        ArrayList<Integer> arr2 = readFile(file2);

        System.out.println(arr1.equals(arr2));


    }

    static ArrayList<Integer> readFile(String filePath) throws IOException {

        ArrayList<Integer> arr = new ArrayList<>();
        FileInputStream flInput = new FileInputStream(filePath);

        int size = flInput.available();
        for (int i = 0; i <= size; i++) {
            arr.add(flInput.read());
        }

        flInput.close();

        return arr;
    }
}