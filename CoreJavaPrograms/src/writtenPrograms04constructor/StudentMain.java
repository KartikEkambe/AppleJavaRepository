package writtenPrograms04constructor;

public class StudentMain {
	
public static void main(String[] args) {

		
		Student s=new Student(101, "Kiran");
//		System.out.println(s.id+" "+s.name);
		s.display();
		
		System.out.println("\n---------------************------------\n");
		Student s2=new Student(s);
//		System.out.println(s2.id+" "+s2.name);
		s2.display();


	}

}
