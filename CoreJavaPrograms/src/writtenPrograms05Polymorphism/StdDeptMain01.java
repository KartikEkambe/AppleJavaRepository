package writtenPrograms05Polymorphism;

public class StdDeptMain01 {

	public static void main(String[] args) {
		Department01 d=new Department01(101, "Computer");
		
		Student01 std=new Student01(47, "Vaibhav", d);
		
		System.out.println(std);


	}

}
