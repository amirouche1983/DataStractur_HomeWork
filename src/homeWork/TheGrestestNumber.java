package homeWork;

import java.util.Scanner;

public class TheGrestestNumber {

    public static void main(String[] args) {
        Scanner Mysc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int greatestnum = Mysc.nextInt();
        System.out.println("The the greatest number is: " + greatestnum);
        System.out.println("Enter a number : ");
        while (Mysc.hasNext()) {
            int num = Mysc.nextInt();
            if (greatestnum < num) {
                greatestnum = num;}
                System.out.println("Enter a number : ");
                System.out.println("The the greatest number is: " + greatestnum);
                String doYouwantToContinue;
                Scanner MyScanner = new Scanner(System.in);
                System.out.println("do you want to continue ");
                doYouwantToContinue = MyScanner.nextLine();
                if (doYouwantToContinue.equals("no")) {
                    break;
                } else {
                    System.out.println("The the greatest number is: " + greatestnum);
                    System.out.println("Enter a number : ");
                }

            }
        }
    }
