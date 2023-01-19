package accessModifiers;

public class Test3 {

	public static void main(String[] args) {
		Test1 t1=new Test1();
		System.out.println(t1.a);
//		System.out.println(t1.b);	//private
		System.out.println(t1.c);
		System.out.println(t1.d);

	}

}
