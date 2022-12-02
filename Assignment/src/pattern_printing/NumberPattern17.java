package pattern_printing;

public class NumberPattern17 {

	public static void main(String[] args) {
		int rows=5;
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(1);
			}
			
			for(int k=1;k<=i;k++) {
				System.out.print(i);
			}
			System.out.println();
			
		}

	}

}
