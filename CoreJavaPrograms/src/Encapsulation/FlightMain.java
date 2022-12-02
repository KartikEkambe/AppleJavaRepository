package Encapsulation;

import java.util.Scanner;

public class FlightMain {

	public static void main(String[] args) {
		Flight f = new Flight();
		Scanner sc = new Scanner(System.in);
		int id, ticketRate = 0;
		String companyName, source, destination;
		char fclass;
		System.out.println("Enter flight id");
		id = sc.nextInt();
		System.out.println("Enter flight company name");
		companyName = sc.next();
		System.out.println("Enter the source");
		source = sc.next();
		System.out.println("Enter the destination");
		destination = sc.next();
		System.out.println("Enter the class  A/B/C/D");
		fclass = sc.next().charAt(0);

		f.setId(id);
		f.setCompany(companyName);
		f.setSource(source);
		f.setDestination(destination);
		f.setFlightclass(fclass);

		if (fclass == 'A') {
			ticketRate = 50000;
		} else if (fclass == 'B') {
			ticketRate = 40000;
		} else if (fclass == 'C') {
			ticketRate = 30000;
		} else if (fclass == 'D') {
			ticketRate = 20000;
		} else {
			System.out.println("plese enter valid class input");
		}

		System.out.println("\n"+f.getId() + " " + f.getCompany() + " " + f.getSource() + " " + f.getDestination() + " "
				+ f.getFlightclass() + " " + ticketRate);

	}

}
