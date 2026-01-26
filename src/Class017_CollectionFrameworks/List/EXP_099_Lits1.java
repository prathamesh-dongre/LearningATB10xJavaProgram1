package Class017_CollectionFrameworks.List;

import java.util.ArrayList;
import java.util.List;

public class EXP_099_Lits1 {
    public static void main(String[] args) {
        List l1 = List.of("aa", "dd");
        System.out.println(l1);

        List fruits = List.of("orange","apple","banana","mango","watermelon");
        System.out.println(fruits);
       // fruits.add("melons");
       // fruits.remove("apple");


        ArrayList A1 = new ArrayList();
        A1.add("Prathamesh");
        A1.add("Tester");
        A1.add("QA");
        A1.add("80");

        System.out.println(A1);

        List l = new ArrayList(); // Dynamic Dispatch
        l.add("123");
        l.add("456");
        System.out.println(l);
    }
}
