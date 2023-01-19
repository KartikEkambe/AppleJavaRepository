package string;

import java.util.Scanner;

public class StringBufferBuilder {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Core ");
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a string");
//		String s=sc.nextLine();
//		sb.append(s);
		
		
		sb.append(" Java Programming Language");
		System.out.println(sb);

		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.deleteCharAt(10);
		System.out.println(sb);
		sb.delete(10, 20);
		System.out.println(sb);
		sb.setCharAt(11, 'l');
		System.out.println(sb);
		sb.insert(10, "Programming");
		System.out.println(sb);

	}

}
