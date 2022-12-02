package switch_case;

import java.util.Scanner;

public class LeapYearSwitchCase {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a month and year");
		int month = sc.nextInt();
		int year = sc.nextInt();
		switch (month) {
		case 1:

		case 3:

		case 5:

		case 7:

		case 8:

		case 10:

		case 12:
			System.out.println("31 days");
			break;

		case 4:

		case 6:

		case 11:

		case 9:
			System.out.println("30 days");
			break;

		case 2:
			if (year % 4 == 0) {
				System.out.println("29 days");
			} else {
				System.out.println("28 days");
			}
			break;

		default:

			System.out.println("Enter valid input");

			sc.close();
		}

	}

}
