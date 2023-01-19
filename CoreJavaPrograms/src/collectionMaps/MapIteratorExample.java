package collectionMaps;
import java.util.*;
public class MapIteratorExample {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer, String>();
		hm.put(123, "Riya");
		hm.put(3, "Pavan");
		hm.put(22, "Virat");
		hm.put(50, "Pravin");
		hm.put(1012, "Bhagyashree");
		hm.put(99, "Vaibhav");
		hm.put(721, "Priya");
		hm.put(38, "Aadi");
		hm.put(202, "Nikhil");
		hm.put(670, "Shivanya");
		hm.put(112, "Akhil");
		hm.put(89, "Kartik");
		System.out.println(hm);
		System.out.println("\n------------Traversing using only key-------------");
		for(Integer i:hm.keySet()) {
			System.out.print(i+" ");
		}
		
		System.out.println("\n\n------------Traversing using only value-------------");

		for(String s:hm.values()) {
			System.out.print(s+" ");
		}
		
		System.out.println("\n\n------------Traversing using Map.entry-------------");

		for(Map.Entry<Integer, String> ent:hm.entrySet()) {
			System.out.print(ent.getKey()+"-"+ent.getValue()+", ");
		}
		
		System.out.println("\n\n------------Traversing using Iterator-------------");
		
		Set<Map.Entry<Integer, String>> s=hm.entrySet();
		Iterator<Map.Entry<Integer, String>> itr=hm.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}

	}
}
