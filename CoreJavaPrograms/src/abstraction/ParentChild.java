package abstraction;


class A{
	final int a=200;
	static String city="Aurangabad";
	
	final void display() {
//		a=345;
		System.out.println("In class A display method : "+a);
	}
}

class B extends A{
	void displayMethod() {
		city="Chhatrapati Sambhaji Nagar";
		System.out.println("In class B display Method : "+a);
	}
}

public class ParentChild {
	

	public static void main(String[] args) {
		
		B b=new B();
//		b.display();
		b.displayMethod();
		System.out.println(B.city);



	}

}
