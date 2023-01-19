package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

public class FacultyMain {
	
	 void setData(ArrayList<Faculty> fac) {
		 fac.add(new Faculty(22,"Sharad",18999,"DBMS","Computer"));
		 fac.add(new Faculty(145,"V. Vyas",24599,"Stat","Commerce"));
		 fac.add(new Faculty(15,"P.Patil",18999,"Logical Reasoning","Computer"));
		 fac.add(new Faculty(90,"A Giri",29499,"c++","Computer"));
		 fac.add(new Faculty(88,"A Kulkarni",23999,"Account","Commerce"));
		 fac.add(new Faculty(99,"Giri",18999,"Political Science","Art"));

	 }

	public static void main(String[] args) {
		ArrayList<Faculty> faculty=new ArrayList<Faculty>();
		FacultyMain fm=new FacultyMain();
		fm.setData(faculty);
		System.out.println(faculty);
		Collections.sort(faculty,new DeptFacultyComparator());;
		System.out.println(faculty);
		
		

	}

}
