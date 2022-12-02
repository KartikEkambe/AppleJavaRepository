package staticpack;

public class Movie {
	
	//where are the instance variables initialized??
	//=> constructor,instance block,simple method
	
	
	int id;
	String name,producer;
	
	
	//Where are static variable are initialized??
	//=> constructor,static method,static block,instance block...
	
	{
		System.out.println("instance block 1");
		id=111;
		name="Kantara";
		producer="Rishabh Shetty";
	}
	
	{
		System.out.println("instance block 2");
		id=111;
		name="Kantara";
		producer="Rishabh Shetty";
	}
	
	Movie(){
		System.out.println("simple constructor");
		id=111;
		name="Kantara";
		producer="Rishabh Shetty";
		
		
	}
	
	void display() {
		System.out.println(id+" "+name+" "+producer);
	}

	public static void main(String[] args) {
		
		Movie m1=new Movie();
		m1.display();
		
		System.out.println("\n--------------*********************--------------------\n");
		
		
		Movie m2=new Movie();
		m2.display();

	}

}
