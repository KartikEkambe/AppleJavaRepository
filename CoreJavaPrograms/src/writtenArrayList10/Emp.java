package writtenArrayList10;

public class Emp {
	
	int id;
	String name,dept;
	public Emp() {}
	public Emp(int id,String name,String dept) {
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
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

	public String toString() {
		return id+" "+name+" "+dept;
	}
	
}
