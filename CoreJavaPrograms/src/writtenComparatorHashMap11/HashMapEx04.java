package writtenComparatorHashMap11;
import java.util.*;
public class HashMapEx04 {
	void linkedListAdd(LinkedList<Integer> ll) {
		ll.add(1);
		ll.add(4);
		ll.add(2);
		ll.add(1);
		ll.add(3);
		ll.add(1);
		ll.add(4);
	}
	
	void display(LinkedList<Integer> ll,HashMap<String,Integer> hm) {
		for(Integer i:ll) {
			if(hm.containsValue(i)) {
				int val=hm.get(i);
				switch(val) {
				case 1:
					if(val==1) {
						hm.put("One", val+1);
					}
					break;
				case 2:
					if(val==2) {
						hm.put("Two", val+1);
					}
					break;
				case 3:
					if(val==3) {
						hm.put("Three", val+1);
					}
					break;
				case 4:
					if(val==4) {
						hm.put("Four", val+1);
					}
					break;
				}
			}else {
				switch(i) {
				case 1:
					if(i==1) {
						hm.put("One", 1);
					}
					break;
				case 2:
					if(i==2) {
						hm.put("Two", 1);
					}
					break;
				case 3:
					if(i==3) {
						hm.put("Three", 1);
					}
					break;
				case 4:
					if(i==4) {
						hm.put("Four", 1);
					}
					break;
				}
			}
			
			
		}
	}
	
	public static void main(String[] args) {

		LinkedList<Integer> list=new LinkedList<Integer>();
		HashMapEx04 hmex=new HashMapEx04();
		hmex.linkedListAdd(list);
		HashMap<String,Integer> hm=new HashMap<String, Integer>();
		hmex.display(list, hm);
		System.out.println(hm);
		
		
	}

}
