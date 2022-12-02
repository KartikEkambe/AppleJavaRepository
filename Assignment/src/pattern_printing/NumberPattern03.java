package pattern_printing;

public class NumberPattern03 {

	public static void main(String[] args) {
		int row=9, x=0;;
		for(int i=1;i<=row;i++) {
			
			for(int j=1;j<=i+x;j++) {
				System.out.print(j);
			}
			System.out.println("");
		}

	}

}
