package forloop;

public class FibonacciPattern02 {

	public static void main(String[] args) {
int a=0,b=1,sum=1;
		
		for(int i=1;i<=4;i++) {
			if(i==1) {
				System.out.println("0 ");
			}
			System.out.print("0 ");
			
			
			for(int j=1;j<=i;j++) {
				
				
				
				System.out.print(sum +" ");
				sum=a+b;
				a=b;
				b=sum;
			}
			System.out.println("");
		}
		

	}

}
