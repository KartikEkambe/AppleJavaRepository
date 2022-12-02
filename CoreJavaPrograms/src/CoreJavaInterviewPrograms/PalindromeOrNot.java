package CoreJavaInterviewPrograms;

import java.util.Scanner;

public class PalindromeOrNot {
	Scanner sc=new Scanner(System.in);
	void ForNumber() {
		int num,check=0,rem,temp;
		System.out.println("enter a number");
		num=sc.nextInt();
		temp=num;
		while(num!=0) {
			rem=num%10;
			check=(check*10)+rem;
			num=num/10;
			
		}
		if(temp==check) {
			System.out.println("Given Number is a palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
		
	}
	
	public static void main(String []args) {
		PalindromeOrNot p=new PalindromeOrNot();
		p.ForNumber();
	}

}
