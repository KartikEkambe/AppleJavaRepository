package test;

import java.util.Scanner;

import dao.StudentOperation;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentOperation s=new StudentOperation();
		s.insertData();
		char ch;
		do {
			System.out.println(" 1. View All Student Details \n 2. View Specific Student Details \n 3. Update Student Details \n 4. Delete Student  \n 5. Add New Student");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			 
			 switch(choice) {
			 case 1:
				 s.displayAllStudent();
				 break;
			 case 2:
				 s.searchStudentById();
				 break;
			 case 3:
				 s.updateStudent();
				 break;
			 case 4:
				 s.deleteStudent();
				 break;
			 case 5:
				 s.insertData();
				 break;
				 
				 default:
					 System.out.println("Please enter valid input");
			 }
			 System.out.println("Do you want to continue:(y/n)");
			 ch=sc.next().charAt(0);
			
			
		}while(ch=='y' || ch=='Y');
	}
}
