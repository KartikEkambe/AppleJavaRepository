package inheritance.hierarchicalInheritance;

public class Child01 extends Father01 {
	String firstName2;

	public void setFirstName2(String firstName2) {
		this.firstName2 = firstName2;
	}
	
	void display() {
		super.display();
		System.out.println("Child Info : ");
		System.out.println(firstName2+" "+super.firstName1+" "+Child01.lastName);
	}

}
