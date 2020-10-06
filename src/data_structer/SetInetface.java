package data_structer;

import java.util.*;

public class SetInetface {
    public static void main(String[] args) {
        /*
        Set in Java. Set is an interface which extends Collection.
 It is an unordered collection of objects in which duplicate values cannot be stored.
  Basically, Set is implemented by HashSet, LinkedHashSet or TreeSet (sorted representation).
   Set has various methods to add, remove clear, size, etc to enhance the usage of this
         */
        //   **********************Exemple ***************************
//        HashSet<String> myList = new HashSet<>();
//        Set<String> myList1 = new HashSet<>();
//        Collections.addAll(myList1, "kaci1", "kaci", "kaci");
//        myList.add("brahim");
//        myList.add("amar");
//        myList.add("nourdin");
//        myList.add("karim");
//        myList.add(null);
//        Set<String> List2 = new LinkedHashSet<>();
//        List2.add("brahim");
//        List2.add("karim");
//        List2.add("nourdin");
//        List2.add(null);
//        List2.add("amar");
//        List2.add("nourdin");
//        System.out.println("List2"+List2);
//        System.out.println("myList"+myList);
//        System.out.println("myList1"+myList1);
//
//        String[] names = new String[11];
//        names[2]= "amar";
//        names[4]= "nourdine";
//        names[6]= "Karim";
//        names[8]= "rachid";
//        names[0]= "brahim";
//        names[5]= "nourdine";
//        names[10]= "rachid";
//        Set<String> namesSet1 = new HashSet<String>(Arrays.asList(names));
//        //Set<String> namesSet2 = new TreeSet<String>(Arrays.asList(names));
//        Set<String> namesSet3 = new LinkedHashSet<String>(Arrays.asList(names));
//        System.out.println(Arrays.toString(names));
//        System.out.println(" using HashSet"+ namesSet1);
//        //System.out.println(" using TreeSet"+namesSet2);
//        System.out.println(" using LinkedHashSe"+namesSet3);
        String[] names1 = new String[8];
        names1[1]= "amar";
        names1[3]= "nourdine";
        names1[4]= "karim";
        names1[6]= "rachid";
        names1[0]= "brahim";
        names1[5]= "Nourdine";
        names1[2]= "rachid";
        names1[7]= "Aghilas";

       Integer [] names2 = new Integer[8];
        names2[1]= 5;
        names2[3]= 7;
        names2[4]= 20;
        names2[6]= 1 ;
        names2[0]= 20;
        names2[5]= 3;
        names2[2]= 7;
        names2[7]= 9;
        Set<String> namesSet11 = new HashSet<String>(Arrays.asList(names1));//HashSet dooes not accept duplicates accepts one null value and
        Set<String> namesSet12 = new TreeSet<String>(Arrays.asList(names1));//TreeSet does not accept null values and duplicates
        Set<String> namesSet13 = new LinkedHashSet<String>(Arrays.asList(names1));// LinkedHashSet keeps the order of the data the way you Entered them
        System.out.println("                   "+Arrays.toString(names1));
        System.out.println();
        System.out.println(" using HashSet     "+ namesSet11);
        System.out.println();
        System.out.println(" using TreeSet     "+namesSet12);
        System.out.println();
        System.out.println(" using LinkedHashSe"+namesSet13);
        System.out.println("**********************************");
        Set<Integer> namesSet1 = new HashSet<Integer>(Arrays.asList(names2));//HashSet dooes not accept duplicates accepts one null value and
        Set<Integer> namesSet2 = new TreeSet<Integer>(Arrays.asList(names2));//TreeSet does not accept null values and duplicates
        Set<Integer> namesSet3 = new LinkedHashSet<Integer>(Arrays.asList(names2));// LinkedHashSet keeps the order of the data the way you Entered them
        System.out.println("                   "+Arrays.toString(names2));
        System.out.println();
        System.out.println(" using HashSet     "+ namesSet1);
        System.out.println();
        System.out.println(" using TreeSet     "+namesSet2);
        System.out.println();
        System.out.println(" using LinkedHashSe"+namesSet3);
    }
}
