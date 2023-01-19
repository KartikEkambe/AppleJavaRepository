package comparableAndComparator;

import java.util.*;

public class Student01ShallowAndDeepCopy  {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(67);
		al.add(62);
		al.add(85);
		al.add(72);
		al.add(84);
		
		Student01 s1=new Student01("Vaibhav", al);
		
		Student01 s2= (Student01) s1.clone();
		s2.marks.add(88);
		s2.marks.add(78);
		System.out.println(s1);
		System.out.println(s2);
		
		
		
		
		
		
	}
	

}
