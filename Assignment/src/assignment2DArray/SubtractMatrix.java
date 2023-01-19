package assignment2DArray;

public class SubtractMatrix {

	public static void main(String[] args) {
		int a[][]= {{3,6,9},{9,12,15},{15,18,21}};
		int b[][]= {{1,2,3},{3,4,5},{5,6,7}};
		
		int c[][]=new int[3][3];
		
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				c[i][j]=a[i][j]-b[i][j];
			}
		}
		
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
