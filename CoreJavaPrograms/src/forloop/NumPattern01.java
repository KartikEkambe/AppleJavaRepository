package forloop;

public class NumPattern01 {

	public static void main(String[] args) {
		int row = 5,x=0;

		for (int i = 1; i <= row; i++) {

			for (int j = 1; j <= i+x; j++) {
				System.out.print(j+" ");
			}
			x=x+1;
			System.out.println("");
		}

	}

}
