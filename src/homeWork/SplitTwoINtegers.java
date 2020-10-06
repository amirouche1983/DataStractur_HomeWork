package homeWork;

import java.util.Scanner;

public class SplitTwoINtegers {

    public static void main(String[] args) {
        int a,i;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");

        a = scan.nextInt();

        while (a > 0) {

            i= a % 10;

            System.out.println(i);

            a = a / 10;
            System.out.println(a);

        }
    }
}
