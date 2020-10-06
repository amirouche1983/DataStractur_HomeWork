package homeWork;

public class StringSubstringMethodVariants {
    /*
    There are two ways we can use the substring() method –

1. When we pass only the starting index:
 String substring(int beginIndex)
 Returns the substring starting from the specified index i.
 e beginIndex and extends to the character present at the end of the string.
 For example – "Chaitanya".substring(2) would return "aitanya".
 The beginIndex is inclusive, that is why the character present at the index 2 is included in the substring.
 This method throws IndexOutOfBoundsException If the beginIndex is less than zero
 or greater than the length of String (beginIndex<0||> length of String).

 2. When we pass both the indexes, starting index and end index:

String substring(int beginIndex, int endIndex)
Returns a new string that is a substring of this string.
The substring begins at the specified beginIndex and extends to the character at index endIndex – 1.
Thus the length of the substring is endIndex-beginIndex.
 In other words you can say that beginIndex is inclusive and endIndex is exclusive while getting the substring.

For example – "Chaitanya".substring(2,5) would return "ait".
 It throws IndexOutOfBoundsException If the beginIndex is less than zero OR beginIndex >
  endIndex OR endIndex is greater than the length of String.
     */
    public static void main(String[] args) {
        String str= new String("quick brown fox jumps over the lazy dog");
        //1. When we pass only the starting index:
        System.out.println("Substring starting from index 16:");
        System.out.println(str.substring(16));
        //2. When we pass both the indexes, starting index and end index
        System.out.println("Substring starting from index 16 and ending at 21:");
        System.out.println(str.substring(16, 21));
        String word = "Substring";
        System.out.println("substring starts from index 1: \n"+word.substring(0));
        System.out.println("substring starts from index 1 and ends at index 5:\n "+word.substring(1,5));
        System.out.println(word.charAt(5));
    }
}
