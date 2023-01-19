package wrapperClasses;

public class ValueOfMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer i=Integer.valueOf(100);
		System.out.println(i);
		Integer i1=Integer.valueOf("1234");
		System.out.println(i1);
		Integer i2=Integer.valueOf("120", 3); //  1*3^2  + 2*3^1 + 0*3^0
		System.out.println(i2);
		
		//We can use ("String",radix) only with integer and long 
		
		Long l=Long.valueOf("121", 3);
		System.out.println(l);
		
//		Float f=Float.valueOf(0);
		
	}

}
