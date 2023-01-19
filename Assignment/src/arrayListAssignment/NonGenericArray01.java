package arrayListAssignment;
import java.util.*;

public class NonGenericArray01 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(22);
		al.add(33);
		al.add(25);
		al.add(65);
		al.add(10);
		al.add("Core");
		al.add("Java");
		al.add("Advance");
		al.add("Java");
		al.add("Language");
		System.out.println(al);
		
		for(Object o:al) {
			String s=o.getClass().getSimpleName();
			if(s.equalsIgnoreCase("Integer"))
				System.out.print(o+" ");
			
			
			
//			if(s.equalsIgnoreCase("String"))
//				System.out.print(o+" ");
		}
		


	}

}
