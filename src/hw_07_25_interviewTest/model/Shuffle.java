package hw_07_25_interviewTest.model;

import hw_07_25_interviewTest.interfaces.IOperation;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Shuffle implements IOperation {

    @Override
    public void action(String inFileName, String outFileName) {
        ArrayList<String> inFileArray = new ArrayList<>();

        try (BufferedReader fileReader =
                     new BufferedReader(new FileReader(new File(inFileName)))) {

            while (fileReader.ready()) {

                inFileArray.add(fileReader.readLine());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        try (PrintWriter printWriter = new PrintWriter(new FileWriter(outFileName))) {

            Collections.shuffle(inFileArray);

            inFileArray.forEach(s -> printWriter.println(s));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
