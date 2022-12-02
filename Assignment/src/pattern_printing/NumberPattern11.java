package pattern_printing;

public class NumberPattern11 {
	public static void main(String[] args) {
		int row = 4, x = 0;

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i + x; j++) {
				System.out.print(j);
			}
			x++;
			System.out.println();

		}

		for (int i = row - 1; i > 0; i--) {

			for (int j = 1; j <= i + x - 2; j++) {

				System.out.print(j);
			}
			x--;
			System.out.println();

		}
	}

}
