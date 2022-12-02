package staticpack;

public class NestedClassEx {
	int a=20;
	static int b=10;
	
	
	
	//we can create static class inside a class..
	//static class allows only static variable from outer class
	
	static class Inner{
		int c;
		static int d;
		
		 void display() {
//			System.out.println(a+" "+b);
			System.out.println(b);
		}
		
		
	}
	
	public static void main(String[] args) {
		
		NestedClassEx.Inner inner=new NestedClassEx.Inner();
		inner.display();
		
		
		}
	
	
	
	

}
