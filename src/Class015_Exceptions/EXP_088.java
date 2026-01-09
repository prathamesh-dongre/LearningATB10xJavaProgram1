package Class015_Exceptions;

public class EXP_088 {
    public static void main(String[] args) {
        String ip = null; // java.lang.ArrayIndexOutOfBoundsException
        try {
            ip = args[0];
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        String a = "rt"; // NumberFormatException
        try {
           int u= Integer.parseInt(a);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        int b = 0; // ArithmeticException
        try {
            b = 100 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }
}
