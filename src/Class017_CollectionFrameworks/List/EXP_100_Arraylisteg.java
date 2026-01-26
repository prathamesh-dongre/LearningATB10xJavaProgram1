package Class017_CollectionFrameworks.List;

import java.util.ArrayList;
import java.util.List;

public class EXP_100_Arraylisteg {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1); // 0
        list.add("t");  // 1
        list.add("3"); // 2   string not Integer
        list.add(4);  //3
        list.add(4);  //4
        list.add(3);  //5

        System.out.println(list);

        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("t"));
        System.out.println(list.indexOf(3));
        System.out.println(list.lastIndexOf(3));
    }

}
