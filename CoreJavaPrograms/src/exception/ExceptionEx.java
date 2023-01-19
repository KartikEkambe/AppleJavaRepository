package exception;

public class ExceptionEx {
	void add(int a,int b) {
		System.out.println("Addition is : "+(a+b));
	}
	
	void sub(int a,int b) {
		System.out.println("Subtraction is : "+(a-b));
	}
	
	void mul(int a,int b) {
		System.out.println("Multiplication is : "+(a*b));
	}
	void div(int a,int b) {
		System.out.println("Division is : "+(a/b));
	}

	public static void main(String[] args) {

		ExceptionEx e1=new ExceptionEx();
		int a=150,b=0;
		e1.add(a, b);
		try {		
			e1.div(a, b);
		}
		catch(ArithmeticException e){
//			System.out.println(e);
			e.printStackTrace();
		}
		e1.sub(a, b);
		e1.mul(a, b);


	}

}
