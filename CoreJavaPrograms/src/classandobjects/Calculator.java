package classandobjects;

import java.util.Scanner;

public class Calculator {

	void add() {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Enter two numbers for addition");
		a = sc.nextInt();
		b = sc.nextInt();

		System.out.println("Addtion is : " + (a + b));

	}

	void sub() {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Enter two numbers for substraction");
		a = sc.nextInt();
		b = sc.nextInt();

		System.out.println("Substraction is : " + (a - b));

	}

	void mul() {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Enter two numbers for multiplication");
		a = sc.nextInt();
		b = sc.nextInt();

		System.out.println("Multiplication is : " + (a * b));

	}

	void div() {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Enter two numbers for division");
		a = sc.nextInt();
		b = sc.nextInt();

		System.out.println("Division is : " + (a / b));
		sc.close();
	}

	public static void main(String[] args) {

		Calculator c = new Calculator();
		c.add();
		c.sub();
		Calculator c1 = new Calculator();
		c1.mul();
		c1.div();

	}

}
