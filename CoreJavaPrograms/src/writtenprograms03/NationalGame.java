package writtenprograms03;

import java.util.Scanner;

public class NationalGame {
	
	void game(String country ) {
		
		switch(country) {
		case "India": 
			System.out.println("National Game of India is Hockey");
			break;
		case "india": 
			System.out.println("National Game of India is Hockey");
			break;
		case "China":
			System.out.println("National Game of China is Table Tennis");
			break;
		case "china":
			System.out.println("National Game of China is Table Tennis");
			break;
		case "Bangladesh":
			System.out.println("National Game of Bangladesh is  Kabaddi");
			break;
		case "bangladesh":
			System.out.println("National Game of Bangladesh is  Kabaddi");
			break;
		case "Italy":
			System.out.println("National Game of Italy is Football ");
			break;
		case "italy":
			System.out.println("National Game of Italy is Football ");
			break;
			
		case "United States":
			System.out.println("National Game of United States is Baseball ");
			break;
		case "united states":
			System.out.println("National Game of United States is Baseball ");
			break;
			
			default:
				System.out.println("Please enter valid input");
		
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.India, 2.China, 3.Bangladesh, 4.Italy, 5.United States");
		System.out.println("Enter the Country name to know theire national game");
		String str=sc.nextLine();
		
		NationalGame g=new NationalGame();
		g.game(str);


	}

}
