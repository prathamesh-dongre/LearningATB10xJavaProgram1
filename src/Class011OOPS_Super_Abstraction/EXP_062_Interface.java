package Class011OOPS_Super_Abstraction;

import java.sql.SQLOutput;

public class EXP_062_Interface {

    public static void main(String[] args) {
        CT1 test1 = new CT1();
        test1.N1();
        test1.N2();

    }
}
    interface I1 {
        void N1();
    }

    interface I2 {
        void N2();
    }

    class CT1 implements I1, I2 {

        @Override
        public void N1() {
            System.out.println("Interface function 1");
        }

        public void N2() {
            System.out.println("Interface function 2");
        }
    }






