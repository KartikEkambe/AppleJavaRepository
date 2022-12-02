package writtenprograms03;

import java.util.Scanner;

public class Box {
	void volume(float length, float width, float height) {

		float volume = length * width * height;

		System.out.println("Volume of box is : " + volume);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length , width and height of box respectively ");
		int l = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();

		Box b = new Box();
		b.volume(l, w, h);

	}

}
