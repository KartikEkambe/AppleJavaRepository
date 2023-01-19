package ArrayOfObject;

import java.util.Scanner;

public class StudentGetSetMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students");
		int size=sc.nextInt();
		
		Student01 stud[]=new Student01[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter studnet id,name,dept,marks");
			int id=sc.nextInt();
			String name=sc.next();
			String dept=sc.next();
			int marks=sc.nextInt();
			
			Student01 s=new Student01();
			s.setId(id);
			s.setName(name);
			s.setDept(dept);
			s.setMarks(marks);
			stud[i]=s;
		}
		
		for(Student01 s:stud) {
			System.out.println(s.getId()+" "+s.getName()+" "+s.getDept()+" "+s.getMarks());
		}

	}

}
