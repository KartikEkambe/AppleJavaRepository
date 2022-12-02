package forloop;

import java.util.Scanner;

public class ArmstrongUsingFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, temp, sum = 0, cnt = 0;
		System.out.println("Enter a number");
		num = sc.nextInt();
		temp = num;
		for (int i = 1; temp != 0; i++) {
			cnt++;
			temp = temp / 10;
		}
//		System.out.println(cnt);

		temp = num;
		for (int i = 1; temp != 0; i++) {
			int power = 1;
			int r = temp % 10;
			for (int j = 1; j <= cnt; j++) {
				power = power * r;
			}
			sum = sum + power;
			temp = temp / 10;
		}

		if (num == sum)
			System.out.println("Armstrong number");
		else
			System.out.println("Not a armstrong number");
		
		sc.close();

	}

}
