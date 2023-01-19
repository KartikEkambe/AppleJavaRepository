package accessModfiers2;
import accessModifiers.Test1;
public class Test4 extends Test1{
	
	public static void main(String[] args) {
		Test4 t1=new Test4();
//		System.out.println(t1.a);  // default
//		System.out.println(t1.b);	//private
		System.out.println(t1.c);
		System.out.println(t1.d);
	}

}
