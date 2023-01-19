package collection;
import java.util.*;
public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		al.add(90);
		al.add(99);
		al.add(120);
		al.add(110);

		Integer arr[]=new Integer[al.size()];
		al.toArray(arr); //Arraylist to specified wrapper type
		
		int ar[]=new int [al.size()];
		for(int i=0;i<al.size();i++) {
			ar[i]=al.get(i);
		}
		
		
		Integer array[]= {1,2,3,4,5,4,6,4,3,7,8,6};
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(array));

		
		int ary[]= {1,2,3,4,5,4,6,4,3,7,8,9};
		ArrayList<Integer> all=new ArrayList<Integer>();
		for(int i:ary) {
			all.add(i);
		}
		
		System.out.println(all);
	}

}
