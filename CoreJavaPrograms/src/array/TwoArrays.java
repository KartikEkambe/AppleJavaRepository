package array;

public class TwoArrays {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};
		int b[]= {10,20,30,40,50};
		
		int cnt=0;
		
		if(a.length==b.length) {
			for(int i=0;i<a.length && i<b.length;i++) {
				if(a[i]!=b[i]) {
					cnt++;
				}
			}
			
		}
		
		if(cnt==0) {
			System.out.println("Array are equal");
		}
		else {
			System.out.println("Array are not equal");
		}
		
		
		


		
		

	}

}
