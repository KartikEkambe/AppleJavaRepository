package WrittenProgram02;

public class PrimeNumbers {

	public static void main(String[] args) {
		int s=300,e=400,cnt;
		
//		for(int i=s;i<=e;i++) {
//			cnt=0;
//			
//			for(int j=1;j<=i;j++) {
//				if(i%j==0) {
//					cnt++;
//				}
//			}
//			
//			if(cnt==2) {
//				System.out.println(i);
//			}
//			
//		}
		
		for(int n=s;n<=e;n++) {
			
			cnt=0;
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					cnt++;
				}
			}
			if(cnt==2) {
				System.out.println(n);
			}
			
		}
		
		
		
	}

}
