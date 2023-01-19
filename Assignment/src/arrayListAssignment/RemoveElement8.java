package arrayListAssignment;
import java.util.*;
public class RemoveElement8 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		al.add(90);
		System.out.println(al);
		al.remove(4);
		al.remove(0);
		System.out.println(al);
		al.removeAll(al);
		System.out.println(al);
	
		

	}

}
