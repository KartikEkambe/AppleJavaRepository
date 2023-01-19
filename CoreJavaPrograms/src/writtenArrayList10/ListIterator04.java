package writtenArrayList10;
import java.util.*;
public class ListIterator04 {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(540);
		ll.add(50);
		ll.add(670);
		ll.add(10);
		ll.add(680);
		ll.add(40);
		ll.add(40);
		ll.add(10);
		ll.add(60);
		System.out.println(ll);
		ListIterator<Integer> lt=ll.listIterator(ll.size());
		while(lt.hasPrevious()) {
			System.out.print(lt.previous()+" ");
		}

	}

}
