package while_dowhile;

import java.util.Scanner;

public class ReverseNumberWhileLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,rev=0,rem,temp;
		System.out.println("Enter a number");
		num=sc.nextInt();
		temp=num;
		
		while(num!=0) {
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
			
		}
		System.out.println(temp+" Reverse of this number is = "+rev);
		
		sc.close();
		

	}

}
