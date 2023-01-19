package writtenArrayList10;

import java.util.*;

public class ArrayList02 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(100);
		al.add(208);
		al.add(34);
		al.add(444);
		
		Iterator<Integer>itr=al.iterator();
		while(itr.hasNext()) {
			if(itr.next()==10)
				al.add(100);
		}
		

	}

}
