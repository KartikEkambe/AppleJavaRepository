package corejava;

import java.util.Scanner;

public class AreaOfReactangle {

	public static void main(String[] args) {
		float width, height;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a width");
		width = sc.nextFloat();
		System.out.println("Enter a height");
		height = sc.nextFloat();
		float area = width * height;
		System.out.println("Area of Rectangle = " + area);
		sc.close();

	}

}
