package exception;

public class ThrowAndThrows {

	int getStringLength(String s) throws NullPointerException {
		
		if(s==null) {
			throw new NullPointerException("String is null....Null String not allowed");
		}
//		
		return s.length();
	}
	public static void main(String[] args) {
		ThrowAndThrows t=new ThrowAndThrows();

		System.out.println(t.getStringLength("Mumbai"));
		System.out.println(t.getStringLength("pune"));
		
		try {
			System.out.println(t.getStringLength(null));

		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		System.out.println(t.getStringLength("Latur"));




		

	}
	
	

}
