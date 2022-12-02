package forloop;

public class NumPattern05 {
	public static void main(String[] args) {
		int n = 1;
		for (int i = 1; i <= 6; i++) {
			System.out.print(n + " ");
			n = n + (4 * i);
		}

	}

}
