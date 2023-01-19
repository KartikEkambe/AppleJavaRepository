package arrayAssignment;

import java.util.Arrays;

public class ReverseUsinnTempArr {

	public static void main(String[] args) {
		int arr[] = { 3, 90, 45, 29, 37, 78 };
		System.out.println(Arrays.toString(arr));
		int len=arr.length;
		int rev[]=new int[len];
		int j=0;
		for(int i=len;i>0;i--,j++) {
			rev[j]=arr[i-1];
		}
		System.out.println(Arrays.toString(rev));
	}

}
