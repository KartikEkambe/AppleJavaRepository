package array;

import java.util.Arrays;

public class Reverse {

	void reverse() {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(Arrays.toString(arr));
		int mid = arr.length / 2;
		for (int i = 0; i < mid; i++) {
			int temp = arr[i];
			arr[i] = arr[mid + i];
			arr[mid + i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reverse r = new Reverse();
		r.reverse();
	}

}
