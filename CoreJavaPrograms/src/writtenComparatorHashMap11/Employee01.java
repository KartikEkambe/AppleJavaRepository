package writtenComparatorHashMap11;

public class Employee01 implements Comparable<Employee01> {
	int id;
	String name, dept;
	Profile01 p;

	public Employee01(int id, String name, String dept,Profile01 p) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.p=p;
	}

	public String toString() {
		return id + " " + name + " " + dept+" "+p;
	}
	
	public int compareTo(Employee01 e) {
		return this.name.compareTo(e.name);
	}

}
