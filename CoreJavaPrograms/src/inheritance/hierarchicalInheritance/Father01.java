package inheritance.hierarchicalInheritance;

public class Father01 extends GrandFather01 {

	String firstName1;

	public void setFirstName1(String firstName1) {
		this.firstName1 = firstName1;
	}
	
	void display() {
		super.display();
		System.out.println("Father Info : ");
		System.out.println(firstName1+" "+super.firstName+" "+Father01.lastName);
	}
	
}
