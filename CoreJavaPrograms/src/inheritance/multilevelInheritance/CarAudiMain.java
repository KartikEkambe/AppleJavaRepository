package inheritance.multilevelInheritance;

public class CarAudiMain {

	public static void main(String[] args) {
		AudiQ8 a=new AudiQ8();
		a.wheels();
		a.headlight();
		a.seatWarmer();
		a.seatWarmer();
		a.setPrice("1.2 crore");
		a.setEngine("Turbo Engine");
		System.out.println( a.getPrice()+" "+a.getEngine());

	}

}
