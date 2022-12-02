package CoreJavaInterviewPrograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num,result=0,rem,temp;
		System.out.println("Enter a number");
		num=sc.nextInt();
		temp=num;
		while(num!=0) {
			rem=num%10;
			result+= Math.pow(rem, 3);
			num=num/10;
			
		}
		
		if(temp==result) {
			System.out.println("Given number is armstrong number");
		}
		else {
			System.out.println("Not a armstrong number");
		}
		

	}

}
