package arrayAssignment;

public class AddPrintValues {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				sum=arr[i]+arr[j];
				if(sum==10) {
					System.out.println(arr[i]+" "+arr[j]);
				}
				
//				if(arr[i]+arr[j]==10) {
//					System.out.println(arr[i]+" "+arr[j]);
//				}
			}
		}

	}

}
