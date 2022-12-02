package variableanddata;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		float base, height;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a base value");
		base = sc.nextFloat();
		System.out.println("enter heights value ");
		height = sc.nextFloat();

		float area = 0.5f * (base * height);

		System.out.println("Area Of Triangle = " + area);
		sc.close();

	}

}
