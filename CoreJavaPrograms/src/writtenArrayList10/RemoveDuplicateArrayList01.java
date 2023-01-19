package writtenArrayList10;
import java.util.*;
public class RemoveDuplicateArrayList01 {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList<String>();
        al.add("Sun");
        al.add("Mon");
        al.add("Sat");
        al.add("Sun");
        al.add("Mon");
        al.add("Sat");
        al.add("Sun");
        al.add("Sat");
        al.add("Sun");
        al.add("Mon");
        
        ArrayList<String> list=new ArrayList<String>();
        for(String s:al) {
        	if(!list.contains(s)) {
        		list.add(s);
        	}
        }
        
        System.out.println(list);


	}

}
