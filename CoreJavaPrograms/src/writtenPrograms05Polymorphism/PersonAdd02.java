package writtenPrograms05Polymorphism;

public class PersonAdd02 {

	public static void main(String[] args) {
		
		Address02  add=new Address02("Latur", "Maharashtra", "India");
		
		Person02 per=new Person02("Abhijit", "Male", 23, add);
		
		System.out.println(per);


	}

}
