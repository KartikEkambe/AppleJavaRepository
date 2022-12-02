package forloop;

import java.util.Scanner;

public class ReverseNumberAndString {
	
	Scanner sc=new Scanner(System.in);
	
	void ReverseNummber() {
		int num,rev=0,rem;
		System.out.println("Enter a number");
		num=sc.nextInt();
		for(;num!=0;num=num/10){
			rem=num%10;
			rev=(rev*10)+rem;	
			
		}
		
		System.out.println("Reverse of given number is = "+rev);
		
		
	}
	
	void ReverseString() {
		String str,rev="";
		System.out.println("Enter a string");
		str=sc.nextLine();
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse of given string is : "+rev);
	}
	
	public static void main(String[] args) {
		ReverseNumberAndString r=new ReverseNumberAndString();
//		r.ReverseNummber();
		r.ReverseString();

	}

}
