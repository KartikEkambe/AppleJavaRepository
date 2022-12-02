package pattern_printing;

public class NumberPattern01 {

	public static void main(String[] args) {
		int row=5;
		
		//Upper Half
		for(int i=1;i<=row;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		//Lower Half
		
		for(int i=row-1;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
