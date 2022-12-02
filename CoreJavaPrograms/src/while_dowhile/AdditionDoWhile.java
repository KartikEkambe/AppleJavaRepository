package while_dowhile;

import java.util.Scanner;

public class AdditionDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b;
		char ch;
		do {
			System.out.println("enter the values of a & b");
			a = sc.nextInt();
			b = sc.nextInt();

			System.out.println("Addition is : " + (a + b));
			System.out.println("Do you want to continue???(y/n) :");
			ch = sc.next().charAt(0);

		} while (ch == 'y' || ch == 'Y');

		sc.close();
	}

}
