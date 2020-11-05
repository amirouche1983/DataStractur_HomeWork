package homeWork;

import java.util.*;
import java.util.stream.Collectors;

public class FilterMetode {
    public static void main(String[] args) {
       /* ArrayList<Integer> numbersList = new ArrayList<Integer>();
        numbersList.add(10);
        numbersList.add(15);
        numbersList.add(20);
        numbersList.add(25);
        numbersList.add(30);
        numbersList.add(35);
        numbersList.add(40);*/
        List<Integer> numbersList = Arrays.asList(5,7,10,12,15,20,25,30,35,40);
        List <Integer> evenNumbersList = new ArrayList<Integer>();
        //without using Streams
//        for (int n:numbersList) {
//          if(n%2==0) evenNumbersList.add(n);
//        }
//        System.out.println(evenNumbersList);
        //wit Streams  (filter method map method sort method)  predicate it take one argument and return boolean value(true, false)
//        evenNumbersList =  numbersList.stream().filter(n->n%2==0).collect(Collectors.toList());
//        System.out.println(evenNumbersList);

        numbersList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));

    }
}
