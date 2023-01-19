package arrayAssignment;

import java.util.Arrays;

public class ArrayDuplicateMock {
	
	void duplicate(int arr[]) {
		int temp[]=new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length;i++) {
			int cnt=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					cnt++;
					arr[j]='0';
					temp[k]=arr[i];
					k++;
				}
			}
			if(arr[i]!='0'&&cnt==1) {
//				System.out.print(arr[i]+" ");
				temp[k]=arr[i];
				k++;
			}
		}
		
		
		
		
		
		System.out.println(Arrays.toString(temp));
	}

	public static void main(String[] args) {
		ArrayDuplicateMock a=new ArrayDuplicateMock();
		int arr[]= {10,20,30,40,50,10,20,60};
		a.duplicate(arr);


	}

}
