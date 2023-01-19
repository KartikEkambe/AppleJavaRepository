package arrayAssignment;

public class AddNumSumArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 5 };
		int add = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 5) {
				add = add + 5;
			} else if (arr[i] % 2 == 0) {
				add = add + 1;
			} else {
				add = add + 3;
			}
		}

		System.out.println(add);

	}

}
