package writtenPrograms05Polymorphism;

public class Student01 {

	int rollno;
	String name;
	Department01 dept;
	
	Student01(int rollno,String name,Department01 dept){
		this.rollno=rollno;
		this.name=name;
		this.dept=dept;
	}
	
	public String toString() {
		return rollno+" "+name+"\n"+dept;
	}
	
	
	
}