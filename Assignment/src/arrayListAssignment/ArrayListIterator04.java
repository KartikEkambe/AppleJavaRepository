package arrayListAssignment;
import java.util.*;
public class ArrayListIterator04 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(20);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(100);
		al.add(90);
		al.add(80);
		
		Iterator<Integer> it=al.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}


	}

}
