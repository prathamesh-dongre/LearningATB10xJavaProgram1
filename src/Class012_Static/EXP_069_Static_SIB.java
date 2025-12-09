package Class012_Static;

public class EXP_069_Static_SIB {

    public static void main (String[] args){
        A a = new A();
        A aa=new A();

        System.out.println(a);

    }
}
 class A{
    static {
        System.out.println("Called once when class is loaded"
        );
    }
    static int a=10;
    static void m1(){
        System.out.println("static method");
    }
 }