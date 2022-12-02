package constructor;

import java.util.Scanner;

public class Employee {

	int id, salary;
	String name, dept;
	float pf;

	Employee() {
		id = 101;
		name = "Vaibhav";
		dept = "Development";
		salary = 24500;
		pf = 1845f;
	}


	Employee(int i, String n, String d, int s, float pff) {
		id = i;
		name = n;
		dept = d;
		salary = s;
		pf = pff;

	}

	Employee(String d, int s, float pff) {
		dept = d;
		salary = s;
		pf = pff;
	}

	public String toString() {
		
		return id + " " + name + " " + dept + " " + salary + " " + pf;
	}

	void display() {
		
		System.out.println(id + " " + name + " " + dept + " " + salary + " " + pf);
	}

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.display();
		System.out.println("---- --------------------------\n");

		Scanner sc = new Scanner(System.in);
		int eid, esal, epf;
		String ename, edept;
		System.out.println("Enter employees Id, Name, Department, Salary and pf");
		eid = sc.nextInt();
		ename = sc.next();
		edept = sc.next();
		esal = sc.nextInt();
		epf = sc.nextInt();
		Employee e = new Employee(eid, ename, edept, esal, epf);
		System.out.println(e);

		System.out.println("-----------------------------------------------\n");
		
		Employee e2 = new Employee(edept, esal, epf);
		e2.display();
	}

}
