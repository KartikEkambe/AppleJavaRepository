package arrayListAssignment;

import java.util.*;

public class RetailAllMethod10 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(40);
		al.add(80);
		al.add(10);
		System.out.println(al);
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(20);
		list.add(40);
		
		al.addAll(1,list);
		System.out.println(al);
		al.retainAll(list);
		System.out.println(al);
		

	}

}
