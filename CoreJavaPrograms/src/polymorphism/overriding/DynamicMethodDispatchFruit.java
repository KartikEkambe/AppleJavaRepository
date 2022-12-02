package polymorphism.overriding;

public class DynamicMethodDispatchFruit {

	public static void main(String[] args) {
		
		Fruit f=new Fruit();
		f.taste();
		
		f=new Apple();
		f.taste();
		
		f=new Strawberry(); //upcasting : Child class object stored in reference variable of parent class...
		f.taste();
		
//		Apple a=new Fruit();//downcasting



	}

}
