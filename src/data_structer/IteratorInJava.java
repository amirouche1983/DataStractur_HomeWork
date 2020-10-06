package data_structer;

import com.sun.tools.javac.code.Scope;

import java.security.KeyStore;
import java.util.*;

public class IteratorInJava {

    public static void main(String[] args) {
        Map<Integer, String> teamTable = new Hashtable<>();
        teamTable.put(1, "karim");
        teamTable.put(2, "ibrahim");
        teamTable.put(3, "amar");
        teamTable.put(4, "rachid");
        teamTable.put(5, "nourdine");
        teamTable.put(6, "jack");
        teamTable.put(7, "jack");
        System.out.println(teamTable);
        System.out.println(teamTable.get(1));
        System.out.println(teamTable.keySet());
        System.out.println(teamTable.values());
        int i=0 ;
        int result =0;
        Object[][] arr = new Object[teamTable.size()][2];

     Set <Map.Entry<Integer,String>> entry = teamTable.entrySet();
        for (Map.Entry<Integer, String> numKye:entry) {
            System.out.println(numKye.getValue()+" *** "+numKye.getKey());
            arr[i][result]=numKye.getKey();
            arr[i++][result+1]=numKye.getValue();
            //i++;
        }
        System.out.println(Arrays.deepToString(arr));


//           Set set = teamTable.entrySet();
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()){
//         //   Map.Entry entry = (Map.Entry)iterator.next();
//            System.out.println( iterator.next());
//            //System.out.println(entry.getKey()+" "+entry.getValue());
    }
}




