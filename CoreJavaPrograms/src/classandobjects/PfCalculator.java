package classandobjects;

import java.util.Scanner;

public class PfCalculator {

	void pfcalculator(int salary) {
		int pf = (salary * 15) / 100;

		System.out.println("The pf is : " + pf);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a salary");
		int s = sc.nextInt();
		PfCalculator p = new PfCalculator();
		p.pfcalculator(s);

	}

}
