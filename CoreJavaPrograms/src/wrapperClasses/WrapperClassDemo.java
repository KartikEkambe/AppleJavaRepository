package wrapperClasses;

public class WrapperClassDemo {
	public static void main(String[] args) {
		int num=10;
		Integer it=new Integer(num); //boxxing/wrapping
		
		Integer it1=num;  //Autoboxing
		
		Integer it2=new Integer(num);
		
		System.out.println(it==it2); //double equals check the address
		
		System.out.println(it.equals(it2)); //equals() check the contents
		
		Integer a=new Integer(1000);
		int t=a.intValue(); //unboxing
		int b=a;  // Auto unboxing
		
		char ch='x'; //primitive datatype to object
		
		Character ch2=ch;//autoboxing
		
		Character ch3=new Character('z'); //object to primitive datatype
		char ch4=ch3;//auto Unboxing
		
	}

}
