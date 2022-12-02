package pattern_printing;

public class NumberPattern16 {

	public static void main(String[] args) {

		int row = 5;
		for (int i = 1; i <= row; i++) {
			for (int s = 1; s <= i; s++) {
				System.out.print(" ");
			}
			for (int j = i; j <= row; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		for (int i = row - 1; i > 0; i--) {
			for (int s = 1; s <= i; s++) {
				System.out.print(" ");
			}
			for (int j = i; j <= row; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
