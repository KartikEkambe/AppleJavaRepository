package inheritance.hierarchicalInheritance;

public class GrandFather01 {
	
	static String lastName="Ekambe";
	String firstName,middleName;
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	
	void display() {
		System.out.println("Grandfather Info : ");
		System.out.println(firstName+" "+middleName+" "+lastName);
	}
	

}
