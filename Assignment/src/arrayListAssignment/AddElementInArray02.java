package arrayListAssignment;
import java.util.*;

public class AddElementInArray02 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add(0, 12);
		al.add(1, "CoreJava");
		al.add(2, 44);
		al.add(3, "AdvanceJava");
		
		for(Object o:al) {
			System.out.println(o);
		}
		

	}

}
