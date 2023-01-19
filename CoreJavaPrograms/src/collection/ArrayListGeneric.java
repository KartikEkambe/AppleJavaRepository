package collection;

import java.util.ArrayList;

public class ArrayListGeneric {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		
		System.out.println(al);
		for(Integer i:al) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
	}

}
