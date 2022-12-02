package polymorphism;

public class Addition {
	
	void add(int a,int b) {
		System.out.println("Addition is : "+(a+b));
	}
	void add(String a ,String b) {
		System.out.println("Addition Two string is : "+(a+b));
	}
	void add(int a,String b) {
		System.out.println("addition of  int and String is : "+(a+b));
	}
	
	void add(String a,int b) {
		System.out.println("Addition of string and int is : "+(a+b));
	}

	public static void main(String[] args) {
		Addition a =new Addition();
		a.add(10, 10);
		a.add(12, " VP");
		a.add("VP ", 90);
		a.add("Vaibhav ", " Patil");

	}

}
