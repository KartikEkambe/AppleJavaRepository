package collection;

import java.util.*;

public class StudentArraylist {

	Scanner sc = new Scanner(System.in);
	ArrayList<StudentEx> al = new ArrayList<StudentEx>();

	public void userInput() {
		char ch;
		do {
		System.out.println("Enter number of student to add");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter student id,name and marks");
			int id = sc.nextInt();
			String name = sc.next();
			int marks = sc.nextInt();
			StudentEx s = new StudentEx();
			s.setId(id);
			s.setName(name);
			s.setMarks(marks);

			al.add(s);
		}
		System.out.println("Do you want to add students : (y/n)?");
		ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');

	}

	void display() {
		for (StudentEx s : al) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {

		StudentArraylist s = new StudentArraylist();
		s.userInput();
		s.display();

	}

}
