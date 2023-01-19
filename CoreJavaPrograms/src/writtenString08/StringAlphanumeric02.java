package writtenString08;

public class StringAlphanumeric02 {

	public static void main(String[] args) {
		String str = "Kartik$9096@407047";
		int alpha = 0, digit = 0, specialchar = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.toLowerCase().charAt(i) >= 'a' && str.toLowerCase().charAt(i) <= 'z') {
				alpha++;
			} else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				digit++;
			} else {
				specialchar++;
			}
		}

		System.out.println("Total Number of Alphabet : " + alpha + "\nTotal Number of Digit : " + digit
				+ "\nTotal Number of Special character is : " + specialchar);

	}

}
