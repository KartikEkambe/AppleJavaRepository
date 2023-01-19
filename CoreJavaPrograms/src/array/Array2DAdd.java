package array;

public class Array2DAdd {

	public static void main(String[] args) {

		int a[][] = { { 10, 20, 30 }, { 30, 40, 50 }, { 50, 60, 70 } };
		int b[][] = { { 4, 8, 12 }, { 12, 16, 20 }, { 20, 24, 28 } };
		int c[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}

}
