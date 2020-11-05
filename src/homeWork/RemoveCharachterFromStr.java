package homeWork;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveCharachterFromStr {
    /*
Java program to remove duplicates characters from a given string:
Write a method to remove all duplicates characters in a given string.
Note: Avoid using the in-built method.
Note: using the in-built method.
Input : This is a test
Expected Result : this ae
Input : Replace all spaces
Expected Result : replac s
Input : This
Expected Result : This
Input : [Empty]
Expected Result : null
Input : null
Expected Result : null
*/
    public static void main(String[] args) {
        String str = null;
        System.out.println(remChatFStrUsinForLoop(str));
        System.out.println("****************************");
        System.out.println(remChatFStrUsinForLoop(str));
    }

    public static String remChatFStrUsinForLoop(String str) {
        if(str == null)return null;
        if (str.length() == 0) return null;
        int i, j;
        int leng = str.length();
        char[] strChar = str.toLowerCase().toCharArray();
        char[] remStrChar = new char[leng];
        for (i = 0; i < leng; i++) {
            for (j = 0; j < i; j++) {
                if (strChar[i] == remStrChar[j]) break;
            }
            if (i == j) {
                remStrChar[i] = strChar[i];
            }
        }
       String remvedStrDup = new String(remStrChar);
        return remvedStrDup;
    }
    public static String remChatFStrUsingInbuilt(String str){
        if(str == null)return null;
        if (str.length() == 0) return null;
      char [] strChar = str.toCharArray();
        Set<Character> remStrChar = new HashSet<>();
        for (int i =0; i<strChar.length;i++){
            remStrChar.add(strChar[i]);
        }
        String remStrDup = (String.valueOf(remStrChar));
      return remStrDup;
    }
    public static String remove_duplicats (String Instring){
        if(Instring ==null){return null;}
        String str="";
        int i,j;
        for(i=0;i<Instring.length(); i++){
            for(j=0;j<i;j++){
                if(Instring.toLowerCase().charAt(j)==Instring.toLowerCase().charAt(i)){ break;}
            }
            if(j==i){str=str+Instring.charAt(j);}
        }
        return str;
    }
    //Method N02:
    public static String remove_Duplicates(String Instring){
        if(Instring == null){return null;}
        String str="";
// I will us a LinkedHasSet beacaus it's kepes the input ordere
        char [] InstingArray =Instring.toLowerCase().toCharArray();
        Set <Character> InstringSet =new LinkedHashSet<>();
        for(char InChar : InstingArray){
// System.out.println(InstringSet.add(InChar));
            if(InstringSet.add(InChar)){str=str+InChar;}
        }
        return str;
    }
}

