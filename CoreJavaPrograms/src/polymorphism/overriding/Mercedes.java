package polymorphism.overriding;

public class Mercedes extends Car{
	
	void dashboard() {
		super.dashboard();
		System.out.println("dashboard : Screen");
	}
	void enginePower() {

		System.out.println("Mercedes EnginePower : 11906");
	}
		
	
}
