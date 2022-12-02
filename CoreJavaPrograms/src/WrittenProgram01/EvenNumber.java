package WrittenProgram01;

public class EvenNumber {

	public static void main(String[] args) {
		int num1 = 121, num2 = 229;

		while (num1 <= num2) {
			if (num1 % 2 == 0)
				System.out.println("Even number is :" + num1);
			num1++; 
		}

	}

}
