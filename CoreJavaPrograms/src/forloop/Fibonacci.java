package forloop;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, a = 0, b = 1;
		System.out.println("Enter a number");
		num = sc.nextInt();

		for (int i = 0; i <= num; i++) {
			System.out.print( a+" ");
			b = a + b;
			a = b - a;
		}
		sc.close();

	}

}
