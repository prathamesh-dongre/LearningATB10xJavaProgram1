package Class015_Exceptions;

public class EXP_080_Exceptions {
    public static void main (String[] args){

        int a= 0;
        int b=6;
        b=100/a;
        System.out.println(b);

        // UnChecked -> ArithmeticException, NullPointerException

        String s1= "amit";
        int c=Integer.parseInt(s1);

        System.out.println(b);
        System.out.println("End the program");

        String name = null;
        name.trim(); // ( " Pramod ") -> trailing spaces -> "Pramod"
        // java.lang.NullPointerException: Cannot invoke "String.trim()"

    }
}
