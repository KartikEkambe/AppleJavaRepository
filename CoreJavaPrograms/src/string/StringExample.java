package string;

import java.util.Arrays;

public class StringExample {

	public static void main(String[] args) {

		String s="Java is a good programming language";
		System.out.println(s.lastIndexOf('g'));
		
		String str[]=s.split(" ");
		System.out.println(Arrays.toString(str));
//		System.out.println(s.replace('g', 'G'));
		
		


	}

}
