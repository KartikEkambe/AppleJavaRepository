package writtenExceptionHandling;

public class NumberFormatExceptionex03 {

	public static void main(String[] args) {
		
		try{
		Integer i=new Integer("12sabc");
		System.out.println(i);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Number Format Exception : Invalid input string");
			e.printStackTrace();
		}
		System.out.println("Done...");

	}

}
