package collectionMaps;

import java.util.*;

public class Student1Main {
	void addStudent(LinkedHashMap<Student1,Integer> hm) {
		hm.put(new Student1(23,"Kanchan","Computer",67), 23);
		hm.put(new Student1(78,"Vaibhav","Civil",87), 26);
		hm.put(new Student1(124,"Kartik","Computer",70), 23);
		hm.put(new Student1(65,"Pramod","Mech",76), 29);
		hm.put(new Student1(89,"Bhagyashree","Civil",69), 23);
		hm.put(new Student1(633,"Pravin","ENTC",57), 20);
		hm.put(new Student1(234,"Shankar","ITI",60), 19);
		hm.put(new Student1(65,"Audu","Commerce",86), 20);
		hm.put(new Student1(89,"Sumit","ENTC",69), 23);
		hm.put(new Student1(453,"Ashwini","Computer",87), 23);


	}
//	void display()
	public static void main(String[] args) {
		LinkedHashMap<Student1,Integer> hm=new LinkedHashMap<Student1, Integer>();
		Student1Main sm=new Student1Main();
		sm.addStudent(hm);
		System.out.println(hm);
		hm.put(new Student1(453,"Bhandare","Comp",87), 24);
		System.out.println(hm);

	}

}
