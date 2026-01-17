package Class015_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EXP_090_File_exeception {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader(new File("E://Java_Learning//ChatGPT.txt"));

            int ch;
            while ((ch = f.read()) != -1) {
                System.out.print((char) ch);
                System.out.println(f);
            }
        }
            catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
