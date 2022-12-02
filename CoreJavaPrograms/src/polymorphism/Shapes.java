package polymorphism;

public class Shapes {
	void area(int s) {
		System.out.println("Area of square is : "+(s*s));
	}
	
	void area(float base,float height) {
		float area=(base*height)/2;
		System.out.println("Area of  Triangle is : "+area);
	}

	void area(float r) {
		float pi=3.14f,area;
		area=pi*r*r;
		System.out.println("Area of Circle is : "+area);
		
	}
	
	void area(int height,int width) {
		int area=height*width;
		System.out.println("Area of Rectangle is : "+area);
	}
	public static void main(String[] args) {
		Shapes s=new Shapes();
		s.area(12);
		s.area(7);
		s.area(21, 17);
		s.area(12, 12);

	}

}
