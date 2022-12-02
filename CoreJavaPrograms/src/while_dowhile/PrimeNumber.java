package while_dowhile;

import java.util.Scanner;

public class PrimeNumber {
	Scanner sc=new Scanner(System.in);

	void PrimeOrNot() {
		int num,cnt=0,i=2;
		System.out.println("Enter a number");
		num=sc.nextInt();
		int mid=num/2;
		
		while(i<=mid) {
			if(num%i==0) {
				cnt++;
				break;
			}
			i++;
		}
		
		if(cnt==0) {
			System.out.println("Its prime Number");
		}
		else {
			System.out.println("Not a prime Number");
		}
		
		
	
	}

	public static void main(String[] args) {
		PrimeNumber p=new PrimeNumber();
		p.PrimeOrNot();
		

	}

}
