package assignment2DArray;

import java.util.Scanner;

public class SparseMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int c=3,r=3,cnt=0;
		int size=r*c;
		int arr[][]=new int [r][c];
		
		System.out.println("enter the array Elements ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
			
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==0) {
					cnt++;
				}
				
			}
			
		}
		
		if(cnt>(size/2)) {
			System.out.println("Sparse");
		}
		else {
			System.out.println("Not Sparse");
		}
		
		
		
		
	}

}
