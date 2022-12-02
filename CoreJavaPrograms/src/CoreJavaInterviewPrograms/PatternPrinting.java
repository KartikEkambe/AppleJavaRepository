package CoreJavaInterviewPrograms;

public class PatternPrinting {

	public void RightTriangle() {
		int row = 6;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	public void LeftTriangle() {
		int row = 6;
		for (int i = 0; i < row; i++) {

			for (int j = 2 * (row - i); j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		PatternPrinting p = new PatternPrinting();
//		p.RightTriangle();
		p.LeftTriangle();

	}

}
