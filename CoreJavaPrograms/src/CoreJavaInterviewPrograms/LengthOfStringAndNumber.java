 package CoreJavaInterviewPrograms;

import java.util.Scanner;

public class LengthOfStringAndNumber {
	Scanner sc = new Scanner(System.in);

	public void LengthOfString() {

		String str;
		int count = 0;
		System.out.println("Enter a string");
		str = sc.nextLine();
		for (int i = str.length() - 1; i >= 0; i--) {
			count++;
		}

		System.out.println("Size of string is = " + count);

	}

	public void LengthOfNumber() {
		int num, count = 0;
		System.out.println("Enter a number");
		num = sc.nextInt();
		while (num != 0) {
			num = num / 10;
			count++;

		}

		System.out.println("Length of numbers is = " + count);
	}

	public static void main(String[] args) {
		LengthOfStringAndNumber l = new LengthOfStringAndNumber();
//		l.LengthOfString();
		l.LengthOfNumber();

	}

}
