package homeWork;

import java.util.ArrayList;

public class PermutationStr {
    /*
    How to print all permutation of a String: Ex: "123" (3!)è "123", "132", "213", "231", "312" and "321".
Q2. What are the various access specifiers for Java classes?
3. What's the purpose of Static methods and static variables?
     */
    /*
      Escape Sequence             Description
              \t --->	Inserts a tab in the text at this point.
              \b --->	Inserts a backspace in the text at this point.
              \n --->	Inserts a newline in the text at this point.
              \r --->   Inserts a carriage return in the text at this point.
              \f --->   Inserts a form feed in the text at this point.
              \' --->   Inserts a single quote character in the text at this point.
               \"--->  	Inserts a double quote character in the text at this point.
               \\--->   Inserts a backslash character in the text at this point.

     */
    public static void main(String[] args) {

        String str = "amor";
       // str= "abc";
        System.out.println("Permutations of string are :");
        System.out.println("thi is the list\n"+returnPermutation(str));
        //printArrayList(returnPermutation(str));
        printPermutn(str, "");
    }

    public static ArrayList<String> returnPermutation(String str) {
        if (str.length() == 0) {
            ArrayList<String> isEmpty = new ArrayList<>();
            isEmpty.add("");
            return isEmpty;
        }
        char charWord = str.charAt(0);
        String subWord = str.substring(1);
        //recursion
        ArrayList<String> lastStr = returnPermutation(subWord);
        ArrayList<String> newStr = new ArrayList<>();
        for (String elem : lastStr) {
            for (int i = 0; i <= elem.length(); i++) {
                newStr.add(elem.substring(0, i) + charWord + elem.substring(i));
            }
        }
        return newStr;
    }
   public static void printPermutn(String str, String newString) {
// If string str is empty it will print
       if (str.length() == 0) {
           System.out.println("the permut is " + newString + " ");
           return;
       }
       for (int i = 0; i < str.length(); i++) {
// ith character of str
           char ch = str.charAt(i); // 1
// Rest of the string after excluding the ith character
           String RestOfString = str.substring(0, i) + str.substring(i + 1); // 23
// Recurvise call method printPermutn(RestOfString, newString + ch) --->printPermutn(String str, String newString)
           printPermutn(RestOfString, newString + ch); // 23
       }
   }
}
