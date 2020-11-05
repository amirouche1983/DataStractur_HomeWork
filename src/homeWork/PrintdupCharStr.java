package homeWork;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintdupCharStr {
    /*
    How to print the duplicate characters from the given String
Ex: string = "abcdac1561h5h0n0n";      à prints:  [a, c, 1, 5, h, 0, n]

     */
    public static void main(String[] args) {
        String str = "aabcdaaaac1561h5h0n0n";
        System.out.println(duplicateChar(str));
    }

    public static Set<Character> duplicateChar(String str) {
        if (str == null) return null;
        char[] strChar = str.toLowerCase().toCharArray();
        int i;
        Set<Character> dupstr1Char = new LinkedHashSet<>();
        Set<Character> dupstr2Char = new LinkedHashSet<>();
        for (i = 0; i < strChar.length; i++) {
            if (!dupstr1Char.add(strChar[i])) {
                dupstr2Char.add(strChar[i]);
            }
        }
        return dupstr2Char;
    }
}
