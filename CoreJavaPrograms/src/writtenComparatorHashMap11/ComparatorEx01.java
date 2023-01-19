package writtenComparatorHashMap11;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorEx01 {
	public static void main(String[] args) {
		
		ArrayList<Employee01> al=new ArrayList<Employee01>();
		al.add(new Employee01(122,"Pavan","Marketing",new Profile01("Maharashtra", "India")));
		al.add(new Employee01(2555,"Pravin","Hr",new Profile01("Texas", "Germany")));
		al.add(new Employee01(34,"Pavan","Development",new Profile01("Landon", "England")));
		al.add(new Employee01(42,"Vaibhav","Development",new Profile01("Maharashtr", "India")));
		al.add(new Employee01(102,"Anil","Hr",new Profile01("Paris", "France")));
		al.add(new Employee01(1342,"Pravin","Sales",new Profile01("Maharashtra", "India")));
		System.out.println(al);
		Collections.sort(al);
		System.out.println("\n--------Sorted based on name-----------");
		System.out.println(al);
		System.out.println("\n--------Sorted based on id-----------");
		Collections.sort(al, new EmployeeComparator());
		System.out.println(al);
		System.out.println("\n--------Sorted based on Country-----------");
		Collections.sort(al, new ProfileComparator01());
		System.out.println(al);

		

	}


}
