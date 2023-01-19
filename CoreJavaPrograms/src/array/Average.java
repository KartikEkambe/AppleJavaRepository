package array;

public class Average {
	void average(float arr)
	{
		
	}
	public static void main(String[] args) {
		float arr[]= {12f,13.4f,14.5f,16.7f};
		float length=arr.length;
		float sum=0;
		
		for(int i=0;i<length;i++) {
			sum=sum+arr[i];
		}
		
		float average=sum/length;
		
		System.out.println("Average is : "+average);

	}

}
