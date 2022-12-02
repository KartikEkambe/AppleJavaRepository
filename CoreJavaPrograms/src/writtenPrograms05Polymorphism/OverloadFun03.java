package writtenPrograms05Polymorphism;

public class OverloadFun03 {
	
	void compare(int a,int b) {
		
		if(a>b) {
			System.out.println("Greater integer value is a = "+a);
		}
		else {
			System.out.println("Greater integer value is b = "+b);
		}
	}
	
	void compare(char a,char b) {
		int x=(int)a;
		int y=(int)b;
		if(x>y) {
			System.out.println("Greater numberic value is a = "+a);
		}
		else {
			System.out.println("Greater numberic value is b = "+b );
		}
	}
	
	

}
