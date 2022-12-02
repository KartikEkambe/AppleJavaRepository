package classandobjects;

import java.util.Scanner;

public class Car {

	String name, mode, color;
	int speed, price;

	void setData() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the car name,price,speed,color and mode");
		name = sc.next();
		price = sc.nextInt();
		speed = sc.nextInt();
		color = sc.next();
		mode = sc.next();

	}

	void discount() {
		float discount;

		if (mode.equalsIgnoreCase("Online")) {
			System.out.println(" The discount is " + (discount = price * 0.07f));
			System.out.println("After applying discount price is " + (price - discount));

		} else {
			System.out.println("Please pay online to get discount" + price * 0.07f);
			System.out.println("The price is " + price);
		}
	}

	void display() {

		System.out.println(name + " " + price + " " + speed + " " + color + " " + mode);

	}

	public static void main(String[] args) {

		Car c = new Car();
		Car c1 = new Car();

//		c.setData();
//		c.discount();
//		c.display();
		System.out.println(c);
		System.out.println(c1);

		

	}

}
