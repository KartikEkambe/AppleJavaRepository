package writtenArrayList10;

import java.util.*;

public class EmpArrayListMain03 {

	public static void main(String[] args) {

		LinkedList<Emp> ll = new LinkedList<Emp>();
		ll.add(new Emp(10, "Anil", "Hr"));
		ll.add(new Emp(11, "Vaibhav", "Development"));
		ll.add(new Emp(12, "Sunil", "Sales"));
		ll.add(new Emp(13, "Sumit", "Marketing"));
		ll.add(new Emp(14, "Pravin", "Hr"));

		ll.add(new Emp(15, "Nitin", "Hr"));
		ll.add(new Emp(16, "Bhagyashree", "Sales"));
		ll.add(new Emp(17, "Satish", "Hr"));
		ll.add(new Emp(18, "Vipul", "Testing"));
		ll.add(new Emp(19, "Sanjay", "Hr"));
		System.out.println(ll);

		String s = "";
		for (Emp e : ll) {
			if (e.getId() == 10) {
				s = e.getDept();
				System.out.println(e.getId() + " " + e.getName() + " " + e.getDept());
			}
		}

		Iterator<Emp> itr = ll.iterator();
		while (itr.hasNext()) {
			Emp emp = itr.next();
			if (emp.getDept().equalsIgnoreCase(s)) {
				itr.remove();
			}
		}

//		for (Emp e : ll) {
//			if (e.getId() == 10) {
//				s = e.getDept();
//				System.out.println(e.getId() + " " + e.getName() + " " + e.getDept());
//			}
//			if(e.getDept().equalsIgnoreCase(s)) {
//				
//			}
//		}

		System.out.println(ll);

	}

}
