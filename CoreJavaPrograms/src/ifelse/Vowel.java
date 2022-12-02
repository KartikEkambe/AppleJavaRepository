package ifelse;

import java.util.*;

public class Vowel {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter a character");
		ch = sc.next().charAt(0);
		if (ch == 'A' || ch == 'a') {
			System.out.println("Its Vowel");
		} else if (ch == 'E' || ch == 'e') {
			System.out.println("Its Vowel");
		} else if (ch == 'i' || ch == 'I') {
			System.out.println("Its Vowel");
		} else if (ch == 'o' || ch == 'O') {
			System.out.println("Its Vowel");
		} else if (ch == 'u' || ch == 'U') {
			System.out.println("Its Vowel");
		} else {
			System.out.println("Consonant");
			System.out.println("Pls enter a Vowel character");
		}
		
		sc.close();

	}

}
