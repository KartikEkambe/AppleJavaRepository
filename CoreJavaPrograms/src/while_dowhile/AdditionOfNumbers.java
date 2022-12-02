package while_dowhile;

import java.util.Scanner;

public class AdditionOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int limit, i = 1, sum = 0, product = 1, sumodd = 0, cnt = 0;

		System.out.println("enter the limit");
		limit = sc.nextInt();

//		while(i<=limit) {
//			if(i%2==0) {
//				sum=sum+i;
//			}
//			else {
//				sumodd=sumodd+i;
//			}
//			i++;
//		}
//		System.out.println("Sum of even number is "+sum);
//		System.out.println("Sum of odd number is "+sumodd);

		i = 1;
		while (i <= limit) {
			product = product * i;
			i++;
		}
		System.out.println("product is : " + product);

		i = 1;
		while (i <= limit) {
			cnt++;
			limit = limit / 10;
		}
		System.out.println(cnt);

		sc.close();

	}

}
