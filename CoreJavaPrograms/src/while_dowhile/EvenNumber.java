package while_dowhile;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1,limit;
		System.out.println("Enter a number");
		limit=sc.nextInt();

		while (num <= limit) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
			num++;

		}
		
		sc.close();

	}

}
