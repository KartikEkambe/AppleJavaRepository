package arrayAssignment;

public class MissingNumber {
	
	void missingNum(int arr[]) {
		int j=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=j) {
				System.out.println(j);
				j++;
			}
			
				j++;
		}
	}
	
	void missNum(int arr[]) {
		
		//This method is used when numbers is missing sequentially
		int cnt=0;
		int len=arr.length;
		for(int i=arr[0];i<arr[len-1];i++) {
			if(arr[cnt]==i) {
				cnt++;
			}
			else {
				System.out.println(i);
			}
		}
		
	}

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,5,9,10};
		MissingNumber m=new MissingNumber();
//		m.missingNum(arr);
		m.missNum(arr);


	}

}
