package Class015_Exceptions;

public class EXP_085_Try_Catch_Finally {

    public static void main(String[] args) {
        int a = 1;
        int c= 0;
        try {
            c = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }finally {
            System.out.println("I will be always executed!");
        }
        System.out.println(c);
    }
}
