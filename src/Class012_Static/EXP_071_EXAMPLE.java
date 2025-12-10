package Class012_Static;

public class EXP_071_EXAMPLE {
    public static void main(String[] args) {
        Automation t1 = new Automation();
        System.out.println(t1.driver);
        System.out.println(Automation.driver);
        Automation.driver = "Firefox";
        System.out.println(Automation.driver);
        System.out.println(Automation.driver2);


    }
}


    class Automation {
        static String driver = "Chrome";
        static String driver2;
    }
