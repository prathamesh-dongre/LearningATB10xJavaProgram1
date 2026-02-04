package Class017_CollectionFrameworks.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class EXP_105_AL_Iterator {
    public static void main (String[] args){

        List ARrral1= new ArrayList();
        ARrral1.add("Pramod");
        ARrral1.add(23);
        ARrral1.add('S');
        ARrral1.add(7);

        System.out.println(ARrral1);

        Iterator IT1= ARrral1.iterator();
        while(IT1.hasNext()){
            System.out.println(IT1.next());
        }

    }
}
