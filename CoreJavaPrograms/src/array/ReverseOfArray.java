package array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseOfArray {

	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the size of array");
//		int size=sc.nextInt();
//		int arr[]=[size]
		
		
		int arr[]= {10,20,30,40,50,60};
		int n=arr.length;
		int mid=n/2;
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<mid;i++) {
			int temp=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
