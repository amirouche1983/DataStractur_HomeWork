package homeWork;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RmChFSt {
 static String str;
    public static String Remove_Char_From_String(){
    System.out.println("Enter a string :");
    Scanner scan = new Scanner(System.in);
    str = scan.nextLine();
    StringBuilder strBuild = new StringBuilder();
    for (int i = 0; i< str.length(); i++){
        if( str.charAt(i)==0 || str==null )return null;
        if (str.toLowerCase().charAt(i) !='b')
            strBuild.append(str.charAt(i));

    } return String.valueOf(strBuild);
}
    public static void main(String[] args) {
        System.out.println(Remove_Char_From_String());
    }

}
