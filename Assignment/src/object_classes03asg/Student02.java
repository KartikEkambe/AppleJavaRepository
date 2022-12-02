package object_classes03asg;

import java.util.Scanner;

public class Student02 {
	int id=101;
	String name="Vp";
	
	void setData(int id,String name) {
		this.id=id;
		this.name=name;
	}
	

	public static void main(String[] args) {
		
		Student02 s=new Student02();
		System.out.println(s.id+" "+s.name);

		System.out.println("\n------------------**********************-----------------\n");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student id and name");
		int sid=sc.nextInt();
		String sname=sc.next();
		Student02 s2=new Student02();
		s2.setData(sid, sname);
		System.out.println(s2.id+" "+s2.name);
		

		
		
		

	}

}
