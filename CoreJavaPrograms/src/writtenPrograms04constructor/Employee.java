package writtenPrograms04constructor;

public class Employee {
	private int emp_id;
	private String name;
	private int sal;
	
	public void setEmp_id(int emp_id) {
		this.emp_id=emp_id;	
		}
	
	public int getEmp_id() {
		return emp_id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSal(int sal) {
		this.sal=sal;
	}
	
	public int getSal() {
		return sal;
	}
	
	Employee(){
			
	}
	
	Employee(int emp_id,String name,int sal){
		this.emp_id=emp_id;
		this.name=name;
		this.sal=sal;
	}

}
