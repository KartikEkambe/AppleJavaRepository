package classandobjects;

import java.util.Scanner;

public class EmployeePF {

	int id, salary;
	String name, dept, contact;
	char rating;
	float bonus, pf;

	void setData(int i, String n, String d, int s, String c, char r) {
		id = i;
		name = n;
		dept = d;
		salary = s;
		contact = c;
		rating = r;

	}

	void bonus() {

		if (rating == 'A' || rating == 'a') {
			bonus = salary * 0.15f;
		} else if (rating == 'B' || rating == 'b') {
			bonus = salary * 0.10f;
		} else if (rating == 'C' || rating == 'c') {
			bonus = salary * 0.05f;
		} else {
			bonus = salary;
		}

	}

	void pf() {
		pf = salary * 0.10f;

	}

	void display() {

//		System.out.println(id + " " + name + " " + dept + " " + salary + " " + contact + " "+rating+" " );
		System.out.println("Employee bonus is : " + bonus);
		System.out.println("Employees pf is : " + pf);

	}

	public String toString() {
		return id + " " + name + " " + dept + " " + salary + " " + contact + " " + rating;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int eid, salary;
		String ename, dept, contact;
		char erating;

		System.out.println("Enter the employee id");
		eid = sc.nextInt();
		System.out.println("Enter employee name");
		ename = sc.next();
		System.out.println("Enter employee department");
		dept = sc.next();
		System.out.println("Enter employee salary");
		salary = sc.nextInt();
		System.out.println("Enter employee contact");
		contact = sc.next();
		System.out.println("Enter employee rating A, B , C and D");
		erating = sc.next().charAt(0);

		EmployeePF e = new EmployeePF();
		e.setData(eid, ename, dept, salary, contact, erating);
		e.bonus();
		e.pf();
		System.out.println(e);
		e.display();

	}

}