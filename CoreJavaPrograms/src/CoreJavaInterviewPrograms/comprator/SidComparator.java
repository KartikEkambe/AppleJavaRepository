package CoreJavaInterviewPrograms.comprator;

import java.util.Comparator;

public class SidComparator implements Comparator<Students> {

	@Override
	public int compare(Students o1, Students o2) {
		// TODO Auto-generated method stub
		return o1.getSid()-o2.getSid();
	}

}
