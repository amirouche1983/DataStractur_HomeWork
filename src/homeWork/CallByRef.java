package homeWork;

import java.lang.invoke.VolatileCallSite;
import java.util.Scanner;

public class CallByRef {
    static int x;
    static int y;

    public static void main(String[] args) {
        CallByRef obj = new CallByRef();
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value of x : ");
        x = scan.nextInt();
        System.out.println("enter the value of y : ");
        y = scan.nextInt();
        obj.swapNum(obj);
        System.out.println("the value of x after swapping :" + x);
        System.out.println("the value of y after swapping :" + y);
        System.out.println("*******************************************");
        int x = 10;
        int y = 5;
        System.out.println("Before  swapping two numbers: x = " + x + "/ y = " + y);
        x = x ^ y ^ (y = x);
        System.out.println("After swapping two numbers: x = " + x + "/ y = " + y);
    }

    public void swapNum(CallByRef ob) {
        int a = ob.x;
        ob.x = ob.y;
        ob.y = a;

    }


}
