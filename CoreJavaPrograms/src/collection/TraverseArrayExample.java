package collection;
import java.util.*;

public class TraverseArrayExample {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(30);
		al.add(15);
		al.add(4);
		al.add(60);
		al.add(40);
		al.add(65);
		al.add(48);
		al.add(120);
		al.add(35);
		al.add(87);
		al.add(90);
		
		System.out.println(al);
		
//		for(int i=0;i<al.size();i++) {
//			System.out.println(al.get(i));
//		}
		
//		for(Integer i:al) {
//			System.out.println(i);
//		}
		
		System.out.println("\n\n------------- Iterator ----------------");
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		System.out.println("\n\n------------- List Iterator forward direction ----------------");

		ListIterator<Integer> litr=al.listIterator();
		while(litr.hasNext()) {
			System.out.print(litr.next()+" ");
		}
		
		System.out.println("\n\n-------------List Iterator backward direction ----------------");

		ListIterator<Integer> litr1=al.listIterator(al.size());
		while(litr1.hasPrevious()) {
			System.out.print(litr1.previous()+" ");
		}
		
		
	}
}
