package forloop;

import java.util.Scanner;

public class PracticeFor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//14367
		
		int num,cnt=0,temp,rem;
		int flag=0;
		System.out.println("Enter a number");
		num=sc.nextInt();


//		for(int i=2;i<=num;i++) {
//			if(num%i==0) {
//				cnt++;
//				break;
//			}
//		}
//		if(cnt==0) {
//			System.out.println("prime");
//		}
//		else {
//			System.out.println("Not prime");
//		}
		temp=num;
		while(temp!=0) {
			rem=temp%10;
			for(int i=2;i<rem;i++) {
				if(rem%i==0) {
					flag=1;
				}
			}
			if(flag==0) {
				System.out.println(rem);
			}
			temp=temp/10;
		}
		
		
		
		
		



		}
	



}