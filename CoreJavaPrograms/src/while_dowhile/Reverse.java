package while_dowhile;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int i = 1, limit;
//		System.out.println("Enter a limit");
//		limit = sc.nextInt();
//		while (limit >= i) {
//			System.out.println(limit);
//			limit--;
//		}

		int num, rev = 0, rem;
		System.out.println("Enter a number");
		num = sc.nextInt();

		while (num != 0) {
			rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;
		}

		System.out.println("Reverse of given number is " + rev);

		sc.close();

	}

}
