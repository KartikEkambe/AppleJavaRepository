package while_dowhile;

import java.util.Scanner;

public class TableUsingDoWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,i=1;
		System.out.println("Enter a  number");
		num=sc.nextInt();
		do {
			System.out.println(num*i);
			i++;
		}while(i<=10);
		sc.close();
		
		

	}

}
