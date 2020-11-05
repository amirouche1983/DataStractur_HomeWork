package homeWork;

public class RevStEncap {
    public static void main(String[] args) {
        ReverseStrUsinRecursion obj = new ReverseStrUsinRecursion();

        System.out.println( obj.reverse_String("karim",""));
        //System.out.println( ReverseStrUsinRecursion.reverse_String("karim",""));
String word = "madab";
        String word1 = "madabbsfry";
        for(int i=0, j=0;i<word.length();i++,j++){
            if(word1.charAt(i)==word1.charAt(j)) {
                System.out.println(word + " is a subString");
            }else {
                System.out.println(word + " is not a subString");
            }
        }
        for(int i=0, j=word.length()-1;i<word.length() && j>=0;i++,j--){
if(word.charAt(i)==word.charAt(j)) {
    System.out.println(word + " is a palendrom");
}else {
    System.out.println(word + " is not a palendrom");
}
        }
    }

}
