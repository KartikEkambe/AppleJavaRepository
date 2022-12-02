package pattern_printing;

public class NumberPattern14 {

	public static void main(String[] args) {
		int n=9;
		for(int i=n;i>=1;i--) {
			
			for(int k=n-i;k>0;k--) {
				System.out.print(" ");
			}
			
			for(int x=1;x<=i;x++) {
				System.out.print(x);
			}
			for(int y=i-1;y>0;y--) {
				System.out.print(y);
			}
			System.out.println();
		}

	}

}
