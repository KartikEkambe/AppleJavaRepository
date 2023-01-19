package arrayAssignment;

public class EqualArray {

	public static void main(String[] args) {
		int arr1[] = { 10, 20, 30, 40, 50, 60 };
		int arr2[] = { 10, 20, 30, 40, 50 };
		int cnt = 0;
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length && i < arr2.length; i++) {
				if (arr1[i] != arr2[i]) {
					cnt++;
				}
			}
		}

		if (cnt == 0) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}

	}

}
