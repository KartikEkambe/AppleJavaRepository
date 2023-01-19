package writtenComparatorHashMap11;

import java.util.*;

public class HashMapFrequency03 {
	void add(ArrayList<String> al) {
		al.add("pune");
		al.add("Mumbai");
		al.add("pune");
		al.add("Mumbai");
		al.add("Nasik");
		al.add("pune");
	}
	
	void findFrequency(ArrayList<String> al,HashMap<String, Integer> hm) {
		for(String s:al) {
			if(hm.containsKey(s)) {
				int i=hm.get(s);
				hm.put(s, i+1);
			}else {
				hm.put(s, 1);
			}
		}
		
		System.out.println(hm);
	}

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		HashMapFrequency03 f=new HashMapFrequency03();
		f.add(al);
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		f.findFrequency(al, hm);
		
	}

}
