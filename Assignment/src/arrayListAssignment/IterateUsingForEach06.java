package arrayListAssignment;
import java.util.*;

public class IterateUsingForEach06 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(25);
		al.add(35);
		al.add(45);
		al.add(50);
		al.add(60);
		al.add(65);
		al.add(75);
		al.add(90);
		
		for(Integer i:al) {
			System.out.print(i+" ");
		}


	}

}
