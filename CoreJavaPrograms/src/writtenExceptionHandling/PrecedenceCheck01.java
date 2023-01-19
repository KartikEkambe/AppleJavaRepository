package writtenExceptionHandling;

public class PrecedenceCheck01 {

	public static void main(String[] args) {
		
		try {
			int a=4,b=4;
			System.out.println("Value in try block "+(a+b));
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			int a=5,b=4;
			System.out.println("Value in finally block "+(a*b));

		}

	}

}
