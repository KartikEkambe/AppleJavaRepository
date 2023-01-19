package abstraction;

interface Aa{
	void add(int a,int b);
	void sqrt(int a);
	
}
interface Bb{
	void square(int a);
	void sqrt(int a);
}


class ABC implements Aa,Bb{ 
	public void add(int a,int b) {
		System.out.println("Addition is : "+(a+b));
		
	}
	
	public void square(int a) {
		System.out.println("Square is : "+(a*a));
	}
	
	public void sqrt(int a) {
		System.out.println("Square root is : "+Math.sqrt(a));
	}
}


public class MultipleMain {

	public static void main(String[] args) {
		
		ABC a=new ABC();
		a.add(4, 8);
		a.square(9);
		a.sqrt(121);
		
		
		
	}

}
