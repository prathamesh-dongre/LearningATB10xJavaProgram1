package Class017_CollectionFrameworks.Map;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class EXP_111_HashTable {

    public static void main(String[] args) {
        Hashtable<String, String> HT1 = new Hashtable<>();
        HT1.put("Name", "Pratt");
        HT1.put("Age", "45");
        HT1.put("Gender", "M");
        // HT1.put(null,null);
        System.out.println(HT1);

        HashMap<Integer, String> ht2 = new HashMap<>();
        ht2.put(1, "one");
        ht2.put(2, "two");
        ht2.put(3, "three");
        ht2.put(3, null);// replaced
        ht2.put(null, null); // NULL Key not allowed
        System.out.println(ht2);

        Enumeration<String> e = HT1.keys();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

        Enumeration<String> w = HT1.elements();
        while (w.hasMoreElements()) {
            System.out.println(w.nextElement());
        }

        for (Integer key : ht2.keySet())
            System.out.println(key);

        for (String value : ht2.values())
            System.out.println(value);
    }
}