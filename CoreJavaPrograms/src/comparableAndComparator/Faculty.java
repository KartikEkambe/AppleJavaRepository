package comparableAndComparator;

public class Faculty  {

	int id,salary;
	String name,subject,dept;
	
	public Faculty(int id,String name,int salary,String subject,String dept) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.subject=subject;
		this.dept=dept;
		
	}
	
	public String toString() {
		return id+" "+name+" "+salary+" "+subject+" "+dept;
	}
	

	
	

}
