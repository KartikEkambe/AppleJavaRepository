package while_dowhile;

import java.util.Scanner;

public class CalculatorEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b;
		char ch;
		
		
		do {
			System.out.println(" 1. Addition \n 2. Substraction \n 3. Multiplication \n 4. Division ");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();

		switch (choice) {
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
		
	    System.out.println("Do you want to continue ??? (y/n) : ");
	    ch=sc.next().charAt(0);
		}
		while(ch=='y'||ch=='Y');
		
		
		sc.close();




	}

}
