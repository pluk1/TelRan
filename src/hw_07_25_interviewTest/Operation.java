package hw_07_25_interviewTest;

import hw_07_25_interviewTest.interfaces.IOperation;

public class Operation {

    public static void operation(String inFileName, String outFileName, String operation)
            throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        operation = operation.toLowerCase();

        operation = operation.substring(0, 1).toUpperCase() + operation.substring(1);

        Class<?> clazz = Class.forName("hw_07_25_interviewTest.model." + operation);

        IOperation operationNew = (IOperation)clazz.newInstance();

        operationNew.action(inFileName,outFileName);


    }
}
