package writtenComparatorHashMap11;

import java.util.Comparator;

public class NameComparator implements Comparator<Student02> {
public int compare(Student02 s1,Student02 s2) {
	return s1.name.compareTo(s2.name);
}
}
