package arrayAssignment;

public class SquareRoot {

	public static void main(String[] args) {
		int a[]= {4,9,18,35,81,100,124,145};
		
		for(int i=0;i<a.length;i++) {
		
			double sqrt=Math.sqrt(a[i]);
			int sqroot=(int)(sqrt);
			
			if(sqrt==sqroot) {
				System.out.println(a[i]);
			}
			
//			if(sqrt==Math.floor(sqrt)) {
//				System.out.println(a[i]);
//			}
		}

	}

}
