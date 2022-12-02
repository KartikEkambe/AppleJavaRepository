package Encapsulation;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int id, salary, num;
		String name, dept, contact;
		System.out.println("Enter the number of employees");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println("Enter the Employee Id");
			id = sc.nextInt();
			System.out.println("Enter Employee Name");
			name = sc.next();
			System.out.println("Enter the Employee Department");
			dept = sc.next();
			System.out.println("Enter the Employee Salary");
			salary = sc.nextInt();
			System.out.println("Enter the contact of employee");
			contact = sc.next();

			Employee e = new Employee();
			e.setId(id);
			e.setName(name);
			e.setDept(dept);
			e.setSalary(salary);
			e.setContact(contact);
			System.out.println(
					e.getId() + " " + e.getName() + " " + e.getDept() + " " + e.getSalary() + " " + e.getContact());
		}

//		e.setName("Vaibhav");
//		e.setDept("Development");
//		e.setSalary(25000);
//		e.setContact("8888293184");

//		System.out.println(e.getId()+" "+e.getName()+" "+e.getDept()+" "+e.getSalary()+" "+e.getContact());

	}

}
