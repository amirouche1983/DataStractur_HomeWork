package data_structer;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapConcept {


    public static void main(String[] args) {


/**...................... Map .............................*/

        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "A");
        myMap.put(2, "B");
        myMap.put(0, "C");
        myMap.put(1, "g");
        myMap.put(3, "A");
        myMap.put(4, null);
        myMap.put(null, "R");
        myMap.put(5, "A");
        System.out.println("hash Map " + myMap);

        Hashtable<Integer, String> myMap2 = new Hashtable<>();
        myMap2.put(1, "A");
        myMap2.put(2, "B");
        myMap2.put(0, "C");
        myMap2.put(1, "g");
        myMap2.put(3, "A");
        myMap2.put(4, "z");
        myMap2.put(6, "R");
        myMap2.put(5, "A");
        System.out.println("hash table : " + myMap2);


        Hashtable myMap1 = new Hashtable();
        myMap1 = (Hashtable) myMap2.clone();
        System.out.println(myMap1);

        myMap1.put(33, "amar");
        System.out.println("add element to clone " + myMap1);

    }
}
