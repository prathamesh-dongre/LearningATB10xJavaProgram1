package Class010OOPS_Part2.Polymorphism.Methodoverriding;

public class EXP_JAVA_053_REALTIME {

    public static void main(String[] args) {
        TC1 t1 = new TC1();
        t1.openbrowser();

        TC2 T2 = new TC2();
        T2.StartTC();


    }
}

    class  commontoALL {
        void openbrowser(){
            System.out.println("starting browser in 5 sec");
        }
    }

    class TC1 extends commontoALL{
        void openbrowser(){
            System.out.println("Openbrowser in 2sec");
        }
    }

    class TC2 extends commontoALL{
        void StartTC(){
            openbrowser();
            System.out.println("Initiate execution");

        }
    }


