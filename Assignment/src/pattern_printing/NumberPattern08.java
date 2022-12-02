package pattern_printing;

public class NumberPattern08 {

	public static void main(String[] args) {
		
		int no = 5;

		for (int p = 1; p <= no; p++)

		{
			System.out.print("*");

			for (int m = 1; m <= p; m++) {
				System.out.print(m);
			}
			for (int y = p - 1; y >= 1; y--) {
				System.out.print(y);
			}
			System.out.print("*");
			System.out.println();
		}
		
		for (int p = no; p >= 1; p--)

		{
			System.out.print("*");

			for (int m = 1; m <= p; m++) {
				System.out.print(m);
			}
			for (int y = p - 1; y >= 1; y--) {
				System.out.print(y);
			}
			System.out.print("*");
			System.out.println();
		}

	}

}
