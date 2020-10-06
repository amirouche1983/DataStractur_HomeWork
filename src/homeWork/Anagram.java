package homeWork;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        System.out.print(Anag("Army","Mary"));
    }
    public static  boolean Anag (String a, String b){
        if (a.length() != b.length())return false;
        char [] c = a.toLowerCase().toCharArray();
        Arrays.sort(c);
        char [] d = b.toLowerCase().toCharArray();
        Arrays.sort(d);
        for(int i = 0; i<c.length; i++){
            if (c[i] != d[i]) {
                return false;
            }
        }return true;
    }
}
