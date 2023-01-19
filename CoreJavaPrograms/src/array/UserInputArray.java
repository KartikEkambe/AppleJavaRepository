package array;

import java.util.Arrays;
import java.util.Scanner;

public class UserInputArray {

	void primeArray(int a[]) {
		for (int i = 0; i < a.length; i++) {

			int mid = a[i] / 2;
			int j;
			for (j = 2; j <= mid; j++) {
				if (a[i] % j == 0)
					break;

			}

			if (j > mid) {
				System.out.println("Prime number is : " + a[i]);
			}

		}

	}

	void reverseArray(int arr[]) {
		System.out.println("Reverse array is : ");
		for (int i = arr.length-1 ; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	void temporaryReverse(int arr[]) {
		
		System.out.println("Reverse array is : ");
		for (int i = arr.length-1 ; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	

	void evenElements(int arr[]) {
		System.out.println("Even elements in array : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}

		}
		System.out.println();

	}

	void display(int arr[]) {
		System.out.println("Elements in array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserInputArray u = new UserInputArray();
		System.out.println("Enter size of array ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the elements of array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
//		u.evenElements(arr);
//		u.display(arr);
		u.reverseArray(arr);
		u.primeArray(arr);

//		System.out.println("Array Elements are : "+Arrays.toString(arr));

	}

}
