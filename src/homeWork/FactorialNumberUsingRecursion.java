package homeWork;

public class FactorialNumberUsingRecursion {
    /*
     * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
     * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
     *
     */

    public static void main(String[] args) {
        System.out.println(factorial(4));

    }
    public static long factorial(int num){
        if(num>0){
            long  result=num*factorial(num-1);
            return result;
        }
        else return 1;
    }
   // result=4*factorial(4-1)-->result=4*factorial(3)-->3*factorial(2)-->2*factorial(1)
    //      =                            4*3 *2*1
    //result= 24
    /* example to understand how the recursion works
ex: num =4
while num is > 1 it return [to 4 * multiplyNumbers(4- 1)] then it calls multiplyNumbers(int 3) again
intel num ==1 then it will stop and return to 1 then it will execute all the returned calculations
multiplyNumbers(4)

4 * multiplyNumbers(4- 1)
|
3 * multiplyNumbers(3- 1)
|
2 * multiplyNumbers(2- 1)
|
multiplyNumbers(1)=1 => now it will calculate all the passed steps one by one
*/
// factorial number using recursion method
    public static long multiplyNumbers(int num){
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }

}
