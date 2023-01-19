package comparableAndComparator;
import java.util.*;
public class ComparableEx1 {
	
 void comparableArrayList(ArrayList<Integer> al) {
	 al.add(86);
	 al.add(22);
	 al.add(65);
	 al.add(1256);
	 al.add(682);
	 al.add(5);
	 al.add(836);
	 al.add(122);
	 al.add(35);
 }
 void sortArraList(ArrayList<Integer> al) {
	 Collections.sort(al);
 }
 void sortDecendingArraList(ArrayList<Integer> al) {
	 Collections.sort(al);
	 //sort in reverse order
	 Collections.reverse(al);
 }
	public static void main(String[] args) {
	 ArrayList<Integer> al=new ArrayList<Integer>();
	 ComparableEx1 c=new ComparableEx1();
	 c.comparableArrayList(al);
	 System.out.println(al);
	 c.sortArraList(al);
	 System.out.println(al);
	 c.sortDecendingArraList(al);
System.out.println(al);
	


	}

}
