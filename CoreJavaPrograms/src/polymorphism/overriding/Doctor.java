package polymorphism.overriding;

public class Doctor extends Person {
	
	int id;
	String specilization,lisence;
	public void setId(int id) {
		this.id = id;
	}
	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}
	public void setLisence(String lisence) {
		this.lisence = lisence;
	}
	
	void display() {
		System.out.println("Doctor Details : ");
		super.display();
		System.out.println(id+" "+specilization+" "+lisence);
	}

}
