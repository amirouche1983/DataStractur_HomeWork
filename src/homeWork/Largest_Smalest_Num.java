package homeWork;

import java.util.Arrays;

public class Largest_Smalest_Num {
    public static void main(String[] args) {

        //int[] numbers = { 987534,-10, 24, 50, -88 };
        int[] numbers1 = { 7,12,10,-20,5,20,1,-12,12 };
        smallestNum(numbers1);
        System.out.println("*******************");
       // largest_SmallestNum(numbers);


    }

    public static void smallestNum(int [] numbers1){
        int smallest = numbers1[0];

        for (int i = 0; i < numbers1.length; i++) {

            if (numbers1[i] < smallest) {
                smallest = numbers1[i];
            }
        }
        System.out.println(" given arry is: " + Arrays.toString(numbers1));

        System.out.println("smallest number is: " + smallest);
    }

    public static void largest_SmallestNum(int [] numbers){
        int largest = numbers[0];
        int smallest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                largest = numbers[i];
            } else if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("\n given arry is:" + Arrays.toString(numbers));

        System.out.println("largest number is:" + largest);

        System.out.println("smallest number is:" + smallest);
    }
}
