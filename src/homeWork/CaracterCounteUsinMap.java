package homeWork;

import com.sun.tools.javac.code.Scope;

import java.security.KeyStore;
import java.util.*;

public class CaracterCounteUsinMap {
    /*
    homework for today
    How to find the maximum occurring character in given String: ex:("aabcfcba"àprints: a)
          Return null if no unique maximum character is found.
        Note: Avoid using the in-built method.
        Input : abcdcd --->Expected Result : c
        Input : abcdeg ---->Expected Result : null
        Input : ""-----> Expected Result : null
        Input : bcdcaa ----> Expected Result : a
        Input : aaaa----> Expected Result : a
       Input : b----> Expected Result : b
        Input : bbaacdd ===> Expected Result : b
    questions:
    1  What is a Framework? tell me the  types of automation frameworks
    2  What are the benefits of Automation Testing?
     */
    public static void main(String[] args) {
        String st = "aabcfcba";
        //String st = "abcdcd";
        // String st = "abcdeg";
        // String st = "";
        // String st = "bcdcaa";
        //String st = "aaaa";
        //String st = "b";
        //String st = "bbaacdd";
        char[] stChar = st.toCharArray();
        Map<Character, Integer> karim = new HashMap<>();
        int max = 0;
        char charMax = ' ';
        int[] count = new int[stChar.length];
        for (int i = 0; i < stChar.length; i++) {
            for (int j = 0; j < stChar.length; j++) {
                if (stChar[i] == stChar[j])
                    count[i]++;

            }
            karim.put(stChar[i], count[i]);

        }

        for (int value : karim.values()) {
            if (value > max)
                max = value;
            System.out.println(value);
        }//karim.containsValue(3
        System.out.println("this is the max " + max);
        for (Character key:karim.keySet()) {
            if(karim.get(key)==max){
                charMax=key;}
        }
        System.out.println(charMax);


    }
    public static char maximum_Occurring_character(String st){

        char[] stChar = st.toCharArray();
        HashMap<Character, Integer> karim = new HashMap<>();
        int max=0;
        char charMax=' ';
        int[] count = new int[stChar.length];
        for (int i = 0; i < stChar.length; i++) {
            for (int j = 0; j < stChar.length; j++) {
                if (stChar[i] == stChar[j])
                    count[i]++;
            }
            karim.put(stChar[i], count[i]);
        }
//        for (int value:karim.values()) {
//            if(value> max)
//                max=value;
//        }
//        System.out.println("this is the max "+max);
//        for (Character key:karim.keySet()) {
//            if(karim.get(key)==max){
//                charMax=key;}
//        }
        for(HashMap.Entry<Character, Integer> amar: karim.entrySet()){

            if(amar.getValue()> max)
                max=amar.getValue();
            if (amar.getKey()==max){
                charMax=amar.getKey();
            }
        }

        return charMax;
    }


        }




