package forloop;

import java.util.Scanner;

public class PowerEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base, power,p=1;
		System.out.println("Enter a base number");
		base = sc.nextInt();
		System.out.println("Enter a power of base");
		power = sc.nextInt();

		for (int i = 1; i <= power; i++) {
			p = p * base;
		}
		System.out.println(p);

		sc.close();

	}

}
