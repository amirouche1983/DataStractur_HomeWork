package homeWork;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicat {
/*
  Write a Java program to remove duplicates numbers from a given array of numbers:
    Write a method to remove duplicates numbers from a given array of numbers
    and return an array without duplicates.
    Note:Use In bullet methods
    Note:Do not Use In bullet methods
    Input : arr[] = {1,3,2,4,5,6,4}
    Expected Result : {1,3,2,4,5,6}
    Input : arr[] = {1, 3, 2, 13,5, 6,4,7,2,8,10,11,2,12,15,16,13,9,14,11,7,7,2,5}
    Expected Result : {1, 3, 2, 13,5, 6,4,7,8,10,11,12,15,16,9,14}
    Input : arr[] = {2}
    Expected Result : {2}
    Input : arr[] = {}
    Expected Result : {}
    Input : arr[] = {1, 3, 2, 5, 6,4}
    Expected Result : {1, 3, 2, 5, 6,4}
    Input : arr[] = {1, 2, 2}
    Expected Result : {1, 2}
    Input : arr[] = {1,2,-6,4,6,-6,0,3,99,-1,0}
    Expected Result : {1,2,-6,4,6,0,3,99,-1}
    Input : arr[] = null
    Expected Result : null
            */

    public static void main(String[] args) {
      // int arr[] = {1,3,2,4,5,6,4};
      //int arr [] =  {1, 3, 2, 13,5, 6,4,7,2,8,10,11,2,12,15,16,13,9,14,11,7,7,2,5};
       // int arr[] = {2};
      // int arr[] = {};
     // int  arr[] = {1,2,-6,4,6,-6,0,3,99,-1,0};
     //   int arr [] = {1, 2, 2};
        int arr []  = null;
        System.out.println(Arrays.toString(RmvDupl(arr)));
        System.out.println(Arrays.toString(Remove_duplicate_Array2(arr)));
    }
     public static int[] RmvDupl(int [] arr){
        if (arr == null)return null;
         Set<Integer> resultlist = new LinkedHashSet<>(arr.length);
         for (int i:arr) {
            resultlist.add(i);
         }
         int [] renmvedarrDupl = new int [resultlist.size()];
       int k=0;
         for (int elm:resultlist) {
             renmvedarrDupl[k]= elm;
             k++;
         }

         return renmvedarrDupl;

     }
    //using for loop method
    public static int [] Remove_duplicate_Array2(int[] arr){
        if (arr==null){
            return null;
        }

// numbAray={1,2,1,2}
        int i=0;
        int j=0;
        int index=0;
        int leng = arr.length;
        int []newarray=new int[leng];
        for ( i=0 ;i<leng ;i++){
            for ( j=0 ;j<leng;j++){
                if (arr[i]==arr[j]){
                    break; }
            }
            if (i==j){
                newarray[i]=arr[i]; // 1,2
                index++; // 2
            }
        }
        System.out.println(Arrays.toString(newarray));
        int [] removedDuplicArray=new int[index];

        for (i=0 ;i<index; i++ ){
            removedDuplicArray[i]=newarray[i];
        }

        return removedDuplicArray;

    }
}
