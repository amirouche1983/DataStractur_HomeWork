package homeWork;

public class StringCount {
    /* How do you count a number of words in String: ex: str = "Java is great" => 3
     interview Q :
     What are the advantages of the Test Automation Framework?
             2) . What is the difference between “/” and “//”
             3) write a query with Like and AND
 */
    public static void main(String[] args) {
        String str = "Java is great i love it";
        System.out.println(countWordUsinSPLT(str));

    }

    public static int countWordUsinSPLT(String str) {
        String[] strArray = str.split(" ");
        return strArray.length;
    }

//    public static int wordCount(String str) {
//        str = "Java is great";
//        if (str.length() == 0) return 0;
//        int counter = 0;
//        char[] strChar = str.toCharArray();
//        int i = 0;
//        int j = 0;
//        for (i = 0; i < str.length(); i++) {
//            counter = 0;
//            for (j=0; j< strChar.length ; j++){
//                if(strChar[j] == )
//            }
//
//        }
//
//
//        return count;
//    }
    /*
     int i = 0;
        int num = 0;
        String prime = "";
        for (i = 2; i <= 40; i++) {
            int counter = 0;
            for (num = i; num >=1; num--) {
                if (i % num == 0) {
                    counter ++;
                }
            }
            if (counter == 2) {
                prime = prime + i + " ";
                }
            }
        System.out.print("prime numbers from 2 up to 40 are :");
        System.out.println(prime);
    }
     */

}
