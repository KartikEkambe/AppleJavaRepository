package ifelse;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float marathi, hindi, english, math, sci;
		System.out.println("Enter obtained marks in marathi");
		marathi = sc.nextFloat();
		System.out.println("Enter obtained marks in hindi");
		hindi = sc.nextFloat();
		System.out.println("Enter obtained marks in english");
		english = sc.nextFloat();
		System.out.println("Enter obtained marks in math");
		math = sc.nextFloat();
		System.out.println("Enter obtained marks in sci");
		sci = sc.nextFloat();

		float total = marathi + hindi + english + math + sci;
		float per = total / 5;
		System.out.println("Percentage : " + per + " %");

		if (per >= 90) {
			System.out.println("A+ Grade ");
		} else if (per < 90 && per >= 80) {
			System.out.println("A Grade");
		} else if (per < 80 && per >= 60) {
			System.out.println("B Grade");
		} else if (per < 60 && per >= 50) {
			System.out.println("C Grade");
		} else if (per < 50 && per >= 35) {
			System.out.println("D Grade");
		} else {
			System.out.println("Fail !!!");
		}
		
		sc.close();

	}

}
