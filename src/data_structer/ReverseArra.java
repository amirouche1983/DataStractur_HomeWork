package data_structer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArra {

    public static void main(String [] args) {
        // System.out.println("hello world");

        int[] Array = {1, 2, 4, 6, 8, 9, 0, 10};
        int size = Array.length;
        System.out.println(Array[7]);
        ReversIntArray(Array, size);
        //**********************************
        int[] array = {20, 3, 6, 34, 67, 44, 10};
        int n = array.length;
        int[] reversedarry = new int[n];
        int j = n;

        for (int i = 0; i < n; i++) {
            reversedarry[j - 1] = array[i];
            j--;
        }
        System.out.println("reversed arry is: ");
        for (int k = 0; k < n; k++) {
            System.out.print(reversedarry[k] + " ");
        }
        System.out.println("\nreversed array is:" + Arrays.toString(reversedarry));

        int b = array.length;
        int[] reversedArray = new int[n];
        int d = b;
        for (int i = 0; i < b; i++) {

            reversedArray[d - 1] = array[i];
            d--;

        }
        for (int k = 0; k < n; k++) {
            System.out.print(reversedArray[k] + " ");
        }
        // ******************  ************************************
        System.out.println();
        String str = "amar djebra";
        String reversedStr = "";
        int c = 1;
        while (str.length() != reversedStr.length()) {
            reversedStr = reversedStr + str.charAt(str.length() - c);
            c++;
        }
        System.out.println(reversedStr);

    }
//****************************************

    public static void ReversIntArray(int [] Array,int size){
        int i , temp;

        for(i=0; i< size-1 ; i++){
            temp = Array[i];
            Array[i]=Array[size - i - 1];
            Array[size - i - 1]=temp;

        }
        System.out.println("reversed Array is: "+ Arrays.toString(Array));
    }

}