package pattern_printing;

public class LeftTrianglePattern {

	public static void main(String[] args) {
		int row=6;
		for(int i=1;i<=row;i++) {
			
			for(int j=2*(row-i);j>0;j--) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
