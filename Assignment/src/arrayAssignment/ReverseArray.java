package arrayAssignment;

public class ReverseArray {
	
	void reverse(int arr[]) {
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		ReverseArray r=new ReverseArray();
		int arr[]= {4,8,12,16,20,24,28};
		r.reverse(arr);

	}

}
