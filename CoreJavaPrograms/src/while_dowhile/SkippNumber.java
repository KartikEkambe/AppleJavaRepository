package while_dowhile;

import java.util.Scanner;

public class SkippNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

//		while(num<=10)
//		{
//			if(num!=6)
//				System.out.println(num);
//			num++;
//		}

		while (num <= 10) {
			num++;
			if (num == 6)
				continue;
			System.out.println(num);
		}


		

//		while (num <= 10) {                        
//			num++;
//			if (num %6==0)
//				break;         
//			System.out.println(num);
//		}

		sc.close();
	}

}
