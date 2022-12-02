package switch_case;

import java.util.Scanner;

public class OrderBillEx {

	public static void main(String[] args) {

		int item, quantity, total;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Maharashtrian Thali \n2.Punjabi Thali \n3.Rajasthani Thali \n4.South Indian Thali");
		System.out.println("Enter your choice");
		item = sc.nextInt();

		switch (item) {
		case 1:
			System.out.println("enter the number of maharashtrian thalis ");
			quantity = sc.nextInt();

			total = quantity * 250;
			System.out.println("Your total bill is : " + total);
			break;

		case 2:
			System.out.println("enter the number of punjabi thalis ");
			quantity = sc.nextInt();

			total = quantity * 350;
			System.out.println("Your total bill is : " + total);
			break;

		case 3:
			System.out.println("enter the number of rajasthani thalis ");
			quantity = sc.nextInt();

			total = quantity * 150;
			System.out.println("Your total bill is : " + total);
			break;

		case 4:
			System.out.println("enter the number of south indian thalis ");
			quantity = sc.nextInt();

			total = quantity * 199;
			System.out.println("Your total bill is : " + total);
			break;

		default:
			System.out.println("enter valid input");

		}

		sc.close();

	}

}
