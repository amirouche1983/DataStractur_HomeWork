package homeWork;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReversIntLinkedList {
    /*
    Given a linked list of N nodes. The task is to reverse this list.
Example 1:
Input: LinkedList: 1->2->3->4->5->6 Output: 6 5 4 3 2 1 Explanation: After reversing the list, elements are 6->5->4->3->2->1.

     */
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        System.out.println(ReversLinList(myList));
        System.out.println(reverseLenkedList(myList));
    }

    public static LinkedList<Integer> ReversLinList(LinkedList myList) {
        LinkedList<Integer> linkedlist2 = new LinkedList<>();
        int i;
        for (i = myList.size(); i > 0; i--) {
            linkedlist2.addAll(myList.subList(i - 1, i));
        }
        return linkedlist2;
    }

    public static LinkedList<Integer> reverseLenkedList(LinkedList<Integer> myList) {
        int size = myList.size();
        int tump, tump1, i, j;
        for (i = 0, j = size - 1; i < size / 2; i++, j--) {
            tump = myList.get(i);
            tump1 = myList.get(j);
            myList.remove(i);
         // myList.remove(j-1);
            myList.add(i, tump1);
            myList.remove(j);
            myList.add(j, tump);
        }
        return myList;
    }
}
