package while_dowhile;

import java.util.Scanner;

public class Palindrome {

	Scanner sc = new Scanner(System.in);

	void PalindromeNumber() {
		int num, rem, temp, rev = 0;
		System.out.println("Enter a number");
		num = sc.nextInt();
		temp = num;
		while (num != 0) {
			rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;
		}

		if (temp == rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}

	}

	void PalindromeString() {
		String str, rev = "";
		System.out.println("Enter a string");
		str = sc.nextLine();
		int i = str.length() - 1;
		while (i >= 0) {
			rev = rev + str.charAt(i);
			i--;
		}

		if (str.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome String");
		}
		else 
		{
			System.out.println("String Not a palindrome");
		}

	}

	public static void main(String[] args) {

		Palindrome p = new Palindrome();
//		p.PalindromeNumber();
		p.PalindromeString();
	}

}
