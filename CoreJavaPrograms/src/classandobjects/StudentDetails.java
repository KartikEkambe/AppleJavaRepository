package classandobjects;

import java.util.Scanner;

public class StudentDetails {
	
	int id;
	String name;
	int eng,math,sci,per,total;
	
	
	
	//create a student class student has id, name, three subject marks create a first method to accept the details of students create a second method to calculate the percentage  create a third method to display details of students id name subject marks and percentage
	
	
	
	
	void studentdetails(int sid,String sname,int e,int m,int s) {
		id=sid;
		name=sname;
		eng=e;
		math=m;
		sci=s;
		
		
			
	}
	
	void percentage() {
		 total=eng+math+sci;
		 per=total/3;
	
	}
	
	void display(String name,int id,int eng,int math,int sci,int per) {
		
		System.out.println("Student Id : "+id);
		System.out.println("Student Name : "+name);
		System.out.println("English :"+eng);
		System.out.println("Mathematics :"+math);
		System.out.println("Science :"+sci);

		System.out.println("Total :"+total);

		System.out.println("Percentage is : "+per + "%");

		
	}

	public static void main(String[] args) {
		int id,eng,math,sci;
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student name , student id and marks of  english, math and science");
		 id=sc.nextInt();
		 sc.next();
		 name=sc.nextLine();
		 eng=sc.nextInt();
		 math=sc.nextInt();
		 sci=sc.nextInt();
		 StudentDetails s=new StudentDetails();
		 s.studentdetails(id, name, eng, math, sci);
		 
		
		
		
		 
		 

	}

}
