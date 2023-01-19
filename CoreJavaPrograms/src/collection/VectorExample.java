package collection;
import java.util.*;
public class VectorExample {

	public static void main(String[] args) {
		Vector<Integer>vec=new Vector<>();
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		vec.add(50);
		vec.add(60);
		System.out.println(vec);
		Enumeration<Integer>en=vec.elements();//it is failSafe iterator
		while(en.hasMoreElements()) {
			if(en.nextElement()==10)
				vec.add(200);
		}
		System.out.println(vec);

	}

}
