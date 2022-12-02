package pattern_printing;

public class AlphabetPattern03 {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++) {
			int alphabet=65;
			for(int j=5;j>=i;j--) {
				System.out.print((char)(alphabet+j)+" ");
			}
			System.out.println();
		}

	}

}
