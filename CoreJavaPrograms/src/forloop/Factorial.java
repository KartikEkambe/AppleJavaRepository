package forloop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num, fact = 1;
		System.out.println("Enter a number");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
//			if(num%i==0) {
//				
//			}
			fact = fact * i;


			System.out.println("Factorial is : " + fact);
		}

	}

}
