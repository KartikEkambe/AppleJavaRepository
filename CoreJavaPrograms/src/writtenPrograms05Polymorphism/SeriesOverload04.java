package writtenPrograms05Polymorphism;

public class SeriesOverload04 {

	double series(double n) {
		double sum = 0;
		for (int i = 1; i <= n; i++) {
			double term = 1.0 / i;
			sum = sum + term;
		}
		return sum;
	}

	double series(double a, double n) {
		double sum = 0;
		int x = 1;
		for (int i = 1; i <= n; i++) {
			int e = x + 1;
			double term = x / Math.pow(a, e);
			sum = sum + term;
			x = x + 3;
		}

		return sum;
	}

	public static void main(String[] args) {
		SeriesOverload04 s = new SeriesOverload04();

		System.out.println("Sum of Series one : "+s.series(5));
		System.out.println("Sum of Series two : "+s.series(3, 8));
	}

}
