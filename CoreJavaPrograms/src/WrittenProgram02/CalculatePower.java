package WrittenProgram02;

import java.util.Scanner;

public class CalculatePower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base, index, power = 1;
		System.out.println("Enter a base");
		base = sc.nextInt();
		System.out.println("Enter a index");
		index = sc.nextInt();

		for (int i = 1; i <= index; i++) {
			power = power * base;
		}
		System.out.println("Power of given number is : " + power);
		sc.close();

	}

}
