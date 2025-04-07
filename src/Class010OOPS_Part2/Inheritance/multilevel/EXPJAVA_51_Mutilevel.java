package Class010OOPS_Part2.Inheritance.multilevel;

import Class010OOPS_Part2.Inheritance.SingleInheritance.Son;

public class EXPJAVA_51_Mutilevel {
    public static void main(String[] args) {

        Grandfather G1 = new Grandfather();
        G1.home();
        SON s1= new SON();
        s1.home();

        Father S2= new SON();
        S2.home();

    }
}
