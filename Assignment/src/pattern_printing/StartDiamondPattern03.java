package pattern_printing;

public class StartDiamondPattern03 {

	public static void main(String[] args) {
		int row = 5;
		for (int i = 1; i <= row; i++) {
			for (int s = row - i; s > 0; s--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = row-1; i > 0; i--) {
			for (int s = row - i; s > 0; s--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
