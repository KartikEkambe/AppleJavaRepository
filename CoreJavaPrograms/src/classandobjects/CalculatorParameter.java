package classandobjects;

import java.util.Scanner;

public class CalculatorParameter {

	void add(int a, float b) {
		System.out.println("Addition is : " + (a + b));
	}

	void sub(int a, int b) {
		System.out.println("Substraction is : " + (a - b));
	}

	void mul(int a, int b) {
		System.out.println("Multiplication is : " + (a * b));
	}

	void div(int a, int b) {
		System.out.println("Division is : " + (a / b));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Enter a tow numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();

		CalculatorParameter c = new CalculatorParameter();
		c.add(a, b);
		c.sub(a, b);
		c.mul(a, b);
		c.div(a, b);

	}

}
