package hw_07_25_interviewTest.model;

import hw_07_25_interviewTest.ReadWriteFile;
import hw_07_25_interviewTest.interfaces.IOperation;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Reverse implements IOperation {
    @Override
    public void action(String inFileName, String outFileName) {

        ArrayList<String> inFileArray = ReadWriteFile.readFile(inFileName);

        Collections.reverse(inFileArray);

        ReadWriteFile.writeFile(inFileArray,outFileName);



    }
}
