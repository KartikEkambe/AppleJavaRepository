package classandobjects;

import java.util.Scanner;

public class Student {
	int id, marks;
	String name, dept;

//	void SetData() {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter  id");
//		id=sc.nextInt();
//		System.out.println("Enter name");
//		name=sc.next();
//		System.out.println("Enter marks");
//		marks=sc.nextInt();
//		System.out.println("Enter  department");
//		dept=sc.next();
//	}

	void setData(int i, String n, int m, String d) {
		id = i;
		name = n;
		marks = m;
		dept = d;

	}

	void display() {
		System.out.println(id + " " + name + " " + marks + " " + dept);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of students");
		int no=sc.nextInt();
		Student s = new Student();
		
		for(int i=1;i<=no;i++) {
			System.out.println("set data for "+i+" student");
		System.out.println("Enter id");
		int sid = sc.nextInt();
		System.out.println("Enter name");
		String sname = sc.next();
		System.out.println("Enter marks");
		int smarks = sc.nextInt();
		System.out.println("Enter department");
		String sdept = sc.next();

		s.setData(sid, sname, smarks, sdept);
		}

		s.display();
		
	}

}
