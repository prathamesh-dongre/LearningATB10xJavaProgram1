package Class002;

public class EXPJAVA_003Inc_Dec_operator {
     public static void main (String[]args){
         int a=10;
         System.out.println (++a + a++ + a++);
           //line || 11+11+12= 34
         System.out.println(a);
         //a=13


         int b=20;
         System.out.println(--b +b++ + b--);
         System.out.println(b);
         // line || 19+19+20= 58
         //b=19
         System.out.println("---------------------------------");
         int c=20;
         System.out.println(c++);///c=20
         //c=21
         System.out.println(++c);
         //c=22
         System.out.println(c--);

         c=20;

         System.out.println(c-- + c++ + --c);
         //20+19-19=20



     }
}
