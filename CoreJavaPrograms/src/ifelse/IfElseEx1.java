package ifelse;

import java.util.*;

public class IfElseEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float num;
		System.out.println("Enter a number");
		num = sc.nextFloat();
		if (num % 3 == 0) {
			System.out.println("Divisible by 3");
		} else {
			System.out.println("Not divisible by 3");
		}
		
		sc.close();

	}

}
