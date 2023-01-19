package exception;

public class FinallyBlock {
	public static void main(String[] args) {
		int a=12,b=0;
		
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally block is always execute whether exception handled or not");
		}
	}

}
