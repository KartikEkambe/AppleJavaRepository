package switch_case;

import java.util.Scanner;

public class StateCapitalEx {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a state ");
		String state = sc.nextLine();
		state = state.toLowerCase();

		switch (state) {
		case "maharashtra":
			System.out.println("Capital is Mumbai");
			break;

		case "goa":
			System.out.println("Capital is Panji");
			break;

		case "gujrat":
			System.out.println("Capital is Gandhinagar");
			break;

		case "telangana":
			System.out.println("Capital is Hyderabad");
			break;

		case "jammu and kashmir":
			System.out.println("Capital is Shrinagar");
			break;

		case "karnataka":
			System.out.println("Capital is Bengaluru");
			break;

		default:
			System.out.println("Enter a valid input state");
			
			sc.close();
		}

	}

}
