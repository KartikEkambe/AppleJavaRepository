package classandobjects;

import java.util.Scanner;

public class Interest {
	void simpleinterest(float p, float r, float t) {
		float interest = (p * r * t) / 100;
		System.out.println("Simple interest is : " + interest);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p, r, t;
		System.out.println("Enter the amount");
		p = sc.nextInt();
		System.out.println("Enter the rate of interest");
		r = sc.nextInt();
		System.out.println("enter the duration");
		t = sc.nextInt();

		Interest i = new Interest();
		i.simpleinterest(p, r, t);

	}

}
