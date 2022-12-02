package forloop;

public class PyramidNumber {

	public static void main(String[] args) {
		
		int n=9;
		
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			
			for(int y=i;y<=n-1;y++) {
				System.out.print(y);
			}
			
			for(int x=n;x>=i;x--) {
				System.out.print(x);
				
			}
			System.out.println();
			
			
		}



	}

}
