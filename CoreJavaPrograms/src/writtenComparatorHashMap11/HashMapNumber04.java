package writtenComparatorHashMap11;

import java.util.*;

public class HashMapNumber04 {
	void addNumber(LinkedList<Integer> ll) {
		ll.add(1);
		ll.add(4);
		ll.add(2);
		ll.add(1);
		ll.add(3);
		ll.add(1);
		ll.add(4);
	}
	
	void display(LinkedList<Integer> ll,HashMap<String, Integer>hm) {
		HashMap<Integer, Integer> hmint=new HashMap<Integer, Integer>();
		for(Integer i:ll) {
			if(hmint.containsKey(i)) {
				int v=hmint.get(i);
				hmint.put(i, v+1);
			}else {
				hmint.put(i, 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> c : hmint.entrySet()) {
			switch(c.getKey()) {
			case 1:
				hm.put("one", c.getValue());
				break;
			case 2:
				hm.put("two", c.getValue());
				break;
			case 3:
				hm.put("three", c.getValue());
				break;
			case 4:
				hm.put("four", c.getValue());
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		HashMapNumber04 n=new HashMapNumber04();
		n.addNumber(ll);
		HashMap<String, Integer>hm=new HashMap<String, Integer>();
		n.display(ll, hm);
		
		System.out.println(hm);
		
	}

}
