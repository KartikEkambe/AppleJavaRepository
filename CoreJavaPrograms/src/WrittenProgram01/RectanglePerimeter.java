package WrittenProgram01;

import java.util.Scanner;

public class RectanglePerimeter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float length, breadth, perimeter = 0;
		System.out.println("Enter length of reactangle");
		length = sc.nextFloat();
		System.out.println("Enter a breadth of rectangle");
		breadth = sc.nextFloat();

		perimeter = (length + breadth) * 2;

		System.out.println("Perimeter of rectangle is : " + perimeter);
		sc.close();

	}

}
