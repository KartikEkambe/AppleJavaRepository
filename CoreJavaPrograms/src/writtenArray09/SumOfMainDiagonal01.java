package writtenArray09;

public class SumOfMainDiagonal01 {
	void sum(){
		
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==j) {
					sum=sum+arr[i][j];
				}
//				System.out.print(arr[i][j]+" ");
			}
		}
		System.out.println(sum);
	}
	

	public static void main(String[] args) {
		SumOfMainDiagonal01 s=new SumOfMainDiagonal01();
		s.sum();

	}

}
