package homeWork;

import java.util.Arrays;

public class theLowestInteger extends SplitTwoINtegers {

    public static void main(String[] args) {
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19, 30, 2};
        System.out.println("the lowest is :"+lowestNumber(array1,array2));
    }
    public static int lowestNumber(int[] array1, int[] array2) {
        int lowest ;
        int lowest1 = array1[0];
        int lowest2 = array2[0];
        int i = 0;
        int j = 0;
        for (i = 0; i < array1.length; i++) {

            if (array1[i] < lowest1) {
                lowest1 = array1[i];
                for (j = 0; j < array2.length; j++) {
                    if (array2[j] < lowest2) {
                        lowest2 = array2[j];
                    }
                }

            }
        }

        if (lowest1 < lowest2) {
            lowest = lowest1;
        } else {
            lowest = lowest2;
        }
        System.out.println("original array1 is :" + Arrays.toString(array1));
        System.out.println("The smallest number in array1 is :" + lowest1);
        System.out.println("original array2 is :" + Arrays.toString(array2));
        System.out.println("The smallest number in array2 is :" + lowest2);
        return lowest;
    }

}

