package hw_07_25_interviewTest;

public class Operation {

    public static void operation(String inFileName, String outFileName, String operation)
            throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Class<?> clazz = Class.forName("hw_07_25_interviewTest." + operation);

        IOperation operationNew = (IOperation)clazz.newInstance();
        operationNew.action(inFileName,outFileName);


    }
}
