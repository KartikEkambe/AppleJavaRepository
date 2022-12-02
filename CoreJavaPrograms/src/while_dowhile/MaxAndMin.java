package while_dowhile;

import java.util.Scanner;

public class MaxAndMin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,rem;
		System.out.println("Enter  a numbers");
		num=sc.nextInt();
		
		int min=num%10;
		int max=num%10;
		
		while(num!=0) {
			
			rem=num%10;
			
			if(rem<min) {
				min=rem;
			}
			
			if(rem>max) {
				max=rem;
			}
			
			num=num/10;
		}
		
		System.out.println("Minimum value is = "+min);
		System.out.println("Maximum value is = "+max);
		
		sc.close();

	}

}
