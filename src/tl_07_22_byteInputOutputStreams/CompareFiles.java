package tl_07_22_byteInputOutputStreams;

import java.io.FileInputStream;
import java.io.IOException;

public class CompareFiles {
    public static void main(String[] args) throws IOException {
        String file1 = "/Users/cartman/Documents/text1.txt";
        String file2 = "/Users/cartman/Documents/text2.txt";

        FileInputStream flInput1 = new FileInputStream(file1);
        FileInputStream flInput2 = new FileInputStream(file2);

//        ArrayList<Integer> arr1 = readFile(file1);
//        ArrayList<Integer> arr2 = readFile(file2);

        int size1 = flInput1.available();
        int size2 = flInput2.available();
        boolean result = true;

        if (size1==size2){
            for (int i = 0; i <= size1; i++) {

                if (flInput1.read() != flInput2.read()){
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }


        System.out.println("Are files equals?: " + result);


    }

//    static ArrayList<Integer> readFile(String filePath) throws IOException {
//
//        ArrayList<Integer> arr = new ArrayList<>();
//        FileInputStream flInput = new FileInputStream(filePath);
//
//        int size = flInput.available();
//        for (int i = 0; i <= size; i++) {
//            arr.add(flInput.read());
//        }
//
//        flInput.close();
//
//        return arr;
//    }
}
