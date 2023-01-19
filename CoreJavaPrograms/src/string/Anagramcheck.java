package string;

import java.util.Arrays;

public class Anagramcheck {
	
	public static void main(String[] args) {
		String s1="World";
		String s2="rlodW";
		
		char a[]=s1.toCharArray();
		char b[]=s2.toCharArray();
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1l;j++) {
				if(a[j]>a[j+1]) {
					char temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length-1;j++) {
				if(b[j]>b[j+1]) {
					char temp=b[j];
					b[j]=b[j+1];
					b[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		
		if(s1.length()==s2.length()) {
			int flag=1;
			for(int i=0;i<a.length;i++) {
				if(a[i]!=b[i]) {
					flag=0;
					break;
				}
			}
			if(flag==1) {
				System.out.println("angram");
			}else {
				System.out.println("not angram");
			}
			
		}else {
			System.out.println("Not Angram");
		}
		
		
		
	}

}
