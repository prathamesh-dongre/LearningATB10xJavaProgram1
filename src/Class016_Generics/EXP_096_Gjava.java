package Class016_Generics;

public class EXP_096_Gjava {
    public static void main(String[] args) {

        temp_sum(23,45);
        temp_sum("Pramod","Dutta");

    }

    static Integer temp_sum(Integer a, Integer b)
            {
                System.out.println(a+b);
            return a+b;
            }
    static  String temp_sum(String a, String b)
    {
        System.out.println(a);
        System.out.println(b);
        return a+b;
    }

}
