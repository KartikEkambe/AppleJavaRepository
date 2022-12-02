package WrittenProgram02;

import java.util.Scanner;

public class FrequencyOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, d, frequency = 0;
		System.out.println("Enter a number");
		num = sc.nextInt();
		System.out.println("Enter input digit to check frequency");
		d = sc.nextInt();

		/*
		 * for(int i=1;num!=0;i++) { if(num%10==d) { frequency++; } num=num/10; }
		 */

		while (num != 0) {
			if (num % 10 == d) {
				frequency++;

			}
			num = num / 10;
		}

		System.out.println("Frequency of Digit is : " + frequency);

		sc.close();
	}

}
