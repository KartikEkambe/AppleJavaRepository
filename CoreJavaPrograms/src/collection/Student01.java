package collection;
import java.util.*;
public class Student01 {
	int id;
	String name,dept;
	ArrayList<Integer>marks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public ArrayList<Integer> getMarks() {
		return marks;
	}
	public void setMarks(ArrayList<Integer> marks) {
		this.marks = marks;
	}
	public Student01(int id, String name, String dept, ArrayList<Integer> marks) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.marks = marks;
	}
	public Student01() {}


	public String toString() {
		return id+" "+name+" "+dept+" "+marks;
	}
	
}
