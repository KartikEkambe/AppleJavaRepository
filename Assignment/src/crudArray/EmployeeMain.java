package crudArray;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeMain {
	Scanner sc = new Scanner(System.in);

	Employee emp[] = new Employee[10];

	void insertData() {
		Employee e1 = new Employee();
		e1.setId(101);
		e1.setName("Vaibhav");
		e1.setSalary(25000);
		e1.setDept("Development");
		emp[0] = e1;

		Employee e2 = new Employee();
		e2.setId(102);
		e2.setName("Nitin");
		e2.setSalary(15000);
		e2.setDept("Testing");
		emp[1] = e2;

		Employee e3 = new Employee();
		e3.setId(103);
		e3.setName("Shravan");
		e3.setSalary(22000);
		e3.setDept("HR");
		emp[2] = e3;

		Employee e4 = new Employee();
		e4.setId(104);
		e4.setName("Ashwini");
		e4.setSalary(23500);
		e4.setDept("Marketing");
		emp[3] = e4;

		Employee e5 = new Employee();
		e5.setId(105);
		e5.setName("Kartik");
		e5.setSalary(19900);
		e5.setDept("Development");
		emp[4] = e5;

	}

	void userInput() {
		System.out.println("User Input");

		System.out.println("enter id,name,salary and department");
		int id = sc.nextInt();
		String name = sc.next();
		float salary = sc.nextFloat();
		String dept = sc.next();

		Employee e = new Employee();
		e.setId(id);
		e.setName(name);
		e.setSalary(salary);
		e.setDept(dept);

		for (int i = 0; i < emp.length; i++) {
			if (emp[i] == null) {
				emp[i] = e;
				break;
			}

		}
		
		System.out.println();

	}

	void viewData() {
		System.out.println("All Data");
		for (Employee e : emp) {
			if (e != null)
				System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary() + " " + e.getDept());
		}
		System.out.println();
	}

	void viewSpecificData() {
		System.out.println("Specific Data");
		int id = 102;
		for (Employee e : emp) {
			if (e != null) {
				if (id == e.getId()) {
					System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary() + " " + e.getDept());
				}
			}

		}
		System.out.println();

	}

	void updateData() {
//		System.out.println("Updated Data");s
		int id = 103;

		for (Employee e : emp) {
			if (e != null) {
				if (id == e.getId()) {
					float hike = e.getSalary() * 0.30f;
					float newSalary = e.getSalary() + hike;
					e.setSalary(newSalary);
				}
			}

//			System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()+" "+e.getDept());	

		}
		System.out.println();

	}

	void deleteData() {
		System.out.println("Delete Data");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int id = sc.nextInt();
		int index = 0;
		int j = 0;
		Employee temp[] = new Employee[emp.length - 1];

		for (int i = 0; i < emp.length; i++) {
			if (emp[i] != null) {
				if (id == emp[i].getId()) {
					index = i;
				}
			}
		}

		System.out.println(index);
		for (int i = 0, k = 0; i < emp.length; i++) {

			if (i == index) {
//				temp[j]=emp[i+1];
//				j++;
				continue;
			} else {
				temp[j] = emp[i];
				j++;
			}
		}
//		temp[temp.length-1]=null;

		for (int i = 0; i < temp.length; i++) {
			emp[i] = temp[i];
		}
//		emp[emp.length - 1] = null;
		System.out.println(Arrays.toString(emp));
//		System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()+" "+e.getDept());	

		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeMain e = new EmployeeMain();
		e.insertData();
		int num;
		char ch;
		
		do {
		System.out.println(" 1. View All Employee Details \n 2. View Specific Employee Details \n 3. Update Employee Details \n 4. Delete Employee \n 5. Add New Employee");
		System.out.println("Enter your choice");
		 num=sc.nextInt();
		
		switch(num) {
		case 1:
			e.viewData();
			break;
			
		case 2:
			e.viewSpecificData();
			break;
			
		case 3: 
			e.updateData();
			break;
			
		case 4:
			e.deleteData();
			break;
			
		case 5:
			e.insertData();
		case 6:
			System.out.println("Exti");
			break;
			default :
			System.out.println("Enter valid input");
			
		}
		System.out.println("Do you want to continue:(y/n)");
		ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
		
//		e.insertData();
//		e.viewData();
//
//		e.updateData();
//		e.viewData();
//		e.deleteData();
//		e.deleteData();
//		e.userInput();
//		e.viewData();

	}

}
