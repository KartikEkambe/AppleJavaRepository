package array;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		int arr[]= {10,50,30,60,20,40,9,8,70};
		
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Min value is : "+arr[0]);
		System.out.println("Max value is : "+arr[arr.length-1]);
		
		
//		System.out.println("Second max value is : "+arr[arr.length-2]);
//		System.out.println("Second Minimum value is : "+arr[1]);
		

	}

}
