package Class015_Exceptions;

public class EXP_083_execptions_catch {
    public static void main(String[] args) {
        int b=0;
        int c=0;
         try{
             int e=10/b;
             System.out.println(10/b);
         }
         catch (ArithmeticException e){
             System.out.println(e.getMessage());
         }
         catch (Throwable e){
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }

}
