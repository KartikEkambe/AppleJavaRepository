package pattern_printing;

public class NumberPattern07 {

	public static void main(String[] args) {
//		int n=1;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(" ");
//			}
//			
//			for(int y=i;y<=n;y++) {
//				System.out.print(y);
//			}
//			System.out.println();

		int no = 5;

		for (int p = 1; p <= no; p++)

		{

			for (int m = 1; m <= p; m++) {
				System.out.print(m);
			}
			for (int y = p - 1; y >= 1; y--) {
				System.out.print(y);
			}
			System.out.println();
		}
		
//		for (int p = no; p >= 1; p--)
//
//		{
//
//			for (int m = 1; m <= p; m++) {
//				System.out.print(m);
//			}
//			for (int y = p - 1; y >= 1; y--) {
//				System.out.print(y);
//			}
//			System.out.println();
//		}

	}
}
