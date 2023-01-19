package collectionMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapsExample {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(123, "Riya");
		hm.put(3, "Pavan");
		hm.put(22, "Virat");
		hm.put(50, "Pravin");
		hm.put(1012, "Bhagyashree");
		hm.put(99, "Vaibhav");
		
//		hm.remove(3);
		hm.replace(3, "Raj");
		System.out.println("HashMap"+hm);
		System.out.println(hm.containsKey(23));
		System.out.println(hm.containsValue("Raj"));
		System.out.println(hm.size());
		
		
		
		LinkedHashMap<Integer, String> lhm=new LinkedHashMap<>();

		lhm.put(123, "Riya");
		lhm.put(3, "Pavan");
		lhm.put(22, "Virat");
		lhm.put(50, "Pravin");
		lhm.put(1012, "Bhagyashree");
		lhm.put(99, "Vaibhav");
		System.out.println("LinkedHashMap"+lhm);
		
		TreeMap<Integer, String>tp=new TreeMap<>();
		tp.put(123, "Riya");
		tp.put(3, "Pavan");
		tp.put(22, "Virat");
		tp.put(50, "Pravin");
		tp.put(1012, "Bhagyashree");
		tp.put(99, "Vaibhav");
		System.out.println("TreeMap"+tp);
	}

}
