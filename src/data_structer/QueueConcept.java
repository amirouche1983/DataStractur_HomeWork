package data_structer;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueConcept {

    /*
      Queue is an interface implements collection.
      queue extends three interfaces [BlockingQueue(I),BlockingDQueue(I), DQueue(I)] and two classes [Priority Queue class, LinkedList class]
    - Priority Queue allows Duplicates, Priority order, accept only same data (homogeneous data)
    - LinkedList allows Duplicates, Insertion order,  Heterogeneous data
     */

    public static void main(String[] args) {
        try {
            PriorityQueue karim = new PriorityQueue();
            // PriorityQueue karim = new PriorityQueue(6,new MyComparator());

       karim.add("amar");
       karim.add("rachid");
       karim.add("nourdine");
       karim.add("brahim");
       karim.add("aghilas");
       karim.offer("jack");
//            karim.offer(100);
//            karim.add(100);
            //System.out.println(karim.add(100));
            // System.out.println( karim.add("aghilas"));
        } catch (Exception e) {

            System.out.println("the data in not homogeneous ");
        }


        LinkedList amar = new LinkedList();
//        amar.add("amar");
//        amar.add("rachid");
//        amar.add("nourdine");
//        amar.add("brahim");
//        amar.add("aghilas");
//        amar.offer("jack");
//        amar.add(100);
//try{
//    System.out.println(karim.element());
//   // amar.remove();
//}catch(Exception e){
//        System.out.println("the Queue is empty");
//    }
//
//    for (Object ele : karim) {
//        System.out.print(ele + " ");
//    }
//        System.out.println();
//        Iterator elem = karim.iterator();
//        while (elem.hasNext()) {
//            System.out.print(elem.next() + " ");
//
//        }
        // method add () ---> offer()
//       System.out.println("\nusing PriorityQueue " + karim);
//        System.out.println("using LinkedList    " + amar);

        //method poll () ---> remove()
 //       System.out.println("using LinkedList    " +amar.poll());

//        System.out.println("using PriorityQueue " +karim.poll());
 //      System.out.println("using LinkedList    " +amar.remove());
//        System.out.println("using PriorityQueue " +karim.remove());

        //method peek()  ---> element ()
       // System.out.println("using LinkedList    " + amar.element());
//        System.out.println("using PriorityQueue " + karim.element());
 //       System.out.println("using LinkedList    " + amar.peek());
//        System.out.println("using PriorityQueue " + karim.peek());


    }
}