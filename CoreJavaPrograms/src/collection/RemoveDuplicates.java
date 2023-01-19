package collection;

import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(400);
		al.add(50);
		al.add(770);
		al.add(10);
		al.add(880);
		al.add(40);
		al.add(40);
		al.add(10);
		al.add(60);
		System.out.println(al);
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		
		for(Integer i:al) {
			if(!al1.contains(i))
				al1.add(i);
		}
		System.out.println(al1);


	}

}
