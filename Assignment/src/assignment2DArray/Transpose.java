package assignment2DArray;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int r=3,c=2;
		int arr[][]=new int[r][c];
		System.out.println("Enter elements in array");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		int trans[][]=new int[c][r];
		for(int i=0;i<trans.length;i++) {
			for(int j=0;j<trans[i].length;j++) {
				trans[i][j]=arr[j][i];
			}
		}
		
		for(int i=0;i<trans.length;i++) {
			for(int j=0;j<trans[i].length;j++) {
				System.out.print(trans[i][j]+" ");
			}
			System.out.println();
		}


	}

}
