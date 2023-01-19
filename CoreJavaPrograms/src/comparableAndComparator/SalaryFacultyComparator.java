package comparableAndComparator;

import java.util.Comparator;

public class SalaryFacultyComparator implements Comparator<Faculty> {
public int compare(Faculty f1,Faculty f2) {
	if(f1.salary>f2.salary)
		return 1;
	else if(f1.salary<f2.salary)
		return -1;
	else
		return 0;
}
}
