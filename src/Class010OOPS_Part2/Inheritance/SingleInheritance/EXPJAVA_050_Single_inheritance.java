package Class010OOPS_Part2.Inheritance.SingleInheritance;

public class EXPJAVA_050_Single_inheritance {
    public static void main(String[] args) {
        Son S1 =new Son();
//        System.out.println(S1.House);
//        System.out.println(S1.Villa);
        System.out.println("Son has "+S1.cash+ " CASH and House "+S1.House+ " Villa "+S1.Villa);

        Father F1= new Father();
        System.out.println(F1.cash);
        System.out.println(F1.House);
    }

}
