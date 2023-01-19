package string;

import java.util.Arrays;

public class StringArray01 {

	public static void main(String[] args) {
		
		String str[]= {"Raj","Aadya","Veer","Rahul","Anjali","Ajay","Leena","Reena"};
		//print starting with R
		
//		for(int i=0;i<str.length;i++) {
//			if(str[i].startsWith("R"))
//			{
//				System.out.println(str[i]);
//			}
//		}

		
		//print ending with a
		
//		for(int i=0;i<str.length;i++) {
//			if(str[i].endsWith("a"))
//			{
//				System.out.println(str[i]);
//			}
//		}

		
		//print String contains j

//		for(int i=0;i<str.length;i++) {
//			if(str[i].contains("j"))
//			{
//				System.out.println(str[i]);
//			}
//		}
		
//		Arrays.sort(str);
//		System.out.println(Arrays.toString(str));
		
	
		
		//sort array without using predefined array
		
		System.out.println(Arrays.toString(str));
		
		for(int i=0;i<str.length;i++) {
			for(int j=0;j<str[i].length();j++) {
				if(str[j].compareTo(str[j+1])>0) {
					String s=str[j];
					str[j]=str[j+1];
					str[j+1]=s;
				}
			}
		}
		System.out.println(Arrays.toString(str));
		
		

	}

}
