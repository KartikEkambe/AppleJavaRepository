package writtenObject_Classes04;

import java.util.Scanner;

public class Box {
	
	int calculate(int length,int width,int height) {
		int volume=length*width*height;
		return volume;
	}
	
	void display(int volume){
		System.out.println("Volume of box is : "+volume);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int l,w,h;
		System.out.println("Enter the length, width, heigth of box");
		l=sc.nextInt();
		w=sc.nextInt();
		h=sc.nextInt();
		
		Box b=new Box();
//		b.calculate(l, w, h);
		
		int volume=b.calculate(l, w, h);
		b.display(volume);

	}

}
