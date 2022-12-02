 package WrittenProgram02;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		int num, square = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			square = i * i;
			System.out.println(i + " Sqaure is : " + square);
		}

		sc.close();

	}

}
