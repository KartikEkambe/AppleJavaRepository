package switch_case;

import java.util.Scanner;

public class CalculatorSwitchEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println(" 1. Addition \n 2. Substraction \n 3. Multiplication \n 4. Division ");
		System.out.println("Enter your choice");
		int ch = sc.nextInt();

		switch (ch) {
		case 1:
			System.out.println("Enter two numbers for addition");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Addition is = " + (a + b));
			break;

		case 2:
			System.out.println("Enter two numbers for substraction");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Substraction is = " + (a - b));
			break;

		case 3:
			System.out.println("Enter two numbers for multiplication");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Multiplication is = " + (a * b));
			break;

		case 4:
			System.out.println("Enter two numbers for division");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Division is = " + (a / b));
			break;

		default:
			System.out.println("enter valid input");

		}
		sc.close();

	}

}
