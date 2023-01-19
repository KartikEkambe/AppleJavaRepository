package writtenComparatorHashMap11;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee01> {
	public int compare(Employee01 e1, Employee01 e2) {
		if (e1.name.compareTo(e2.name) == 0) {
			if (e1.id > e2.id)
				return 1;
			else if (e1.id < e2.id)
				return -1;
			else
				return 0;

		} else {
			return e1.name.compareTo(e2.name);
		}
	}
}
