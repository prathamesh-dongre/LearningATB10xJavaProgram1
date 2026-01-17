package Class015_Exceptions;

public class EXP_089_Finally {

    public static void main(String[] args) {
        final double pi = 3.14; //value cannot be changed once final
        int a= 0;
        try {
            int x = 10/a;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("div by Zero");
        } finally {
            System.out.println("I will be executed anyHow!!");
        }
    }
}
