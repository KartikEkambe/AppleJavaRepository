package arrayAssignment;

import java.util.Arrays;

public class EqualityCheck {

	public static void main(String[] args) {
		int arr1[] = { 12, 22, 32, 42, 52, 62 };
		int arr2[] = { 52, 22, 62, 12, 42, 22 };
		System.out.println(Arrays.toString(arr2));


		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length - 1; j++) {
				if (arr2[j] > arr2[j + 1]) {
					int temp = arr2[j];
					arr2[j] = arr2[j + 1];
					arr2[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr2));


		if (arr1.length == arr2.length) {
			int flag = 0;
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					flag = 1;
					break;
				}

			}
			
			if (flag == 0)
				System.out.println("Here both array are equal");
			else
				System.out.println("Here both array are Not equal");
			
		} else {
			System.out.println("Both array are Not equal");

		}

//		System.out.println(Arrays.toString(arr2));

	}

}
