package inheritance;

public class StuDeptMain {

	public static void main(String[] args) {
		Department d=new Department(101, "Computer");
		
		Student s=new Student();
		s.setRollno(111);
		s.setName("Kartik");
		s.setDept(d);
		
		System.out.println(s);

	}

}
