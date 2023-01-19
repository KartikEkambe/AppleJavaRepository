package array;

import java.util.Arrays;

public class Practice {
	public static void main(String[] args) {
	
		 int arr1[] = {12, 22,32, 42, 52, 62};
		 int arr2[] = {52, 22, 62, 12, 42, 32,44};
		 System.out.println(Arrays.toString(arr2));
		 
		 
		for(int i=0;i<arr2.length;i++) {
			for(int j=i+1;j<arr2.length;j++) {
				if(arr2[i]>arr2[j]) {
					int temp=arr2[i];
					arr2[i]=arr2[j];
					arr2[j]=temp;
					
				}
				
			}
		}
		
		System.out.println(Arrays.toString(arr2));
		
		if(arr1.length==arr2.length) {
			int flag=0;
			for(int i=0;i<arr2.length;i++) {
				if(arr1[i]!=arr2[i]) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println("Both array are equal");
			}else {
				System.out.println("Both array are not equal");
			}
			
		}else {
			System.out.println("Both Array are not equal");
		}


	}

}
