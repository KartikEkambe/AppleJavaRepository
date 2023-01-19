package arrayAssignment;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		int b[]=new int [9];
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		System.out.println(Arrays.toString(b));

	}

}
