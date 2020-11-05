package homeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmallestLargestSumNum {
    /*
Write a java program to do the following Using Arrays.
1- Input 15 integers(input validation , all numbers must be between 0 and 100)
2- Find the largest number.
3- Find the smallest number.
4- Find the sum of all numbers in the Array.
Display:
Largest Number.
Smallest Number.
Sum of all Numbers.
The original Array.
*/
    public static void main(String[] args) {

            int [] NumArray=new int [5];
            Scanner scn = new Scanner(System.in);
            int i=0;
            int LargeNumber=0;
            int SmallNumber=100;
            int sum=0;
            while (i<5){
                System.out.println("enter number");
                int number = scn.nextInt(); // number=3

                if (number>=0 && number <=100) {
                    NumArray[i] = number;
                    if (LargeNumber < number) {
                        LargeNumber = number; // largestNumber= 3
                    }
                    if (SmallNumber > number) { // Smallnumbr=3
                        SmallNumber = number;
                    }
                    sum = sum + number; // 0+3
                    i++;
                }else {
                    System.out.println("the entred number Should be between 0 and 100");
                }
            }
            System.out.println("the largest number is "+ LargeNumber);
            System.out.println("the smallest number is "+ SmallNumber);
            System.out.println("the sum of all numbers is " +sum);
            for (i=0 ;i<NumArray.length; i++){
                System.out.print(NumArray[i]+" ");
            }

        }
    }
