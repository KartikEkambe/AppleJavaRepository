package while_dowhile;

import java.util.Scanner;

public class WhileNumberEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1, limit;
		System.out.println("Enter a limit");
		limit = sc.nextInt();
		while (i <= limit) {
			System.out.println(i);
			i++;
		}
		
		sc.close();

	}

}
