package collection;
import java.util.*;

public class ArrayListMethodsEx {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(400);
		al.add(70);
		al.add(200);
		al.add(78);
		al.add(90);
		al.add(400);
		al.add(200);
		System.out.println(al);
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(2000);
		list.add(3000);
		list.add(4000);
		list.add(400);
		
		System.out.println(list);
		
//		al.addAll(list);
//		System.out.println("after adding collection into arraylist");
//		System.out.println(al);
		
		al.addAll(2, list);
		System.out.println("after adding collection into specific index in arraylist");

		System.out.println(al);
		
		al.retainAll(list);
		System.out.println(al);
		
		al.set(1, 250);
		System.out.println(al);
		
		al.remove(1);
		System.out.println(al);
		
		System.out.println("Arraylist is empty : "+al.isEmpty());
		
		System.out.println(al.equals(list));
		
		System.out.println(al.contains(400));
		System.out.println(al.indexOf(400));
		System.out.println(al.lastIndexOf(400));
		

	}

}
