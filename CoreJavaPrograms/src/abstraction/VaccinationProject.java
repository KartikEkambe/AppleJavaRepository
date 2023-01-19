package abstraction;

public class VaccinationProject implements Project {
	public void requirements() {
		System.out.println("Vaccination requirement is : 10000");
	}
	
	public void planning() {
		System.out.println("Plamming for the vaccination project");
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
		System.out.println("Deployment of vaccination project");
	}
	public void maintainance() {
		System.out.println("Maintaining the project");
	}

}
