package exception;

public class NestedTryCatch {
	public static void main(String[] args) {
		int a = 200, b = 0;
		String s = "Java ";
		int arr[] = { 10, 20, 30, 40, 50 };
		String st = null;

		try {
			try {
				try {
					try {
						System.out.println(a/b);

					} catch (StringIndexOutOfBoundsException e) {
						e.printStackTrace();
					}
					System.out.println(s.charAt(2));
					System.out.println();
				} catch (ArithmeticException e) {
					e.printStackTrace();
				}
				System.out.println(arr[10]);
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
			System.out.println(st.length());
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println("Done ...NestedTryCatch");
	}

}
