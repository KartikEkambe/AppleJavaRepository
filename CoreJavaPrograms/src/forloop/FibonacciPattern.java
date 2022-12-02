package forloop;

public class FibonacciPattern {

	public static void main(String[] args) {
		int a=0,b=1,sum=1;
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
//				if(i==1 && j==1) {
//					System.out.print("0");
//					continue;
//				}
				
				System.out.print(a +" ");
				sum=a+b;
				a=b;
				b=sum;
			}
			System.out.println("");
		}
		

	}

}
