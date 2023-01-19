package enumClass;

import java.util.Scanner;

public class WeekDaysMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char ch;
		do {
			System.out.println(
					" 1. View Monday  \n 2. View Tuesday \n 3. View Wednesday \n 4. View Thursday  \n 5. View Friday \n 6. View Saturday \n 7. View Sunday");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				WeekDays m = WeekDays.MONDAY;
				System.out.println(m);
				break;

			case 2:
				WeekDays t = WeekDays.TUESDAY;
				System.out.println(t);
				break;
			case 3:
				WeekDays w = WeekDays.WEDNESDAY;
				System.out.println(w);
				break;
			case 4:
				WeekDays th = WeekDays.THURSDAY;
				System.out.println(th);
				break;

			case 5:
				WeekDays f = WeekDays.FRIDAY;
				System.out.println(f);
				break;

			case 6:
				WeekDays s = WeekDays.SATURDAY;
				System.out.println(s);
				break;
			case 7:
				WeekDays sun = WeekDays.SUNDAY;
				System.out.println(sun);
				break;

			default:
				System.out.println("Please enter valid input");

			}
			System.out.println("Do you want to continue : (y/n)");
			ch = sc.next().charAt(0);

		} while (ch == 'y' || ch == 'Y');

	}

}
