package classandobjects;

import java.util.Scanner;

//id,name,dept,salary,contact,email

public class Employee {

	int id, salary;
	String name, dept, contact, email;

	void setData(int i, String n, String d, int s, String c, String e) {
		id = i;
		name = n;
		dept = d;
		salary = s;
		contact = c;
		email = e;
	}

	void display() {

		System.out.println(id + " " + name + " " + dept + " " + salary + " " + contact + " " + email);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int eid, salary;
		String ename, dept, contact, email;
		
		
		System.out.println("Enter the number of employees");
		int emp=sc.nextInt();
		
		for(int i=1;i<=emp;i++) {
			System.out.println("Set data for "+i+" employee");
			
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
			System.out.println("Enter employee email");
			email = sc.next();
			
			Employee e=new Employee();
			e.setData(i, ename, dept, salary, contact, email);
			e.display();

		}
		
		
		
		
		
//		System.out.println("Enter the employee id");
//		eid = sc.nextInt();
//		System.out.println("Enter employee name");
//		ename = sc.next();
//		System.out.println("Enter employee department");
//		dept = sc.next();
//		System.out.println("Enter employee salary");
//		salary = sc.nextInt();
//		System.out.println("Enter employee contact");
//		contact = sc.next();
//		System.out.println("Enter employee email");
//		email = sc.next();
//
//		Employee e1 = new Employee();
//		e1.setData(eid, ename, dept, salary, contact, email);
//		
//		System.out.println("Enter the employee id");
//		eid = sc.nextInt();
//		System.out.println("Enter employee name");
//		ename = sc.next();
//		System.out.println("Enter employee department");
//		dept = sc.next();
//		System.out.println("Enter employee salary");
//		salary = sc.nextInt();
//		System.out.println("Enter employee contact");
//		contact = sc.next();
//		System.out.println("Enter employee email");
//		email = sc.next();
//
//		Employee e2 = new Employee();
//		
//		e2.setData(eid, ename, dept, salary, contact, email);
//
//		
//		System.out.println("Enter the employee id");
//		eid = sc.nextInt();
//		System.out.println("Enter employee name");
//		ename = sc.next();
//		System.out.println("Enter employee department");
//		dept = sc.next();
//		System.out.println("Enter employee salary");
//		salary = sc.nextInt();
//		System.out.println("Enter employee contact");
//		contact = sc.next();
//		System.out.println("Enter employee email");
//		email = sc.next();
//		
//		Employee e3 = new Employee();
//		e3.setData(eid, ename, dept, salary, contact, email);
//		
//		
//		
//		System.out.println("Enter the employee id");
//		eid = sc.nextInt();
//		System.out.println("Enter employee name");
//		ename = sc.next();
//		System.out.println("Enter employee department");
//		dept = sc.next();
//		System.out.println("Enter employee salary");
//		salary = sc.nextInt();
//		System.out.println("Enter employee contact");
//		contact = sc.next();
//		System.out.println("Enter employee email");
//		email = sc.next();
//
//		Employee e4 = new Employee();
//		e4.setData(eid, ename, dept, salary, contact, email);
//		
//		
//		System.out.println("Enter the employee id");
//		eid = sc.nextInt();
//		System.out.println("Enter employee name");
//		ename = sc.next();
//		System.out.println("Enter employee department");
//		dept = sc.next();
//		System.out.println("Enter employee salary");
//		salary = sc.nextInt();
//		System.out.println("Enter employee contact");
//		contact = sc.next();
//		System.out.println("Enter employee email");
//		email = sc.next();
//
//		Employee e5 = new Employee();
//		e5.setData(eid, ename, dept, salary, contact, email);
//
//		e1.display();
//		e2.display();
//		e3.display();
//		e4.display();
//		e5.display();

	}

}
