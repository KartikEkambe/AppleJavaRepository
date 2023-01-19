package comparableAndComparator;

import java.util.ArrayList;

public class Student01 implements Cloneable{
	String name;
	ArrayList<Integer>marks;
	
	public Student01(String name,ArrayList<Integer> marks) {
		this.name=name;
		this.marks=marks;
	}
	
	public String toString() {
		return name+" "+marks;
	}
	
	
	public Object clone() throws CloneNotSupportedException{
		Student01 s=(Student01)super.clone();
		s.marks=(ArrayList<Integer>)marks.clone();
		return s;
	}

}
