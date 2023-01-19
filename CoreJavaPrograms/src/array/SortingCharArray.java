package array;

import java.util.Arrays;

public class SortingCharArray {

	public static void main(String[] args) {
		char ch[]= {'a','z','d','c','x','c'};
		System.out.println(Arrays.toString(ch));
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch.length-1;j++) {
				if(ch[j]>ch[j+1]) {
					char temp=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(ch));

	}

}
