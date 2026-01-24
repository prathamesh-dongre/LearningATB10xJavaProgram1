package Class016_Generics;

public class EXP_097_Genericscode {
    public static void main(String[] args) {
        temp(23,45);
        temp("Pramod",6);
        temp("Pramod",123);
        temp(true,false);

    }
    // T -> can be any data type

    public static <T> T temp(T a, T b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
