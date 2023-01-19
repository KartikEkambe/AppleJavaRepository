package abstraction;

public class BankProject implements Project{
	
	public void requirements() {
		System.out.println("Bank requirement is :100000 ");
	}
	
	public void planning() {
		System.out.println("Plamming for the Bank project");
	}
	public void design() {
		System.out.println("Designing phase");
	}
	public void development() {
	System.out.println("Development Team");
	}
	public void testing() {
		System.out.println("Testers test the project");
	}
	public void deployment() {
		System.out.println("Deployment of Bank project");
	}
	public void maintainance() {
		System.out.println("Maintaining the project");
	}
}
