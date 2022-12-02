package corejava;

import java.util.Scanner;

public class SumOfFactors {
	
	void factor(int num) {
		int sum=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				
				sum=sum+i;
			}
		}
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		SumOfFactors s=new SumOfFactors();
		s.factor(n);

	}

}
