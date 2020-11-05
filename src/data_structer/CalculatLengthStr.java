package data_structer;

public class CalculatLengthStr {
    public static void main(String[] args) {

/* Java program to count the length of a given string:
Write a method to count the number of characters (Length) in a given string.
Note: Avoid using the in-built method.
Input : "This is a test"
Expected Result :14
Input : "Ibrahim"
Expected Result : 7
Input : "T"
Expected Result : 1
Input : ""
Expected Result : 0
Input : null
Expected Result : null
*/

        String str = "T";
        System.out.println(caracterCount(str));


    }
    public static Integer caracterCount(String str){
        if (str ==null)return null;
        int leng = str.length();
        if (leng ==0)return 0;
        if (leng !=0)return leng;
        return leng;
    }
}
