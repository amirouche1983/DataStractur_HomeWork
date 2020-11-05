package homeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
     int num = 10 ;
     int nun1 = num;
     int result=0;
     int rest;
     int amstrnum;
     amstrnum=num;
        int counter =0;
        while (nun1 >0) {
            nun1 = nun1 / 10;
            counter++;
        }
        while (amstrnum !=0){
              rest = amstrnum % 10;
            result += Math.pow(rest,counter);
            amstrnum /=10;
        }

        if (result == num){

            System.out.println(num+" is an amstrong number");
        }
        else {
            System.out.println(num+" is not an amstrong number");
        }
    }
    public static void KarimMethod(){
        // int len=String.valueOf(n).length();

        Scanner scn = new Scanner(System.in);
        System.out.println("please enter your number ");
        int number=scn.nextInt();

        int number1,number2 ,restOfDevision, counter = 0;
        number1 = number;
        number2=number;
        while(number1 > 0) {
            number1 = number1 / 10;
            counter++; }
        List<Integer> NumberList= new ArrayList<>();
        while(number2 > 0) {
            restOfDevision= number2 % 10;
            number2 =number2/ 10;
            counter--;
            NumberList.add(restOfDevision);
        }
        System.out.println(NumberList);
        int totalNumb =0;
        int total=1;
        for (Integer num1:NumberList ) {
            int leng=NumberList.size();
            while(leng>0){
                total= total * num1;
                leng--;
            }
            totalNumb = totalNumb + total; //1
            total=1;
        }
        if (totalNumb==number){
            System.out.println("the number is amstrong ");
        }else {
            System.out.println("the number is not amstrong ");
        }
    }
    public static void IbrahimMethod(){
        int num=10;
        System.out.println(is_Armstrong_Number(num));
    }
    public static boolean is_Armstrong_Number(int num){
        if(num==0){return false;}
        int sum=0;
        String strnum= String.valueOf(num);
        char []numChar= strnum.toCharArray();
        List<Integer> numList= new ArrayList<>();
        for (char charNum:numChar) {
            numList.add(Character.getNumericValue(charNum));
        }
        int multpSum=1;
        for(int x: numList){
            int i=numList.size();
            while (i>0){
                multpSum=multpSum * x;
                i --;
            }
            sum=sum+multpSum;
            multpSum=1;
        }
        if(sum==num)return true;
        else return false;
    }

}


