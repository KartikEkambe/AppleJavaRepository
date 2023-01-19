package writtenString08;

import java.util.Arrays;
import java.util.Scanner;

public class StringOccurence04 {

	public static void main(String[] args) {
		String str="Java Language. java session core java session";
		String word="java";
		
		String s1[]=str.split(" ");
		System.out.println(Arrays.toString(s1));
	
		String s="";
		
//		for(int i=0;i<s1.length;i++) {
//			if(!s1[i].equalsIgnoreCase(word)) {
//				s=s+s1[i]+" ";
//			}
//		}
//		System.out.println(s);
		
		String str1[]=new String[s1.length];
		int j=0;
		for(int i=0;i<s1.length;i++) {
			if(!s1[i].equalsIgnoreCase(word)) {
				str1[j]=s1[i];
				j++;
			}
		}
		
		for(String st:str1) {
			if(st!=null) {
				System.out.print(st+" ");
			}
		}
		

	}

}
