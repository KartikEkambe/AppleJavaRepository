package variableanddata;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {

		float area, radius;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a radius of circle");
		radius = sc.nextFloat();
		area = 3.14f * (radius * radius);
		System.out.println("area of circle is = " + area);
		sc.close();

	}

}
