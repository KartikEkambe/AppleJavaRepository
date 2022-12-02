package writtenprograms03;
import java.util.Scanner;

public class Patterns {

	void starpattern(int row) {
		for (int i = 1; i <= row; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void numpattern(int num) {
		for(int i=1;i<=num;i++) {
			
			if(i%2==0) {
				for(int j=1;j<=i;j++) {
					System.out.print(1);
				}
			}
			else {
				for(int j=1;j<=i;j++) {
					System.out.print(0);
				}
				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Patterns p=new Patterns();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int r=sc.nextInt();
		p.starpattern(r);
		System.out.println("enter the number");
		int n=sc.nextInt();
		p.numpattern(n);

	}

}
