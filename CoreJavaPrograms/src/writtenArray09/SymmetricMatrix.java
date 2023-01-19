package writtenArray09;

import java.util.Scanner;

public class SymmetricMatrix {
	void symmetricMatrix(int arr[][],int row,int col) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		int transpose[][]=new int[row][col];
		
		for(int i=0;i<transpose.length;i++) {
			for(int j=0;j<transpose[i].length;j++) {
				transpose[i][j]=arr[j][i];
				
			}
		}
		
		int flag=1;
		if(row==col) {
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					if(arr[i][j]!=transpose[i][j]) {
						flag=0;
						break;
					}
				}
			}
			
			if(flag==1) {
				System.out.println("Matrix is symmetric ");
			}else {
				System.out.println("Matrix is not symmetric ");
			}
			
		}else {
			System.out.println("Matrix is not symmetric");
		}
		
	
		
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=3,c=3;
		
		int arr[][]= {{6,5,2},{5,0,9},{2,9,3}};
		
//		int arr[][]=new int [r][c];
//		System.out.println("Enter elements in array ");
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j]=sc.nextInt();
//			}
//		}
//		
		SymmetricMatrix sm=new SymmetricMatrix(); 
		sm.symmetricMatrix(arr, r, c);

	}

}
