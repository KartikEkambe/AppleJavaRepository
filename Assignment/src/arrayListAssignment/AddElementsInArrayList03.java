package arrayListAssignment;
import java.util.*;

public class AddElementsInArrayList03 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(12);
		al.add("Core");
		al.add(20);
		al.add("Java");
		al.add(55);
		al.add(66);
		
		System.out.println(al);
		al.add(2, "Java");
		System.out.println(al);


	}

}
