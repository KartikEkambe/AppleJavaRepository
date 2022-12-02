package pattern_printing;

public class NumberPattern10 {

	public static void main(String[] args) {
		int row=7;
		for(int i=1;i<=row;i++) {
			
			for(int k=row-i;k>0;k--) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
				
			}
			System.out.println();
		}

	}

}
