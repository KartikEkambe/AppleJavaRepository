package CoreJavaInterviewPrograms;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x, y;
		System.out.println("Enter x value");
		x = sc.nextInt();

		System.out.println("Enter y value");
		y = sc.nextInt();

		System.out.println("Before swapping Number : X = " + x + " and Y = " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swapping Numbers : X = " + x + " and Y = " + y);

	}

}
