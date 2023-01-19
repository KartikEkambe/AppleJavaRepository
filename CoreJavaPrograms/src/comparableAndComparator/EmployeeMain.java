package comparableAndComparator;

import java.util.*;

public class EmployeeMain {
	void seData(ArrayList<Employee> empl) {
		empl.add(new Employee(1023, "Vaibhav", "Development", 24500, 'A'));
		empl.add(new Employee(514, "Anil", "Hr", 14500, 'B'));
		empl.add(new Employee(4, "Vipul", "Sales", 22500, 'C'));
		empl.add(new Employee(74, "Madhav", "Hr", 34500, 'D'));
		empl.add(new Employee(14, "Riya", "Sales", 27400, 'A'));
		empl.add(new Employee(90, "Omkar", "Development", 21500, 'B'));
		empl.add(new Employee(51, "Bhagyashree", "Hr", 19500, 'C'));
		empl.add(new Employee(54, "Shruti", "Development", 24500, 'A'));

	}

	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<>();
		EmployeeMain em = new EmployeeMain();
		em.seData(emp);
		System.out.println(emp);
		Collections.sort(emp);
		System.out.println();
		System.out.println(emp);
		System.out.println("sort using Comparator based on name");
		
		Collections.sort(emp, new EmployeeNameComparator());
		System.out.println(emp);

	}

}
