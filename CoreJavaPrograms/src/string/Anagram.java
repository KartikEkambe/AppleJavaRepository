package string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="World";
		String s2="rolWd";
		if(s1.length()==s2.length()) {
			char a[]=s1.toCharArray();
			char b[]=s2.toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			int flag=1;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i]) {
					flag=0;
					break;
				}
			}
			
			if(flag==1) {
				System.out.println("anagram");
			}
			else {
				System.out.println("not anagram");
			}
			
		}
		else
		{
			System.out.println("Not Anagram");
		}
	}
}
