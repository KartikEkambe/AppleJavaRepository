package polymorphism.overriding;

public class Fruit {
	
	void taste() {
		System.out.println("Fruits are generally sweet in taste");
	}

}

class Apple extends Fruit{
	void taste() {
		System.out.println("Apples are  sweet to taste");
	}
}

class Strawberry extends Fruit{
	void taste() {
		System.out.println("Strawberries  are  sweet and sour in taste");
	}
}