package inheritance;

public class Student {
	
	private int rollno;
	private String name;
	Department dept;
	
	public void setRollno(int rollno) {
		this.rollno=rollno;
	}
	public int getRollno() {
		return rollno;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setDept(Department dept) {
		this.dept=dept;
	}
	public Department getDept() {
		return dept;
	}
	
	public String toString() {
		return rollno + " " + name + " " + dept ;
	}
	
	
//	Student(int rollno,String name,Department dept){
//		this.rollno=rollno;
//		this.name=name;
//		this.dept=dept;
//	}
	
	

}
