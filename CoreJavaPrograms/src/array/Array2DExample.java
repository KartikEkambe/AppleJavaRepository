package array;

import java.util.Scanner;

public class Array2DExample {

	void array2d() {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	void sumOfDiagonal(int a[][]) {
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i==j) {
					sum=sum+a[i][j];
				}
			}
		}
		System.out.println("Sum of diagonal is : "+sum);
	}
	
	void sumOfUpperTriangle(int a[][]) {
		int sum=0;
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i<j) {
					sum=sum+a[i][j];
				}
			}
		}
		System.out.println("Sum of upper triangle is : "+sum);
	}
	
	void sumOfLowerTriangle(int a[][]) {
		int sum=0;
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i>j) {
					sum=sum+a[i][j];
				}
			}
		}
		System.out.println("Sum of lower triangle is : "+sum);
	}
	
	
	void additionOfRow(int a[][]) {
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=0;j<a[i].length;j++) {
				sum=sum+a[i][j];
			}
			System.out.println("Addition of row element is "+sum);
		}
	}
	
	
	
	

	public static void main(String[] args) {
		Array2DExample arr = new Array2DExample();
//		arr.array2d();
		
		Scanner sc=new Scanner(System.in);
		int r=3;
		int c=3;
		int array[][]=new int[r][c];
		System.out.println("Enter the array elements : ");
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				array[i][j]=sc.nextInt();
			}
		}
		
		arr.sumOfDiagonal(array);
		arr.sumOfLowerTriangle(array);
		arr.sumOfUpperTriangle(array);
		
		

	}

}
