package arrayListAssignment;
import java.util.*;

public class IterateUsingForLoop05 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(60);
		al.add(33);
		al.add(40);
		al.add(11);
		al.add(22);
		al.add(33);
		al.add(44);
		al.add(90);
		
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");
		}
		

	}

}
