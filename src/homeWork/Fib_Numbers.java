package homeWork;

import java.util.Scanner;

public class Fib_Numbers {
//    static void printArrayList(ArrayList<String> elem) {
//        elem.remove("");
//        for (int i = 0; i < elem.size(); i++)
//            System.out.print(elem.get(i)+"\t");
//    }
	public static void fib() {
		int a = 0;
		int b = 1;
		int sum;
		
		for (int n = 0; n <= 15; n++) {
			System.out.print(a + " ");
			sum = a + b;
			a = b;
			b = sum;
			
		}
		
	}
	
	public static int fib(int N[]) {
		int n;
		Scanner sc1 = new Scanner(System.in);
		System.out.print("\nEnter the number n: ");
		n = sc1.nextInt();
		if (n == 0) return 0;
		if (n == 1) return 1;
		int a = 0;
		int b = 1;
		
		int sum = a + b;
		
		
		while (n > 1) {

				sum = a + b;
				a = b;
				b = sum ;	
				
			
			n--;
		}
		
		return sum;
	}
	public static int fibNumb(int N[]) {
		int sum = 3;
		//recursion
		return sum;
	}
	
	 
	public static void main(String[] args) {
		fib();
	int	N1[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
		System.out.println(fib(N1));
	}

}
