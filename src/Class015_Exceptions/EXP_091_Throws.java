package Class015_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class EXP_091_Throws {

    public static void main(String[] args) throws FileNotFoundException, Exception {
        FileInputStream fileInputStream = new FileInputStream("E://Java_Learning//ChatGPT.txt");
        int a=0;
        int b= 100/a;
       // System.out.println(e.);//You cannot create an object or variable in throw
    }
}
