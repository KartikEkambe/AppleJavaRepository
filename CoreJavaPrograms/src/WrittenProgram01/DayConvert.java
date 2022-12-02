package WrittenProgram01;

import java.util.Scanner;

public class DayConvert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nod, year, week, day;
		System.out.println("Enter number of days");
		nod = sc.nextInt();

		year = nod / 365;
		nod = nod % 365;
		System.out.println("Number of years : " + year);

		week = nod / 7;
		nod = nod % 7;
		System.out.println("Number of weeks :" + week);

		day = nod;
		System.out.println("number of days : " + day);
		
		sc.close();
	}

}
