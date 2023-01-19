package writtenArray09;

import java.util.Scanner;

public class SumLowerTriangular {
	void sumOfLowerTriangular(int arr[][]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i>j) {
					sum=sum+arr[i][j];
				}
			}
		}
		System.out.println("Sum of lower Triangular : "+sum);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=3;
		int c=3;
		int arr[][]=new int[r][c];
		System.out.println("Enter the array elements :");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++ ) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		SumLowerTriangular sum=new SumLowerTriangular();
		sum.sumOfLowerTriangular(arr);

	}

}
