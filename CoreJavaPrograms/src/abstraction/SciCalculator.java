package abstraction;

import java.util.Scanner;

public class SciCalculator extends CalculatorMethod{
	
void power() {
	Scanner sc=new Scanner(System.in);
	int base,power,result=1;
	System.out.println("Enter a base");
	base=sc.nextInt();
	System.out.println("Enter a power");
	power=sc.nextInt();
	
	for(int i=1;i<=power;i++) {
		result=result*base;	
	}
	System.out.println(base+" : Power is : "+result);
}

void sqrt(int a) {
	
	System.out.println("Square Root is : "+Math.sqrt(a));
	
	
}
void square(int a) {
	System.out.println("Square is : "+(a*a));
}





}
