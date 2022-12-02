package forloop;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,temp,cnt=0,sum=0;
		System.out.println("Enter a number");
		num=sc.nextInt();
		temp=num;
		
		while(temp!=0) {
			cnt++;
			temp=temp/10;
			
		}
		
		
//		System.out.println(cnt);
		
		temp=num;
		while(temp!=0) {
			int power=1;
			int r=temp%10;
			for(int i=1;i<=cnt;i++) {
				power=power*r;
			}
			sum=sum+power;
			temp=temp/10;
					
		}
		
		if(num==sum) 
			System.out.println("Armstrong Number");
		
		else
			System.out.println("Not a Armstrong number");
		sc.close();
		
		

	}

}
