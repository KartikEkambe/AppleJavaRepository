package while_dowhile;

import java.util.Scanner;

public class NumbersTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num, i = 1;
		num = sc.nextInt();
		while (i <= 10) {
			System.out.println(num * i);
			i++;
		}

		sc.close();

	}

}
