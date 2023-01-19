package collection;
import java.util.*;

public class LinkedListEx01 {

	public static void main(String[] args) {

		LinkedList<String> names=new LinkedList<>();
		names.add("Vaibhav");
		names.add("Kiran");
		names.add("Bhagyashree");
		names.add("Audumber");
		names.add("Pravin");
		
		Iterator<String> it=names.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}

	}

}
