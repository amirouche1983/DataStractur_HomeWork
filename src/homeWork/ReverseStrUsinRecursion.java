package homeWork;


import static java.lang.Long.reverse;

public class ReverseStrUsinRecursion {
    public static String newString="";
    public static int j=1;
    public static void main(String[] args) {
        String str = "amirouche";
       // System.out.println(reverse_String( str, newString));
        revesedStrUsingStBufer(str);
        System.out.println("revers String using recursion: " + ReversStrUsingRecursion(str));

    }

    public static String ReversStrUsingRecursion(String str) {
            int i = str.length();
            if(i==0)return "the String is Empty";

                if (i <2) {
                    return str;
                } else {
                    return ReversStrUsingRecursion(str.substring(1))+ str.charAt(0);
                }
            }

    public static void revesedStrUsingStBufer(String str) {
        String reverseStr = new StringBuffer(str).reverse().toString();
        System.out.println("revers String using StringBufer: " + reverseStr);


    }
    public  String reverse_String( String str,String newString){

        if (newString.length()==str.length()) return newString;
        newString = newString + str.charAt(str.length()-j);
        j++;
        return reverse_String(str , newString);



    }
}
