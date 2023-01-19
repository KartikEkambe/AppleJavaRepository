package arrayAssignment;

public class Average {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70};
		int sum=0;
		int length=arr.length;
		for(int i=0;i<arr.length;i++) {
			 sum=sum+arr[i];
		}
		
		int average=sum/length;
		
		System.out.println("Average of array is : "+average);

	}

}
