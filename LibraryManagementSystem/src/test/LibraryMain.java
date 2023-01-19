package test;

import java.util.Scanner;

import dao.Library;

public class LibraryMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Library lib = new Library();
		char ch;
		do {
			System.out.println(
					"1. View All Books \n2. Issue Book \n3. Return Book \n4. Search Book \n5. Check Book Issue Details");
			System.out.println("Enter your choice : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				lib.viewBook();
				break;
			case 2:
				lib.issueBook();
				break;
			case 3:
				lib.returnBook();
				break;
			case 4:
				lib.availabilityBook();
				break;
			case 5:
				lib.bookIssueDetails();
				break;
			default:
				System.out.println("Enter valid input ?");
			}

			System.out.println("Do you want to continue :(y/n)");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
	}

}
