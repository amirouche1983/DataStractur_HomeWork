package homeWork;

public class PrimeNumbers {
    public static void main(String[] args) {

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
}

