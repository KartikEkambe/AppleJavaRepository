package collection;

public class StudentEx {

	int id;
	String name;
	int marks;
	
	
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	public StudentEx() {}
	public StudentEx(int id,String name,int marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	
	
	public String toString() {
		return id+" "+name+" "+marks;
	}

}
