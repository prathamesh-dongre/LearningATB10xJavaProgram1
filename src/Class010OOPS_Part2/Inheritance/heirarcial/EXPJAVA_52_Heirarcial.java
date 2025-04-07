package Class010OOPS_Part2.Inheritance.heirarcial;

import Class010OOPS_Part2.Inheritance.multilevel.Father;

public class EXPJAVA_52_Heirarcial {

    public static void main(String[] args) {
        FATHER F1 = new FATHER();
        F1.HOME();

        Patthi P1 = new Patthi();
        P1.farm();
        P1.HOME();;

        Girl G1 = new Girl();
        G1.HOME();
        G1.Gold();

        Girl2 G2 =new Girl2();
        G2.HOME();
        G2.MutualFunds();

    }
}
