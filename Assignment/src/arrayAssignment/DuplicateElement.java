package arrayAssignment;

public class DuplicateElement {
	public static void main(String[] args) {
		
		int arr[]= {3, 10, 90, 78, 56, 10, 78, 34, 61};
	
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}

	}
}
