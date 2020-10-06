package homeWork;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*
         Java provides various methods to actually reverse the indices of elements in the array.
        Enlisted below are the various methods that we are going to discuss in detail.

        Using ArrayList reverse method
        Using traditional for loop
        Using in-place reverse
*/

public class reverseIntArray {
    /*
Java program to reverse a given array in place:
Write a method to reverse a given array in place.
Note: Avoid using in-built methods.
Note: Use in-built methods.
Input : int [] array={-1,-3,5,77,0,1,2,3,4,5,6,7,8,9,99}
Expected Result : [99, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 77, 5, -3, -1]
Input : int [] array={-1,-3};
Expected Result : [-3, -1]
Input : int [] array={};
Expected Result : []
Input : int [] array={1};
Expected Result : [1]
*/

    public static void main(String[] args) {
     //   System.out.println("Original Array:");
        int[] Array = {-1, -3, 5, 77, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 99};
      //  printReverseArray(Array);
//        System.out.println("\n*****************");
 //       reverse_array(Array, Array.length);
//        System.out.println("\n*****************");
//        //function call to reverse the array
//        reverseArray(Array, Array.length);
//        System.out.println("*****************");
//
//        //reverse a String Arrayy
//        String[] stArray = {"one", "Two", "Three", "Four", "Five", "Six", "Seven"};
//        System.out.println("Original Array:" + Arrays.asList(stArray));
//        reverse(stArray);
//        System.out.println("*****************");
////        //print the original array
////        System.out.println("Original Array: \n" + Arrays.toString(Array));

    }

    //a method only to print an Arry backwords:
    static void printReverseArray(int[] Array) {

        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
        System.out.println("\n*****************");
        System.out.println("Reversed Array:");
        for (int i1 = Array.length - 1; i1 >= 0; i1--) {
            System.out.print(+Array[i1] + " ");


        }
    }

    //Reverse An Array Using Traditional For Loop
    static void reverse_array(int Array[], int n) {
        int[] reverse_Array = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            reverse_Array[j - 1] = Array[i];
            j--;
        }

        System.out.println("Reversed array: ");
        for (int k = 0; k < n; k++) {
            System.out.print(reverse_Array[k] + " ");
        }
    }

    /*swap the first elemnt of array with the last element; second element with second last and so on*/
    static void reverseArray(int Array[], int size) {
        int i, k, temp;
        for (i = 0; i < size / 2; i++) {
            temp = Array[i];
            Array[i] = Array[size - i - 1];
            Array[size - i - 1] = temp;
        }

        /*print the reversed array*/
        System.out.println("Reversed Array: \n" + Arrays.toString(Array));
    }

    //function reverses the elements of the array
    static void reverse(String stArray[]) {
       Collections.reverse(Arrays.asList(stArray));
        System.out.println("Reversed Array:" + Arrays.asList(stArray));
    }

    static void reverse_array1(int Array[]) {
        int[] reverse_Array = new int[Array.length];
        int j = Array.length;
        for (int i = 0; i < Array.length; i++) {
            reverse_Array[j - 1] = Array[i];
            j = j - 1;
        }

        System.out.println("Reversed array: ");
        for (int k = 0; k < Array.length; k++) {
            System.out.print(reverse_Array[k] + " ");
        }
    }
}
