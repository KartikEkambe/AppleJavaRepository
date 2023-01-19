package arrayAssignment;

public class MissNumber {

	public static void main(String[] args) {
		int arr[]= {1, 2, 3, 4, 6, 7};
		int len=arr.length;
		
		int cnt=0;
		
		for(int i=arr[0];i<arr[len-1];i++) {
			if(arr[cnt]==i) {
				cnt++;
			}else {
				System.out.println(i);
			}
		}

	}

}
