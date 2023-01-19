package string;

public class StringFCharConcat {

	public static void main(String[] args) {
		String s1 = "hi";
		String s2 = "Hello";
		String s3 = "how";
//		
//		char c1[]=s1.toCharArray();
//		char c2[]=s1.toCharArray();
//		char c3[]=s1.toCharArray();
//		
//		for(int i=0;i<c2.length;i++) {
//			if(i<c1.length ) {
//				System.out.print(c1[i]);
//			}
//			if(i<c2.length) {
//				System.out.print(c2[i]);
//			}
//			if(i<c3.length) {
//				System.out.print(c3[i]);
//			}
//			System.out.println();
//		}
//		

			for(int i=0;i<5;i++) {
				if(i<s1.length()) {
				System.out.print(s1.charAt(i));
				}
				if(i<s2.length()) {
				System.out.print(s2.charAt(i));
				}
				if(i<s3.length()) {
				System.out.print(s3.charAt(i));
				}
				System.out.println();
			}
		
		
	

		

	}

}
