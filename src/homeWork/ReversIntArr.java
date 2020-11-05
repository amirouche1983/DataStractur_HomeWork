package homeWork;

import java.util.Arrays;

public class ReversIntArr {
    public static void main(String[] args) {
        int[] arrayNum = {-1, -3, 5, 77, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 99};
        int leng = arrayNum.length;
        int[] reversArry = new int[leng];
        int i, j = leng;
        for (i = 0; i < leng; i++) {
            reversArry[j - 1] = arrayNum[i];
            j--;
        }
        System.out.println("reversed array is: " + Arrays.toString(reversArry));
        //System.out.println(ReversIntUsingRecursion(arrayNum, i));
    }


    public static int [] ReversIntUsingRecursion(int [] arrayNum,int i) {

        int[] reversedArr = new int[arrayNum.length];
         i = arrayNum.length-1 ;
         int j = 0;
         while (i>0) {
             reversedArr[j] = arrayNum[i--];
             ReversIntUsingRecursion(reversedArr, i - 1);
         }
        return reversedArr;
    }


}
