package PatternPrinting;

public class Practice {

	public static void main(String[] args) {
		
		int alpha=64;
		
		for(int i=1;i<=5;i++) {
			for(int s=i-1;s>0;s--) {
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--) {
				System.out.print((char)(j+alpha));
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			for(int s=i;s>0;s--) {
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		for(int i=5;i>0;i--) {
			for(int s=i;s<=5;s++) {
				System.out.print(" ");
			}
			
			for(int j=i;j>0;j--) {
				System.out.print(j);
			}
			System.out.println();
			
		}
		

	}

}
