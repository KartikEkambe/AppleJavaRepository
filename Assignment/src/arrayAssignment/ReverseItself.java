package arrayAssignment;

import java.util.Arrays;

public class ReverseItself {

	public static void main(String[] args) {
		int arr[]= {3, 90, 45, 29, 37, 78};
		System.out.println(Arrays.toString(arr));
		int len=arr.length;
		int mid=len/2;
		for(int i=0;i<mid;i++) {
			int temp=arr[i];
			arr[i]=arr[len-i-1];
			arr[len-i-1]=temp;
		}
		
	
		
		
		System.out.println(Arrays.toString(arr));

	}

}
