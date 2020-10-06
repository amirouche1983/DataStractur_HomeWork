package data_structer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arras_ArrayList {
    /**
     * Array :
     * it's indexed collection of fixed number of homogenous data element and
     * can hold primitive and object.We use Object array to overcome homogenous data.
     * Advantages :
     * - Performance
     * Disadvantages:
     * - you can't change the size .
     * - Not recommanded for memory .
     */

    int[] x = new int[10];

    byte b = 3;
    int[] xb = new int[b];
/**
 * byte (1 bite) ---- short (2) ---\
 * int(4) --- float(6) ---- double(8) --- long(8)
 * char (1)---------------/
 *
 * *** Promotion ***
 */
    /**
     * Different ways tp print an array:
     * - for loop
     * - for Each loop
     * - Array.asList(str)
     * - Arrays.toString(str)
     * - Arrays.deepToString(str) -----> for 2 dimension array and more
     * - Arrays.Stream(str).forEach(System.out :: println);
     */
    public static void main(String[] args) {
        int[] y = new int['a'];
        System.out.println(y.length);
        byte b = 3;
        int[] xb = new int[b];
        System.out.println(xb.length);
//******************* ArrayList *************
        Integer[] KarimArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<Integer> IbrahimArray = new ArrayList<Integer>(5);
        System.out.println(IbrahimArray.size());
        ArrayList arrayList = new ArrayList();
           /*
             -ArrayList is an indexed collection of Object  data and is a part of collections in java
             -the length of ArrayList is not fixed it's dynamic
             -it has methods like .dd(); .remove(); .set();.get();............
             -we use ArrayList to overcome the Array obstacle  size
 */
        //******************** ways to convert an Array to ArraList:******************
        //first way
        ArrayList<Integer> KarimArrayToList = new ArrayList(Arrays.asList(KarimArray));
        System.out.println("*****************");
        System.out.println(KarimArrayToList);
        System.out.println("*****************");
        //second way
        ArrayList<Integer> KarimArrayToList1 = new ArrayList();
        for (int i = 0; i < KarimArray.length; i++) {
            KarimArrayToList1.add(i, KarimArray[i]);
        }
        System.out.println(KarimArrayToList1);
        System.out.println("*****************");
        //third way
        ArrayList<Integer> KarimArrayToList2 = new ArrayList();
        for (Integer am : KarimArray) {
            KarimArrayToList2.add(am);
        }
        System.out.println(KarimArrayToList2);
        //******************** ways to convert ArraList to an Array:******************

        arrayList.add(4);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add('b');
        arrayList.add(2, "Tom");
        System.out.println(arrayList);
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        arrayList1.add(4);
        arrayList1.add(2);
        arrayList1.add(4);
    }
}
