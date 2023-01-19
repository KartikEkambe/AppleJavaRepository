package collectionMaps;
import java.util.*;
public class ArrayListToMap {

	public static void main(String[] args) {

		ArrayList<Character> al=new ArrayList<Character>();
		al.add('a');
		al.add('b');
		al.add('d');
		al.add('c');	
		al.add('g');
		al.add('d');
		al.add('a');
		al.add('b');
		al.add('g');
		al.add('h');	
		al.add('a');
		al.add('d');
		al.add('j');
		al.add('d');
		al.add('a');
		al.add('e');	
		al.add('c');
		al.add('b');
		HashMap<Character,Integer> hm=new HashMap<Character, Integer>();
		for(Character c:al) {
			if(hm.containsKey(c)) {
				int i=hm.get(c);
				hm.put(c, i+1);
			}else {
				hm.put(c, 1);
			}
		}
		
		System.out.println(hm);

	}

}
