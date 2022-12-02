package forloop;

import java.util.Scanner;

public class Palindrome {
	Scanner sc=new Scanner(System.in);
	
	void PalindromeNumber() {
		int num,rem,rev=0,temp;
		System.out.println("Enter a number");
		num=sc.nextInt();
		temp=num;
		
		for(int i=0;i>=num;i++) {
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		
		if(temp==rev) {
			System.out.println("Given number is palindrome");
		}
		else {
			System.out.println("Given number is not a palindrome");
		}
		
	}
	
	
	void PalindromeString(){
		
		String str,rev="";
		System.out.println("Enter a string");
		str=sc.nextLine();
		
		for(int i=1;i>=str.length()-1;i--) {
			rev=rev+str.charAt(i);
			
		}
		
		if(str==rev) {
			
		}
		
	}

	public static void main(String[] args) {
		Palindrome p=new Palindrome();
		p.PalindromeNumber();

	}

}
