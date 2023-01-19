package collectionMaps;
import java.util.*;
public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter elements");
		for(int i=0;i<10;i++) {
			al.add(sc.nextInt());
		}
		
		ArrayList<Integer>list=new ArrayList<Integer>();
		Iterator<Integer>itr=al.iterator();
		while(itr.hasNext()) {
			int i=itr.next();
			if(!list.contains(i))
				list.add(i);
		}
		
		for(Integer i:list) {
			System.out.print(i+" ");
		}
		
	}

}
