package collection;
import java.util.*;
public class LinkedListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(400);
		ll.add(50);
		ll.add(770);
		ll.add(10);
		ll.add(880);
		ll.add(40);
		ll.add(40);
		ll.add(10);
		ll.add(60);
		ll.add(40);
		
//		Iterator<Integer> itr=ll.iterator();
//		int cnt=0;
//		while(itr.hasNext()) {
//			if(itr.next()==40) {
//				cnt++;
//			}
//		}
//		System.out.println(cnt);
		
		ll.addFirst(400);
//		System.out.println(ll);
		ll.addLast(800);
//		System.out.println(ll);
		
		Collections.sort(ll);
		System.out.println(ll);
//		Collections.reverse(ll); //decending order
//		System.out.println(ll);
		
		//decending order using iterator
		
		Iterator<Integer> itr=ll.descendingIterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
//		System.out.println(Collections.frequency(ll, 10));
		
		
		
		
	}

}
