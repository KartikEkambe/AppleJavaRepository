package CoreJavaInterviewPrograms;

public class FibonassiSeries {

	public static void main(String[] args) {
		
		int a=0,b=1;
		for(int i=0;i<=10;i++) {
			System.out.print(a+" ");
			b=a+b;
			a=b-a;
		}



	}

}
