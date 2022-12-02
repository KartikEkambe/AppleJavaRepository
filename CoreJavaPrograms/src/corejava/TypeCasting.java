package corejava;

public class TypeCasting {
	public static void main(String args[]) {
		char ch='A' , lowc='b' ;
	
//		int i=ch;
//		int j=lowc;
//		i=i+32;
//		
//		System.out.println((char)i);
//		
//		j=j-32;
//		
//		System.out.println((char)j);

		ch=(char)(ch+32);
		System.out.println("Upper to lower = "+ch);
		
		lowc=(char)(lowc-32);
		System.out.println("Lower to upper = "+lowc);
		
		
		
	}

}
