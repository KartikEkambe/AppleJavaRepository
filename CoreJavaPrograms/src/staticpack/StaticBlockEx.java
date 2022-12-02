package staticpack;

public class StaticBlockEx {
	
	int a;
	static int b;
	
	// static block are executed before the main method
	
	
	
	void display() {
		a++;
		System.out.println(a+b);
	}
	
	
	static
	{
		b++;
		System.out.println("Static block 1");
		StaticBlockEx s=new StaticBlockEx();
		s.display();
	}
	
	static
	{
		b++;
		System.out.println("Static block 2");
	}
	static
	{
//		a++;
		System.out.println("static block 3");
	}
	
	public static void main(String[] args) {
		System.out.println(b);
	}

}
