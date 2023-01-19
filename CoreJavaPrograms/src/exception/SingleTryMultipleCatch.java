package exception;

public class SingleTryMultipleCatch {

	public static void main(String[] args) {
		
		int a=200,b=3;
		String s="Java ";
		int arr[]= {10,20,30,40,50};
		String st=null;
		
		try {
			System.out.println("Division is : "+(a/b));
			System.out.println("Char At  : "+s.charAt(10));
			System.out.println("Element at index is : "+arr[4]);
			System.out.println(st.length());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Done");
		System.out.println("Multiple Catch");

	}

}
