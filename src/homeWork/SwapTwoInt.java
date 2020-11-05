package homeWork;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwapTwoInt {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner swap = new Scanner(System.in);
        System.out.println("Enter the value of num1: ");
        num1 = swap.nextInt();
        System.out.println("Enter the value of num2: ");
        num2 = swap.nextInt();
        int n =2;
        while (n > 1) {
            num1 = num1 + num2;
            num2 = num1 - num2;
            num1 = num1 - num2;


            n--;
        }
        System.out.println("the value of num1 is: "+num1);
        System.out.println("the value of num2 is:"+num2);
    }

}

