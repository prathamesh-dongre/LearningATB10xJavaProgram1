package Class015_Exceptions;

import java.io.File;
import java.io.FileReader;


public class EXP_092_Finally {
    public static void main(String[] args) {
        FileReader F = null;

        try

    {
        F = new FileReader(new File("E://Java_Learning//ChatGPT.txt"));
        System.out.println("file found");
    }
        catch(
    Exception e)

    {
        System.out.println(e.getMessage());
    }
        finally {
            F = null;
            try {
                if (F != null) {    //If to Handel null point exception
                F.close();
                System.out.println("executed any how");
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
          }

    }
}
}
