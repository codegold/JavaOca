package JavaOca.src.Chapter6Exceptions;

import java.io.IOException;

public class ExceptionTestTwo {
    //public static void main(String[] args) {
//        String textInFile = null;
//        try {
//            readInFile();
//        } catch (IOException e) {
//            //ignore exception
//        }
//        //imagine many lines of code here
//        System.out.println(textInFile.replace(" ", ""));
    private static int yesterday = 1;
    int tomorrow = 10;

    public static void main(String[] args) {
        ExceptionTestTwo tolls = new ExceptionTestTwo();
        int today = 20, tomorrow = 40;
        System.out.print(today + tolls.tomorrow + tolls.yesterday);
    }


}
