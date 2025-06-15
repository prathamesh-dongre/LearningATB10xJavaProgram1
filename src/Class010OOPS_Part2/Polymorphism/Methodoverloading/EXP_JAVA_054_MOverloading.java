package Class010OOPS_Part2.Polymorphism.Methodoverloading;

public class EXP_JAVA_054_MOverloading {
    public static void main(String[] args) {

     MathOperators M1 = new MathOperators();
     int integer;
     integer=M1.add(78,99,88);
        System.out.println(integer);

     double d1;
     d1=M1.add(87.12,89.1,77.5);
        System.out.println(d1);


    }
}
