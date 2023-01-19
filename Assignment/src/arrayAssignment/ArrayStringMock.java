package arrayAssignment;

import java.util.Arrays;

public class ArrayStringMock {
	
	void checkLength(String arr[]) {
		int index=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].length()>arr[j].length())
				{
//					String temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
					index=i;
				}
			}
		}
		
		
		for(int i=0;i<arr.length;i++) {
			if(index==i) {
				System.out.println(arr[i]);
			}
		}
		
//		System.out.println(Arrays.toString(arr));
		
//		System.out.println(Arrays.toString(arr));
		
		


	}

	public static void main(String[] args) {
		ArrayStringMock a=new ArrayStringMock();
		String str[]= {"java","Length","Advance","Core"};
		a.checkLength(str);

	}

}
