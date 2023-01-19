package writtenArray09;

import java.util.Arrays;

public class ReplaceNegativeValue {
	void replaceNegative(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				arr[i]=arr[i-1]*arr[i-1];
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[]= {12, 3, -19, 29, 5, -61, 44, 7, -9};
		

		ReplaceNegativeValue r=new ReplaceNegativeValue();
		r.replaceNegative(arr);
		
	}

}
