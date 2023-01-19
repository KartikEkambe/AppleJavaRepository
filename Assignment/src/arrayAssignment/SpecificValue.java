package arrayAssignment;

public class SpecificValue {

	public static void main(String[] args) {
		int a[]= {0,1,2,3,5,8,13,21,34,55};
		
		int value=34;
		int cnt=0;
		for(int i=0;i<a.length;i++) {
			if(value==a[i]) {
				cnt++;
			}
			
			}
		
		if(cnt!=0) {
			System.out.println("Value present in array");
		}
		else {
			System.out.println("Value not present in array");
		}
		
		
		
		}
		

	}


