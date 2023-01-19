package ArrayOfObject;

import java.util.Arrays;

public class Company {
	int id;
	String name;
	Department dept[];
	
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
	public Department[] getDept() {
		return dept;
	}
	public void setDept(Department[] dept) {
		this.dept = dept;
	}
	

//	Company(int id, String name, Department[] dept) {
//
//		this.id = id;
//		this.name = name;
//		this.dept = dept;
//	}
//
//	public String toString() {
//		return id + " " + name + " " + Arrays.toString(dept) + "\n";
//	}

}
