package array;

import java.util.Scanner;

public class Transpose2DArray {
	
	void transpose(int a[][]) {
		int trans[][]=new int[2][3];
		for(int i=0;i<trans.length;i++) {
			for(int j=0;j<trans[i].length;j++) {
				
				
				trans[i][j]=a[j][i];
			}
		}
		
		for(int i=0;i<trans.length;i++) {
			for(int j=0;j<trans[i].length;j++) {
				System.out.print(trans[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	
	public static void main(String[] args) {
		Transpose2DArray arr=new Transpose2DArray();
		

		Scanner sc=new Scanner(System.in);
		int r=3;
		int c=2;
		int array[][]=new int[r][c];
		System.out.println("Enter the array elements : ");
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				array[i][j]=sc.nextInt();
			}
		}
		
		arr.transpose(array);
		
		
	}
	
	
	

}
