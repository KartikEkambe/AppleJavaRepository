package forloop;

import java.util.Scanner;

public class HarshadNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, temp, sum = 0, rem = 0;
		System.out.println("Enter a number");
		num = sc.nextInt();
		temp = num;
		while (num != 0) {
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}

		if (temp % sum == 0) {
			System.out.println("Its harshad number");
		} else {
			System.out.println("Its not a harshad number");
		}

		sc.close();

	}

}
