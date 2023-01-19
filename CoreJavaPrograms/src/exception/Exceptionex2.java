package exception;

import java.util.Scanner;

public class Exceptionex2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int arr[]= {10,20,30,40,50};
		try {
		
		System.out.println("enter a number");
		arr[10]=sc.nextInt();
		}
		catch(ArrayIndexOutOfBoundsException a) {
//			System.out.println(a);
			a.printStackTrace();
		}
		
		for(int a:arr) {
			System.out.print(a+" ");
		}

	}

}
