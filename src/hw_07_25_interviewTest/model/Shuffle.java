package hw_07_25_interviewTest.model;

import hw_07_25_interviewTest.ReadWriteFile;
import hw_07_25_interviewTest.interfaces.IOperation;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Shuffle implements IOperation {

    @Override
    public void action(String inFileName, String outFileName) {

       // ReadWriteFile readWriteFile = new ReadWriteFile();

        ArrayList<String> inFileArray = ReadWriteFile.readFile(inFileName);

        Collections.shuffle(inFileArray);

        ReadWriteFile.writeFile(inFileArray,outFileName);

    }
}
