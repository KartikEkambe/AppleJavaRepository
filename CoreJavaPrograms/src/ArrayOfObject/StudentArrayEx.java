package ArrayOfObject;

import java.util.Scanner;

public class StudentArrayEx {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number of Students ");
//		int size=sc.nextInt();
//		Student stud[]=new Student[size];
//		
//		for(int i=0;i<size;i++) {
//			System.out.println("Enter a student id,name,dept,marks");
//			int id=sc.nextInt();
//			String name=sc.next();
//			String dept=sc.next();
//			int marks=sc.nextInt();
//			stud[i]=new Student(id,name,dept,marks);
//		}
//		
//		
//		for(Student s: stud) {
//			System.out.println(s);
//		}
		
		
		
		Student stud[]=new Student[10];
		
		stud[0]=new Student(101,"Kartik","Computer",71);
		stud[1]=new Student(102,"vaibhav","Civil",88);
		stud[2]=new Student(103,"Bali","Computer",59);
		stud[3]=new Student(104,"Audu","Commerce",84);
		stud[4]=new Student(105,"Venky","D.Pharmacy",65);
		stud[5]=new Student(106,"KartikEkambe","Computer",65);
		stud[6]=new Student(107,"vaibhavPatil","Civil",66);
		stud[7]=new Student(108,"BaliSagar","Computer",89);
		stud[8]=new Student(109,"AuduKadam","Commerce",84);
		stud[9]=new Student(110,"VenkatReddy","D.Pharmacy",89);
		
		for(Student s:stud) {
//			if(s.dept.equals("Computer")&&s.marks>60)
//			System.out.println(s);
			
			if(s.marks>70)
				System.out.println(s);
		}
		
		
		
		
		

	}

}
