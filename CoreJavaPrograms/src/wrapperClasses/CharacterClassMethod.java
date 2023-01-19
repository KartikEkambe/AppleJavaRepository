package wrapperClasses;

public class CharacterClassMethod {

	public static void main(String[] args) {
		
		char ch='a';
		int i=Character.getNumericValue(ch);
		System.out.println(i);
		
		System.out.println("Digit : "+Character.isDigit(ch));
		System.out.println("Character : "+Character.isLetter(ch));
		System.out.println("LowerCase : "+Character.isLowerCase(ch));
		System.out.println("UpperCase : "+Character.isUpperCase(ch));
		System.out.println("whiteSpace : "+Character.isWhitespace('\t'));
		System.out.println("IsJavaLetter : "+Character.isJavaLetter('$'));
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);

		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.max(12, 35));
		System.out.println(Integer.compare(100, 50));
		System.out.println(Integer.toBinaryString(5));
		System.out.println(Integer.toHexString(5));
		System.out.println(Integer.toOctalString(5));

		System.out.println(Integer.sum(20, 30));

		System.out.println();

	}
}
