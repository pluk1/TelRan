package hw_07_25_interviewTest.controller;

import hw_07_25_interviewTest.Operation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FilesOperationApp {

    public static void main(String[] args)
            throws IOException, IllegalAccessException, InstantiationException, ClassNotFoundException {


        BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter source file name: ");
        String inFile = fileNameReader.readLine();

        System.out.println("Enter destination file name: ");
        String outFile = fileNameReader.readLine();

        System.out.println("Enter name of operation on the files: ");
        String action = fileNameReader.readLine();

        fileNameReader.close();

        Operation.operation(inFile,outFile,action);
    }
}
