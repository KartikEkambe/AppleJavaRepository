package string;

import java.util.Arrays;

public class PrintNumber {

	public static void main(String[] args) {

		String s = "Java5Core6Language4";
		char ch[] = s.toCharArray();
		System.out.println(Arrays.toString(ch));
		int add = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]>='0'&&ch[i]<='9') { //Character.igDigit(ch[i]);

				add = add + (ch[i] -48);
//				add=add+Character.getNumericValue(ch[i]);
				
				
				System.out.println(ch[i]);
			}
		}
		System.out.println("Addition is : " + add);

	}

}
