package writtenExceptionHandling;

public class ThrowAndThrowsEx02 {
	
	int getStringLength(String s) throws NullPointerException{
		if(s==null) {
			throw new NullPointerException("String is null...null string is not allowed");
		}
		return s.length();
	}

	public static void main(String[] args) {
		
		ThrowAndThrowsEx02 tt=new ThrowAndThrowsEx02();
		
		System.out.println(tt.getStringLength("Latur"));
		System.out.println(tt.getStringLength("Pune"));
		
		try {
			System.out.println(tt.getStringLength(null));
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println(tt.getStringLength("Nagpur"));



	}

}
