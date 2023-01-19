package string;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "abcba";
		String revstr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			revstr = revstr + str.charAt(i);

		}
		System.out.println(str);

		System.out.println(revstr);
//		if(str.toLowerCase().equals(revstr.toLowerCase()))
//			System.out.println("Palindrome");
//		else
//			System.out.println("Not Palindrome");

		if (str.equalsIgnoreCase(str)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}
}
