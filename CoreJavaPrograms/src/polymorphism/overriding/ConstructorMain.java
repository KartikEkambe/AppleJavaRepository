package polymorphism.overriding;

class A{
	A(){
		System.out.println("Inside Class A Constructor");
	}
	
}
class B extends  A{
	B(){
		System.out.println("Inside Class B Constructor");
	}
	B(int a){
		System.out.println("Inside Class B Parameterized Constructor");
	}
}
class C extends B{
	C(){	
//		super(10);
		System.out.println("Inside Class C  Constructor");
	}
	
	
}

public class ConstructorMain {

	public static void main(String[] args) {

		C c1=new C();
		

	}

}
