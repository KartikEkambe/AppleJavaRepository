package CoreJavaInterviewPrograms.comprator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ComprableAndComparator {

	public static void main(String[] args) {
		ArrayList<Students> std=new ArrayList<>();
		std.add(new Students(12, "Kartik", "BCA", 71));
		std.add(new Students(3, "Bali", "B.Tech", 67.09f));
		std.add(new Students(23, "Vaibhav", "B.Tech", 80.09f));

		System.out.println(std);
		Collections.sort(std,new SidComparator());
		System.out.println(std);
		
		

	}

}
