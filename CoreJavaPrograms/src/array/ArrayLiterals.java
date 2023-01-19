package array;

public class ArrayLiterals {

	void arrayLength(int a[]) {
		System.out.println("Length of array is : " + a.length);
	}

	void arrayElements(int a[]) {
		System.out.println("Array elements are : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
			
		}
		System.out.println();
	}
	
	void alternateElements(int a[]) {
		System.out.println("Alternate Array elements are : ");
		for (int i = 0; i < a.length; i+=2) {
			System.out.print(a[i] + " ");
			
		}
		System.out.println();
	}

	void searchElement(int a[], int element) {
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == element) {
				System.out.println(a[i] + " - Element is present at index : " + i);
			} else
				cnt++;

		}

		if (cnt == a.length) {
			System.out.println("Element is not present in array");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70,80,90};
		ArrayLiterals a = new ArrayLiterals();	
		a.arrayLength(arr);
		a.arrayElements(arr);
	
		a.searchElement(arr, 50);
		a.alternateElements(arr);
	
		

	}

}
