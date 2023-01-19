package writtenComparatorHashMap11;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student02> {
public int compare(Student02 s1,Student02 s2) {
	if(s1.age>s2.age)
		return 1;
	else if(s1.age<s2.age)
		return -1;
	else
		return 0;
}
}
