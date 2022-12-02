package classandobjects;

import java.util.Scanner;

public class Shopping {

	// create a shopping class which contain purchase item name, price that item and
	// quantity create first method to accept detail for shopping create second
	// method to calculate the bill and create a third method to display shopping
	// detail with bill;

	String item_name;
	int price, quantity, total_bill;

	void acceptDetails(String name, int p, int quant) {
		item_name = name;
		price = p;
		quantity = quant;

	}

	void calculate() {
		
		if(quantity >0) {
			
			total_bill = price * quantity;
		}


		
	}

	void show() {
		if(quantity >0) {

		System.out.println("Item Name : " + item_name);
		System.out.println("Price : " + price);
		System.out.println("Quantity : " + quantity);
		System.out.println("Total Bill : " + total_bill);
		}
		else {
			System.out.println("Error ?? please purchase the items");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String n;
		int p, q;
		System.out.println("Enter item name");
		n = sc.nextLine();
		System.out.println("Enter price");
		p = sc.nextInt();
		System.out.println("Enter quantity");
		q = sc.nextInt();

		Shopping s = new Shopping();

		s.acceptDetails(n, p, q);
		s.calculate();
		s.show();

	}

}
