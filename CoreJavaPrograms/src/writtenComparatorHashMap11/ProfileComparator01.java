package writtenComparatorHashMap11;

import java.util.Comparator;

public class ProfileComparator01 implements Comparator<Employee01> {


	public int compare(Employee01 e1, Employee01 e2) {
		return e1.p.country.compareTo(e2.p.country);
		
	}
}
