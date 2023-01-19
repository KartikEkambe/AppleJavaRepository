package arrayAssignment;

public class AverageM {
	
	public static int average(int []array) {
		int length=array.length;
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		int averageOfArray=sum/length;
		return averageOfArray;
	}
	
	public static double average(double []array) {
		double length=array.length;
		double sum=0;
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		double averageOfArray=sum/length;
		return averageOfArray;
	}
	
	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,4,5,6};
		double arr2[]= {6.0,3.4,6.4,1.2,4.0};
		System.out.println( "Average of int array is : "+AverageM.average(arr1));
		System.out.println("Average of double array is : "+AverageM.average(arr2));
		
	}

}
