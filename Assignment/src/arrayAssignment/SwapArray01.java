package arrayAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class SwapArray01 {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int arr[]=new int[4];
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("Enter 4 numbers");
//			arr[i]=sc.nextInt();
//		}
		int arr[]= {2, 4, 9, 0};
		System.out.println(Arrays.toString(arr));
		int len=arr.length;
		int mid=len/2;
		for(int i=0;i<mid;i++) {
			int temp=arr[i];
			arr[i]=arr[mid+i];
			arr[mid+i]=temp;
		}

		System.out.println(Arrays.toString(arr));



	}

}
