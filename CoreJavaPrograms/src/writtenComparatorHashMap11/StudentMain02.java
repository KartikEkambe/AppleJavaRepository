package writtenComparatorHashMap11;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain02 {
	void addStudent(ArrayList<Student02>al) {
		al.add(new Student02(28, "Vaibhav", 23));
		al.add(new Student02(332, "Anil", 19));
		al.add(new Student02(156, "Bhagyashree", 26));
		al.add(new Student02(98, "Audumber", 21));
		al.add(new Student02(58, "Sanu", 16));


	}

	public static void main(String[] args) {

		ArrayList<Student02>al=new ArrayList<Student02>();
		StudentMain02 sm=new StudentMain02();
		sm.addStudent(al);
		System.out.println(al);
		System.out.println("\n----------Sorted based on RollNo----------\n");
		Collections.sort(al,new RollNoComparator());
		System.out.println(al);
		
		System.out.println("\n----------Sorted based on Name----------\n");
		Collections.sort(al,new NameComparator());
		System.out.println(al);
		
		System.out.println("\n----------Sorted based on Age----------\n");
		Collections.sort(al,new AgeComparator());
		System.out.println(al);
		

	}

}
