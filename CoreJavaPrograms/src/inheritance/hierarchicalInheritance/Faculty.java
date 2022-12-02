package inheritance.hierarchicalInheritance;

public class Faculty extends Person {
	String subject ;
	int salary;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	void pfCalsulator(int salary) {
		float pf=salary*0.15f;
		System.out.println("Calculated Pf is : "+pf);
	}

}
