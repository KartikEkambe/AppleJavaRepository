package writtenString08;

import java.util.Arrays;
import java.util.Scanner;

public class StringEncrypt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String");
		String str = sc.nextLine();
		String s = str.toUpperCase();
		String s1[] = s.split(" ");

		System.out.println(Arrays.toString(s1));

		for (int i = 0; i < s1.length; i++) {
			int sum = 0;
			char ch[] = s1[i].toCharArray();
			for (int j = 0; j < ch.length; j++) {
				int a = ch[j] - 64;
				sum = sum + a;
			}
			System.out.println(s1[i] + " = " + sum );
		}

	}

}
