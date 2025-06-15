package Class010OOPS_Part2.Polymorphism.Methodoverriding;

public class EXPJAVA_052_poly {

    public static void main(String[] args) {

        Patthi P1= new Patthi();
        P1.home();

        Father F1= new Father();
        F1.home();

        Father P2 = new Patthi();
        P1.f1();

    }
}
