package PatternPrinting;

import java.util.Scanner;

public class PatternPractice {

	public static void main(String[] args) {
		
		int num=17,count=0;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++;
				break;
			}
		}
		
		if(count==0) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not a prime");
		}
		


		
	

	}

}
