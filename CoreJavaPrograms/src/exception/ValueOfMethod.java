package exception;

public class ValueOfMethod {

	public static void main(String[] args) {
		Integer i=Integer.valueOf(123);
		System.out.println(i);
		
		Integer i1=Integer.valueOf("1234");//it convert into Integer object
		System.out.println(i1);
		Integer i2=Integer.valueOf("1101", 2);
		System.out.println(i2);
		
		String s="12345";
		int x=Integer.parseInt(s);//it convert into primitive data type
		System.out.println(x);
		
		float f=Float.parseFloat("34.43");
		System.out.println(f);
		


	}

}
