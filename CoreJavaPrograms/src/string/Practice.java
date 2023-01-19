package string;

import java.util.*;

public class Practice {

	public static void main(String[] args) {
		String s1="World";
		String s2="orlWd";
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		System.out.println(Arrays.toString(ch1));
		Arrays.sort(ch1);
		Arrays.sort(ch2);

		System.out.println(Arrays.toString(ch1));
	}

}
