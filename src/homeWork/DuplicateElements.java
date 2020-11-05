package homeWork;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElements {

    public static void main(String[] args) {
        String names[] = {"java", "javaScript", "Ruby", "C", "Python","java", "java","C","C","C"};
        System.out.println("using for Loop: ");
        duplElmUsingForLoop(names);
        System.out.println("using Hash Set: ");
        duplElmUsingHashSet(names);
        System.out.println("using Hash map: ");
        duplElmUsingHashMap(names);
    }

    public static void duplElmUsingForLoop(String names[]) {
        //1:compare each element:

        for (int i = 0; i < names.length; i++) {
            for (int j =i+1 ; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    System.out.println("duplicate element is:" +names[i]);
                }
            }
        }
    }

    public static void duplElmUsingHashSet(String names[]) {
        //2: using HashSet : java collection : it store unique values:O(n)
        Set<String> storeSet = new HashSet<String>();
        for (String name : names) {
            if (storeSet.add(name) == false) {
                System.out.println("duplicate element is:" + name);
            }
        }

    }

    public static void duplElmUsingHashMap(String names[]) {
        //3: using HashMap:O(2n)
        Map<String, Integer> storeMap = new HashMap<String, Integer>();
        for (String name : names) {
            Integer count = storeMap.get(name);
            if (count == null) {
                storeMap.put(name, 1);
            } else {
                storeMap.put(name, ++count);
            }
        }
        //get the values from this HashMap we have to use entrySet:
        Set<Map.Entry<String, Integer>> entrySet = storeMap.entrySet();
        //to illiterate it we have to use forLoop:
        for (Map.Entry<String, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println(" duplicate element is: " + entry.getKey()+" times repeated: "+entry.getValue());
            }
        }

    }
}

