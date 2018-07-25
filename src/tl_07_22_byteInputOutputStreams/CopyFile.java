package tl_07_22_byteInputOutputStreams;

import java.io.*;

public class CopyFile {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter path of src file");
        String srcFile = bufferedReader.readLine();

        System.out.println("Enter path of dst file");

        String dstFile = bufferedReader.readLine();

        FileInputStream flInput = new FileInputStream(srcFile);
        FileOutputStream flOut = new FileOutputStream(dstFile);

        System.out.println(flInput.available());


        int size = flInput.available();
        for (int i = 0; i < size; i++) {
            flOut.write(flInput.read());
        }

        flInput.close();
        flOut.close();


    }
}
