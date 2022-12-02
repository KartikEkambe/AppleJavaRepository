package WrittenProgram02;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, product = 1, rem;

		System.out.println("Enter a number");
		num = sc.nextInt();

		while (num != 0) {
			rem = num % 10;
			product = product * rem;
			num = num / 10;

		}

		System.out.println("Product of digit is : " + product);

		sc.close();

	}

}
