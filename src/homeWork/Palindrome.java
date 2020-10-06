package homeWork;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String str;
//		str = "MoM";
//		str = "Madam";
//		str = "Army";
//		str = "02022020";
		for (int i = 0; i < 4; i++){
			System.out.println("Enter a word or a string :");
		Scanner strscan = new Scanner(System.in);
		str = strscan.nextLine();
			System.out.println((str) + " is a palindrome  " +checkPalindrom(str));
	}

	}
	public static boolean checkPalindrom(String str) {
		boolean status = true;
		char []word = str.toLowerCase().toCharArray();
		
		int i1 = 0;
		int i2 = word.length-1;
		while (i2 > i1) {
			
			if (word[i1] != word[i2]) {
				status = false;
			}
			++i1;
			--i2;
		}
		return status;
	}

}
