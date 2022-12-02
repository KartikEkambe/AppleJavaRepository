package abstraction;

public class SwiftDzire extends Car {
	
	void setData(String engine, int price) {
		this.engine=engine;
		this.price=price;
		
	}
	
	void displayInfo() {
		System.out.println(price+" "+engine);
	}

	void dashboard() {
		
		System.out.println("SwiftDzire has : Ac, Music System,screen");
		
	}
	
	void saferyFeatures() {
		System.out.println("SwiftDzire : AirBags, child Lock");
	}
	
	void buildQuality() {
		System.out.println("Swift Dzire : 3.5 Start rated");
	}
}
