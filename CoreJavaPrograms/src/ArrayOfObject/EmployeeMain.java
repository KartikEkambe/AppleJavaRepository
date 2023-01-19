package ArrayOfObject;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter number of employees");
//		int size=sc.nextInt();
//		Employee emp[]=new Employee[size];
//		
//		for(int i=0;i<size;i++) {
//			System.out.println("Enter employee id,name,dept,salary");
//			int id=sc.nextInt();
//			String name=sc.next();
//			String dept=sc.next();
//			int salary=sc.nextInt();
//			
//			emp[i]=new Employee(id, name, dept, salary);
//			
//		}
//		
//		for(Employee e:emp) {
//			if(e.salary>=60000)
//			{
//				System.out.println("Above 60000");
//				System.out.println(e);
//			}
//			
//		
//		}
//		
//		for(Employee e:emp) {
//			if(e.dept.equalsIgnoreCase("HR")) {
//				e.hike();
//				System.out.println(e);
//			}
//		}
		
		
		Employee emp[]=new Employee[10];
		emp[0]=new Employee(101,"Kartik","Development",65000);
		emp[1]=new Employee(102,"vaibhav","hr",45000);
		emp[2]=new Employee(103,"Bhagyashree","Development",65000);
		emp[3]=new Employee(104,"Audu","Hr",50000);
		emp[4]=new Employee(105,"Sarika","Development",25000);
		emp[5]=new Employee(106,"Varsha","Hr",65000);
		emp[6]=new Employee(107,"Virat","Development",67000);
		emp[7]=new Employee(108,"Bali","Hr",67000);
		emp[8]=new Employee(109,"Karan","Sales",45000);
		emp[9]=new Employee(110,"Nitin","Sales",25000);
		
		for(Employee e:emp) {
			if(e.salary>=60000)
			{
				
				System.out.println(e);
			}
			
		
		}
		
		
		System.out.println("\n---------------------\n");
		for(Employee e:emp) {
			if(e.dept.equalsIgnoreCase("HR")) {
				e.hike();
				System.out.println(e);
			}
		}

	}

}
