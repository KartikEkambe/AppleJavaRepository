package constructor;

public class ChainingConstructorEx {
	
	ChainingConstructorEx(){
		this(10); //Constructor call should be the first statement
		System.out.println("In simple constructor");
//		this(10);
	}
	
	ChainingConstructorEx(int x){
		this(10,20);
		System.out.println("In one parameter constructor");
	}
	
	ChainingConstructorEx(int x, int y){
		this(11,22,33);
		System.out.println("In two parameter constructor");
	}
	
	ChainingConstructorEx(int x, int y,int z){
//		this();
		System.out.println("In three parameter constructor");
	}
	

}
