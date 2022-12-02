package constructor;

import java.util.Scanner;

public class Student {
	int id,percentage;
	String name,degree;
	
	Student(int id,String name,String degree,int percentage){
		this.id=id;
		this.name=name;
		this.degree=degree;
		this.percentage=percentage;
		
	}
	
	
	
	public String toString() {
		
		return id+" "+name+" "+degree+" "+percentage+"%";
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int sid,per;
		String sname,sdegree;
		System.out.println("Enter Student id, Name, Degree and percentage ");
		sid=sc.nextInt();
		sname=sc.next();
		sdegree=sc.next();
		
		per=sc.nextInt();
		
		Student s=new Student(sid, sname, sdegree, per);
		System.out.println(s);
		
	}

}
