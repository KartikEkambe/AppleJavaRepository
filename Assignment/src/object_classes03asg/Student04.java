package object_classes03asg;

public class Student04 {
	
	private int id;
	private String name;
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	void display( int id,String name) {
		this.id=id;
		this.name=name;
		
		System.out.println("Student id : "+id+"\nStudent Name : "+name);
	}

}
