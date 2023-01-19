package arrayAssignment;

import java.util.Arrays;

public class SecondMax {
	int max,secmax;
	void max(int arr[]) {
		
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}

		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Second Max value is "+arr[arr.length-2]);
	}

	public static void main(String[] args) {
		int arr[]= {20, 0, 31, 45, 100, 1, 105, 90};
		SecondMax s=new SecondMax();
		s.max(arr);

	}

}
