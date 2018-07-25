package tl_07_22_byteInputOutputStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class byteIOApp {

    public static void main(String[] args) throws IOException {

        //String file = "/Users/cartman/Documents/text.txt";
        String file = "/Users/cartman/Documents/text1.txt";
        //fileWriter(file);

        fileReader(file);


    }

     static void fileWriter(String filename) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(filename);
        fileOutputStream.write(23);
        fileOutputStream.write(20);
        fileOutputStream.write(30);

        fileOutputStream.close();
    }

    static void fileReader(String filename) throws IOException{

        FileInputStream fileInputStream = new FileInputStream(filename);

        int a = fileInputStream.available();

        for (int i = 0; i < a; i++) {
            System.out.println(fileInputStream.read());
        }

//        while (a!=-1){
//
//            System.out.println(a);
//            a = fileInputStream.read();
//        }

        fileInputStream.close();
    }


}
