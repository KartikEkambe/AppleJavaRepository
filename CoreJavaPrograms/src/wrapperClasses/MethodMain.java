package wrapperClasses;

public class MethodMain {
	void display(float a) {
		System.out.println("Float");
	}
	void display(Number a) {
		System.out.println("Number");
	}
	public static void main(String[] args) {
		MethodMain m=new MethodMain();
		m.display(100);
//		m.display(1000);
	}

}
