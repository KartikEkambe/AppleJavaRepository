package collectionMaps;

public class Student {
	String name,email;
	int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student() {}
	public Student(String name,String email,int marks) {
		this.name=name;
		this.email=email;
		this.marks=marks;
	}

}
