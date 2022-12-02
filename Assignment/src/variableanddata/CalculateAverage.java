package variableanddata;

import java.util.Scanner;

public class CalculateAverage {

	public static void main(String[] args) {
		float marathi, hindi, english, math, sci;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter marks of marathi");
		marathi = sc.nextFloat();
		
		System.out.println("Enter marks of hindi");
		hindi = sc.nextFloat();
		
		System.out.println("Enter marks of english");
		english = sc.nextFloat();

		System.out.println("Enter marks of math");
		math = sc.nextFloat();

		System.out.println("Enter marks of science");
		sci = sc.nextFloat();

		float per = (marathi + english + hindi + math + sci) / 5;

		System.out.println("Percentage = " + per + "%");
		
		sc.close();

	}

}
