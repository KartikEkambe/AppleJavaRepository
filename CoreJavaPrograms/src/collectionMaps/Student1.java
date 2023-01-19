package collectionMaps;

public class Student1 {
	int id;
	String name,dept;
	int marks;
	public Student1(int id, String name, String dept, int marks) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.marks = marks;
	}
	
	public String toString() {
	return id+" "+name+" "+dept+" "+marks;
	}
	
	public int hashCode() {
		return id;
	}
	
	public boolean equals(Object o) {
		Student1 s=(Student1) o;
		if(this.id==s.id) {
			s.name=this.name;
//			s.dept=this.dept;
//			s.marks=this.marks;
			return true;
		}else {
			return false;
		}
	}

}