package assignment2DArray;

public class Sum {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{5,8,13},{21,34,55}};
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr[i].length;j++) {
				 sum=sum+arr[i][j];
				
			}
			System.out.println("Sum : "+sum);
		}

	}

}
