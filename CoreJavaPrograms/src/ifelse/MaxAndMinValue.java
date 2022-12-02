package ifelse;

import java.util.Scanner;

public class MaxAndMinValue {

	public static void main(String[] args) {
		int a, b, c, d, max = 0, min = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 4 values");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();

		if (a > b && a > c && a > d) {
			max = a;
		} else if (b > a && b > c && b > d) {
			max = b;
		} else if (c > a && c > b && c > d) {
			max = c;
		} else  {
			max = d;
		} 
		
		System.out.println("Max value is = " + max);
		

		if (a < b && a < c && a < d) {
			min = a;
		} else if (b < a && b < c && b < d) {
			min = b;
		} else if (c < a && c < b && c < d) {
			min = c;
		} else  {
			min = d;
		} 

		
		System.out.println("Min value is = " + min);

		sc.close();
	}

}
