package Encapsulation;

import java.util.Scanner;

public class EmployeeMain02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id, salary;
		String name, dept, contact;

		Employee e = new Employee();

		System.out.println("Enter Student id,name,salary,department and contact number");
		id = sc.nextInt();
		name = sc.next();
		dept = sc.next();
		salary = sc.nextInt();
		contact = sc.next();
		e.setId(id);
		e.setName(name);
		e.setDept(dept);
		e.setSalary(salary);
		e.setContact(contact);
		System.out.println(
				e.getId() + " " + e.getName() + " " + e.getDept() + " " + e.getSalary() + " " + e.getContact());

		Employee e2 = new Employee();

		System.out.println("Enter Student id,name,salary,department and contact number");
		id = sc.nextInt();
		name = sc.next();
		dept = sc.next();
		salary = sc.nextInt();
		contact = sc.next();
		e2.setId(id);
		e2.setName(name);
		e2.setDept(dept);
		e2.setSalary(salary);
		e2.setContact(contact);
		System.out.println(
				e2.getId() + " " + e2.getName() + " " + e2.getDept() + " " + e2.getSalary() + " " + e2.getContact());

		
		
		Employee e3 = new Employee();

		System.out.println("Enter Student id,name,salary,department and contact number");
		id = sc.nextInt();
		name = sc.next();
		dept = sc.next();
		salary = sc.nextInt();
		contact = sc.next();
		e3.setId(id);
		e3.setName(name);
		e3.setDept(dept);
		e3.setSalary(salary);
		e3.setContact(contact);
		System.out.println(
				e3.getId() + " " + e3.getName() + " " + e3.getDept() + " " + e3.getSalary() + " " + e3.getContact());

		
		Employee e4 = new Employee();

		System.out.println("Enter Student id,name,salary,department and contact number");
		id = sc.nextInt();
		name = sc.next();
		dept = sc.next();
		salary = sc.nextInt();
		contact = sc.next();
		e4.setId(id);
		e4.setName(name);
		e4.setDept(dept);
		e4.setSalary(salary);
		e4.setContact(contact);
		System.out.println(
				e4.getId() + " " + e4.getName() + " " + e4.getDept() + " " + e4.getSalary() + " " + e4.getContact());

		
		
	}

}
