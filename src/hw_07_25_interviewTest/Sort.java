package hw_07_25_interviewTest;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Sort implements IOperation {

    @Override
    public void action(String inFileName, String outFileName) {


        ArrayList<String> inFileArray = new ArrayList<>();

        try (BufferedReader fileReader =
                     new BufferedReader(new FileReader(new File(inFileName)))) {

            while (fileReader.ready()){

                inFileArray.add(fileReader.readLine());
            }

        } catch (Exception e) {

        }

        inFileArray.sort(Comparator.naturalOrder());

        System.out.println(inFileArray);

        try (PrintWriter printWriter = new PrintWriter(new FileWriter(outFileName))){

            inFileArray.forEach(s -> printWriter.println(s));
        }
        catch (Exception e){

        }



    }
}
