package abstraction;

public class CalculatorMethod implements Calculator{
	public void addition(int a,int b) {
		System.out.println("Addition is : "+(a+b));
	}
	
	public void substraction(int a, int b) {
		System.out.println("Substraction is : "+(a-b));
	}
	
	public void multiplication(int a,int b) {
		System.out.println("Multiplication is : "+(a*b));
	}
	
	public void division(int a ,int b) {
		System.out.println("Division is : "+(a/b));
	}

}
