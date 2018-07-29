package hw_07_25_interviewTest;

import java.io.*;
import java.util.ArrayList;

public class ReadWriteFile {

    private static ArrayList<String> fileArray = new ArrayList<>();

    public static ArrayList<String> readFile(String readFileName) {

        try (BufferedReader fileReader =
                     new BufferedReader(new FileReader(new File(readFileName)))) {

            while (fileReader.ready()) {

                fileArray.add(fileReader.readLine());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return fileArray;
    }

    public static int writeFile(ArrayList fileArray, String dstFileName) {

        try (PrintWriter printWriter = new PrintWriter(new FileWriter(dstFileName))) {

            fileArray.forEach(s -> printWriter.println(s));

            return 1;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }

    }
}
