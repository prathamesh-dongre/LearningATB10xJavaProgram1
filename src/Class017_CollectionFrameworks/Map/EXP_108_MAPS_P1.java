package Class017_CollectionFrameworks.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class EXP_108_MAPS_P1 {
    public static void main(String[] args) {

        Map m1= new HashMap();
        // Map is key - value
        // name : pramod,
        // rollno : 1
        // phone : 9876543210
        m1.put("name","pramod");
        m1.put("rollno",1);
        m1.put("phone",987654321);
        m1.put("phone",887629887);//  old phone no is replaced ,no duplicate keyvalue
        System.out.println(m1);

        Map<String,Object> M2= new LinkedHashMap();

        M2.put("roll1",1);
        M2.put("roll2","patti");
        M2.put("roll3","sukiee");
        System.out.println(M2);



    }
}
