package Class002;

public class EXPJAVA_002_TO_Largestno { ;

    public static void main(String[] args) {
        int a=20;
        int b=220;
        int c=200;
        int max= (a>=b)? ((a>=c) ? a :c) : (b>=c)? b:c;

        System.out.printf("Maximum no is %d %n" ,c);
    }
}
