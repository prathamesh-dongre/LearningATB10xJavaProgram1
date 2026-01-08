package Class015_Exceptions;

import java.util.Scanner;

public class EXP_087_ORexceptions {

    public static void main(String[] args) {
          String v ="fff" ;
       // int i= Integer.parseInt("ip");
        //String rp= args[0];
        System.out.println(args.length);
        if (args.length == 0) {
            System.out.println("Please provide an argument");
            Scanner sc= new Scanner(System.in);
            v =sc.next();
          //  return; // ENDS main method
        }

        try {

            int a = Integer.parseInt(v);
            int b=10/a;
            String yu=args[0];
            System.out.println(a);
        }
        catch (ArithmeticException  |NullPointerException|ArrayIndexOutOfBoundsException e ) {
            System.out.println(e.getMessage());
            System.out.println("Invalid number format");
        }

    }
}
