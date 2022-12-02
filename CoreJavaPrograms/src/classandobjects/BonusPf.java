package classandobjects;

import java.util.Scanner;

public class BonusPf {

	float bonuscalculator(float salary, char ch) {

		float newsalary;
		System.out.println("Original salary is : " + salary);

		if (ch == 'A' || ch == 'a') {
			newsalary = salary + (salary * 0.15f);

		} else if (ch == 'B' || ch == 'b') {
			newsalary = salary + (salary * 0.10f);

		} else if (ch == 'C' || ch == 'c') {
			newsalary = salary + (salary * 0.5f);

		} else {
			newsalary = salary;
		}
		
		System.out.println("Salary after adding bonus "+newsalary);

		return newsalary;
	}

	void pfcalculator(float salary) {
		float pf = salary * 0.10f;
		System.out.println("PF : " + pf);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a salary and rating(A/B/C/D) of the employee : ");
		int salary = sc.nextInt();
		char ch = sc.next().charAt(0);

		BonusPf bpc = new BonusPf();
		float newsal = bpc.bonuscalculator(salary, ch);
		bpc.pfcalculator(newsal);

	}

}
