package collection;

import java.util.*;

public class ArrayListNonGenericEx {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add('a');
		al.add(23);
		al.add(25.5);
		al.add("Vaibhav");
		al.add(30);
		al.add("Pune");
		al.add(55.6f);
		al.add(65);
//		al.add(new StudentEx(101, "Kiran", 67));

		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i) + " ");
		}
		System.out.println();
		for (Object o : al) {
			String s = o.getClass().getSimpleName();
			if (s.equalsIgnoreCase("Integer"))
				System.out.println(o);

		}

	}

}
