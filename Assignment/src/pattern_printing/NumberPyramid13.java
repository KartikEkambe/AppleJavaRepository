package pattern_printing;

public class NumberPyramid13 {

	public static void main(String[] args) {
		int n = 9;
		for (int i = 1; i <= n; i++) {
			for (int k = n - i; k > 0; k--) {
				System.out.print(" ");
			}

			for (int x = 1; x <= i; x++) {
				System.out.print(x);

			}
			for (int y = i-1; y >=1 ; y--) {
				System.out.print(y);
			}

			System.out.println();
		}
		
		

	}

}
