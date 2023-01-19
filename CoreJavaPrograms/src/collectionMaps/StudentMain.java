package collectionMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentMain {
	
	void add(HashMap<Integer,Student> hm) {
		Scanner sc=new Scanner(System.in);
//		hm.put(55, new Student("Vaibhav","vaibhav@gmail.com",88));
//		hm.put(84, new Student("Ajit","ajit@gmail.com",79));
//		hm.put(855, new Student("Amol","amol@gmail.com",65));
//		hm.put(99, new Student("Sanu","sanu@gmail.com",82));
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter id,name,email and marks");
			int id=sc.nextInt();
			String name=sc.next();
			String email=sc.next();
			int marks=sc.nextInt();
			
			Student s=new Student();
			s.setName(name);
			s.setEmail(email);
			s.setMarks(marks);
			
			hm.put(id, s);
		}
		

	}

	void display(HashMap<Integer,Student> hm) {
		for(Map.Entry<Integer, Student> ent:hm.entrySet()) {
			System.out.println(ent.getKey()+" "+ent.getValue().name+" "+ent.getValue().email+" "+ent.getValue().marks);
		}
	}
	public static void main(String[] args) {
		StudentMain s=new StudentMain();
		HashMap<Integer,Student> hm=new HashMap<Integer, Student>();
		s.add(hm);
		s.display(hm);
		

	}

}
