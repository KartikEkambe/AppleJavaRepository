package writtenComparatorHashMap11;

import java.util.Comparator;

public class RollNoComparator implements Comparator<Student02> {

	public int compare(Student02 s1, Student02 s2) {
		if (s1.rollNo > s2.rollNo)
			return 1;
		else if (s1.rollNo < s2.rollNo)
			return -1;
		else
			return 0;
	}
}
