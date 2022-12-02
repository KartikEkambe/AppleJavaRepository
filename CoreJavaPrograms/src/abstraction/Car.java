package abstraction;

public abstract class Car {
	String engine;
	int price;
	
	void wheelNo() {
		System.out.println("Every car has  wheels : 4");
	}
	void headlight() {
		System.out.println("Number of headlights : 2");
	}
	
	abstract void dashboard();
	abstract void saferyFeatures();
	abstract void buildQuality();

	
	

}
